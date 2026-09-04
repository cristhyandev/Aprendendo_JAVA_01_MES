package rh;
import java.util.ArrayList;
import rh.Funcionario;
import rh.Desenvolvedor;
import rh.Gerente;


public class Gerenciadora {
    ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void contratarFuncionario(Funcionario f){
        funcionarios.add(f);
    }

    public void exibirFolha() {
        if (funcionarios.isEmpty()) {
            System.out.println("Folha de pagamento vazia!");
            return;
        }
            System.out.println(" ======= FOLHA DE PAGAMENTO ======");
            for (Funcionario funcionario : funcionarios) {
                System.out.print(funcionario.getId() + "- Nome: " + funcionario.getNome() + ", Salário: R$" + funcionario.calcularSalario() + ", ");
                if (funcionario instanceof Desenvolvedor desenvolvedor) {
                    System.out.println("Linguagens dominadas: " + desenvolvedor.getLinguagemDominada());
                }
                if (funcionario instanceof Gerente gerente) {
                    System.out.println("Gerente com bônus aplicado de : R$" + gerente.getBonusGestao());
                }
            }
        }


    public Funcionario buscarID(int codigo) {

        for (Funcionario f : funcionarios) {
            if (f.getId() == codigo) {
                return f;
            }
        }
        return null;
    }


    public void demitirFuncionario(int codigoRemover){
        Funcionario f = buscarID(codigoRemover);

        if (f!= null){
            funcionarios.remove(f);
            System.out.println("Funcionário " + f.getNome() + " demitido com sucesso!");
        }
        else {
            System.out.println("Erro: código do funcionário não encontrado.");
        }
    }



}
