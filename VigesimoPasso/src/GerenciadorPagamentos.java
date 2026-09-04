package sistema;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class GerenciadorPagamentos  {



    public void listarCliente() {
        String sql = "SELECT * FROM clientes";
        try (Connection conex = sistema.ConexaoBanco.obterConexao();
             PreparedStatement stmt = conex.prepareStatement(sql);
             ResultSet resultado = stmt.executeQuery()) {

            System.out.println("\n ==== LISTA DE CLIENTES(POSTGRESQL) ====");

            while (resultado.next()) {

                int id = resultado.getInt("id");
                String nome = resultado.getString("nome");
                String email = resultado.getString("email");

                System.out.println("ID: " + id + "| Nome: " + nome + " | Email: " + email);
            }
        } catch (SQLException e) {
            System.out.println("Falha a conectar-se ao banco. "+ e.getMessage());
        }
    }

        public void adicionarTransacao(sistema.Transacao transacao){
        String sql = "INSERT INTO transacoes (valor_original, forma_pagamento, valor_final, cliente_id)  VALUES (?,?,?,?)";
        try(Connection conex = sistema.ConexaoBanco.obterConexao();
            PreparedStatement stmt = conex.prepareStatement(sql)){

        stmt.setDouble(3,transacao.getValorFinal());
        stmt.setDouble(1, transacao.getValor());
        stmt.setString(2, transacao.getFormaPagamento());
        stmt.setInt(4, transacao.getCliente_id());
        int linhasAfetadas =stmt.executeUpdate();
        if (linhasAfetadas !=0){
            System.out.println("Transação Adicionada no Sistema");
            }
        }
        catch (SQLException e){
            System.out.println("Falha em conectar-se ao BANCO " + e.getMessage());
        }
    }

    public void busca(int codigoBusca){
        String sql = "SELECT transacoes.id, clientes.nome, transacoes.forma_pagamento, transacoes.valor_final FROM transacoes INNER JOIN clientes ON clientes.id = transacoes.cliente_id WHERE transacoes.id= ?";

        try (Connection conex = sistema.ConexaoBanco.obterConexao();
             PreparedStatement stmt = conex.prepareStatement(sql)){
            stmt.setInt(1,codigoBusca);
            ResultSet resultado = stmt.executeQuery();


            if (resultado.next()) {
                int id = resultado.getInt("id");
                String forma = resultado.getString("forma_pagamento");
                double valorFinal = resultado.getDouble("valor_final");
                String nome = resultado.getString("nome");
                System.out.println("ID: " + id + "| Nome: " + nome + " | Forma: " + forma + " | R$ " + valorFinal);
            }
            else {
                throw  new sistema.BuscaInvalidaException("Código não existe");
            }
            }
        catch (SQLException e ){
            System.out.println("Falha a se conectar ao banco " + e.getMessage());
        }
    }

    public void  remover(int codigoRemover){
        String sql = "DELETE FROM transacoes  WHERE id = ?";
        try(Connection conex = sistema.ConexaoBanco.obterConexao();
        PreparedStatement stmt = conex.prepareStatement(sql)){
            stmt.setInt(1,codigoRemover);
            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas== 0){
                throw  new sistema.BuscaInvalidaException("Código ID não existe");
            }
            else{
                System.out.println("Pagamento removido com sucesso");
            }
        }
        catch (SQLException e){
            System.out.println("Erro ao conectar-se ao banco " +e.getMessage());

        }

    }


    public void listar() {
        String sql = "SELECT transacoes.id, clientes.nome, transacoes.valor_original, transacoes.forma_pagamento, transacoes.valor_final FROM transacoes  INNER JOIN clientes ON transacoes.cliente_id=clientes.id";

        try (Connection conex = sistema.ConexaoBanco.obterConexao();
             PreparedStatement stmt = conex.prepareStatement(sql);
             ResultSet resultado = stmt.executeQuery()) {

            System.out.println("\n ==== LISTA DE TRANSAÇÕES(POSTGRESQL) ====");

            while (resultado.next()) {

                int id = resultado.getInt("id");
                double valor = resultado.getDouble("valor_original");
                String forma = resultado.getString("forma_pagamento");
                double valorFinal = resultado.getDouble("valor_final");
                String nome = resultado.getString("nome");
                System.out.println("ID: " + id + "| Nome: "+ nome+ " | Forma: " + forma + " | R$ " + valorFinal);

            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar transações do banco: " + e.getMessage());
        }

    }
}
