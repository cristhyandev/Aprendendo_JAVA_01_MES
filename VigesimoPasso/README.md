# 📌 Passo 20: Persistência Relacional com PostgreSQL e JDBC Puro (`VigesimoPasso`)

## 📝 O que o código faz
Este é o projeto ápice da jornada, conectando todo o ecossistema de regras de negócio em Java a um banco de dados relacional **PostgreSQL**:
1. Gerencia conexões seguras com o banco de dados PostgreSQL através de `ConexaoBanco`.
2. Realiza o ciclo de vida completo de transações e pagamentos de forma persistente:
   - **Listar Clientes:** Consulta e exibe todos os clientes cadastrados na tabela `clientes` do banco de dados.
   - **Adicionar Transação:** Solicita o cliente associado, o valor e a modalidade de pagamento (calculada dinamicamente via Strategy Pattern: Pix, Cartão ou Boleto), persistindo os dados na tabela `transacoes` com chave estrangeira (`cliente_id`).
   - **Buscar Transação por ID:** Executa consulta SQL com `INNER JOIN` entre as tabelas `transacoes` e `clientes`, trazendo nome do titular e valores.
   - **Remover Transação:** Executa a exclusão definitiva do registro pelo ID (`DELETE FROM transacoes WHERE id = ?`).
   - **Listar Todas as Transações:** Retorna todas as operações gravadas com relacionamento completo entre cliente e transação.
3. Garante a integridade dos recursos fechando conexões automaticamente e prevenindo ataques de injeção de código.

---

## 🧠 Conceitos Utilizados
- **Conectividade JDBC (`java.sql.*`):** Comunicação nativa entre Java e o SGBD relacional utilizando a biblioteca JDBC pura (sem frameworks ORM como Hibernate ou Spring Data), consolidando o entendimento da base da persistência.
- **Gerenciamento de Recursos com `try-with-resources`:** Utilização da sintaxe automática de fechamento de conexões, statements e result sets (`AutoCloseable`), prevenindo vazamento de conexões (*Connection Leaks*) mesmo em cenários de erro.
- **Segurança contra SQL Injection com `PreparedStatement`:** Parametrização estrita de valores utilizando placeholders (`?`), garantindo que entradas maliciosas nunca sejam interpretadas como comandos SQL executáveis.
- **Relacionamentos SQL e Consultas com `INNER JOIN`:** Integração de duas tabelas relacionais (`transacoes` e `clientes`) através da chave estrangeira (`FOREIGN KEY cliente_id`), mapeando o resultado no `ResultSet`.
- **Separação de Camadas (Arquitetura em Camadas):**
  - **Infraestrutura/Conexão:** `ConexaoBanco`
  - **Domínio/Modelos:** `Transacao`, `Pagamento` (e implementações)
  - **Acesso a Dados / Serviços:** `GerenciadorPagamentos`
  - **Apresentação / Cliente:** `Main`
- **Padrão Factory/Singleton para Conexão:** Centralização das credenciais e obtenção do `DriverManager.getConnection` em um único ponto configurável.

---

## 📂 Estrutura de Arquivos
| Arquivo | Responsabilidade |
| :--- | :--- |
| `src/ConexaoBanco.java` | Gerenciador de conexão com PostgreSQL contendo URL, credenciais e método `obterConexao()`. |
| `src/Pagamento.java` | Interface para a estratégia de cálculo de valores. |
| `src/PagamentoPix.java` | Estratégia concreta para pagamentos Pix (10% desconto). |
| `src/PagamentoCartao.java` | Estratégia concreta para pagamentos com Cartão (5% acréscimo). |
| `src/PagamentoBoleto.java` | Estratégia concreta para pagamentos com Boleto (valor integral). |
| `src/Transacao.java` | Entidade que representa a transação associada a um cliente. |
| `src/GerenciadorPagamentos.java` | Camada DAO/Serviço com métodos JDBC para inserção, busca, exclusão e listagem com `INNER JOIN`. |
| `src/BuscaInvalidaException.java` | Exceção para IDs inexistentes no banco. |
| `src/PagamentoInvalidoExpection.java` | Exceção para parâmetros monetários inválidos. |
| `src/Main.java` | Menu interativo de console para execução das operações integradas ao banco. |

---

## 🗄️ Script SQL Sugerido
Para testar a persistência, as seguintes tabelas devem existir no banco PostgreSQL `estudos_java`:
```sql
CREATE TABLE clientes (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL
);

CREATE TABLE transacoes (
    id SERIAL PRIMARY KEY,
    valor_original NUMERIC(10, 2) NOT NULL,
    forma_pagamento VARCHAR(50) NOT NULL,
    valor_final NUMERIC(10, 2) NOT NULL,
    cliente_id INT REFERENCES clientes(id)
);

-- Dados iniciais de teste:
INSERT INTO clientes (nome, email) VALUES 
('Cristhyan Gabriel', 'cristhyan@email.com'),
('Maria Silva', 'maria@email.com');
```

---

## ▶️ Como Executar
1. Certifique-se de que o serviço do **PostgreSQL** está em execução na porta `5432` com o banco `estudos_java` criado.
2. Certifique-se de ter o driver JDBC do PostgreSQL (`postgresql-42.x.x.jar`) no classpath.
3. Execute na raiz da pasta `VigesimoPasso`:
```bash
javac -cp ".;lib/postgresql.jar" src/*.java -d out
java -cp "out;lib/postgresql.jar" Main
```
Ou abra o projeto na sua IDE e certifique-se de que a dependência do driver JDBC do PostgreSQL está adicionada ao projeto.
