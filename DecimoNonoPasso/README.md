# 📌 Passo 19: Arquitetura Integrada de Pagamentos e Transações (`DecimoNonoPasso`)

## 📝 O que o código faz
Este projeto integra todos os conceitos de Programação Orientada a Objetos, Design Patterns, Coleções e Exceções desenvolvidos até este ponto em uma aplicação transacional completa:
1. Permite realizar pagamentos dinâmicos escolhendo a forma de liquidação:
   - **Pix:** Aplica desconto de 10%.
   - **Cartão de Crédito:** Aplica taxa de 5%.
   - **Boleto Bancário:** Mantém o valor nominal.
2. Cada pagamento concluído gera uma entidade de histórico imutável (`Transacao`), contendo código identificador, valor original, forma de pagamento e valor final liquidado.
3. As transações são gerenciadas pela classe de serviço `GerenciadorPagamentos`, que as armazena em uma tabela hash (`Map<Integer, Transacao>`), permitindo:
   - **Buscar Transação por ID:** Exibe os detalhes consolidados ou dispara `BuscaInvalidaException`.
   - **Remover Transação por ID:** Exclui o registro validando sua existência.
   - **Listar Transações:** Imprime todas as transações realizadas no console.
4. O menu interativo trata rigorosamente todas as entradas com múltiplos blocos `try-catch`.

---

## 🧠 Conceitos Utilizados
- **Integração de Múltiplos Padrões e Paradigmas:** União do padrão **Strategy** (para as modalidades de pagamento), da camada de **Serviço/Repositório** (`GerenciadorPagamentos`) e do modelo de domínio (`Transacao`).
- **Exceções de Domínio Customizadas:** Criação e propagação de `BuscaInvalidaException` e `PagamentoInvalidoExpection` para tratar regras de negócio semânticas.
- **Modelagem de Entidade Transacional (`Transacao`):** Objeto imutável de registro histórico de eventos financeiros.
- **Armazenamento Chave-Valor em Memória com `Map` e `HashMap`:** Associação direta entre o ID sequencial da transação e o seu respectivo objeto em memória.
- **Tratamento Multicamadas de Erros:** Captura simultânea de erros de tipagem do usuário (`InputMismatchException`) e erros de lógica do domínio (`BuscaInvalidaException`).

---

## 📂 Estrutura de Arquivos
| Arquivo | Responsabilidade |
| :--- | :--- |
| `src/Pagamento.java` | Interface unificada com o contrato de cálculo financeiro (`calcular(double valor)`). |
| `src/PagamentoPix.java` | Implementação com regra de desconto para Pix. |
| `src/PagamentoCartao.java` | Implementação com acréscimo de taxa para Cartão. |
| `src/PagamentoBoleto.java` | Implementação com valor integral para Boleto. |
| `src/Transacao.java` | Entidade que representa o registro financeiro com todos os dados da operação. |
| `src/GerenciadorPagamentos.java` | Classe de serviço que gerencia o repositório em memória via `HashMap`. |
| `src/BuscaInvalidaException.java` | Exceção disparada ao consultar ou remover transação com ID inexistente. |
| `src/PagamentoInvalidoExpection.java` | Exceção disparada quando valores monetários são inconsistentes. |
| `src/Main.java` | Ponto de entrada com menu interativo e coordenação de todo o fluxo transacional. |

---

## ▶️ Como Executar
Na raiz da pasta `DecimoNonoPasso`:
```bash
javac src/*.java -d out
java -cp out Main
```
Ou execute a classe `Main.java` diretamente na sua IDE.
