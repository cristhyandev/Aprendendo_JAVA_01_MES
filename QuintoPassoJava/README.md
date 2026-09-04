# 📌 Passo 05: Regras de Negócio em Métodos de Domínio (`QuintoPassoJava`)

## 📝 O que o código faz
Este projeto implementa um sistema de gerenciamento e controle de estoque para um item comercial:
1. Permite o cadastro inicial das propriedades do produto: nome, preço unitário e quantidade inicial em estoque.
2. Fornece um menu interativo de gerenciamento com as seguintes funcionalidades:
   - **a. Dar entrada no estoque:** Adiciona novas unidades compradas ao saldo atual.
   - **b. Dar baixa no estoque:** Realiza a venda/saída de unidades com validação de disponibilidade (se a quantidade solicitada for maior que o estoque atual, a venda é bloqueada e o usuário é avisado).
   - **c. Ver detalhes do produto:** Exibe a ficha completa com nome, preço unitário, estoque em unidades e o valor financeiro total imobilizado no estoque ($\text{quantidade} \times \text{preço}$).
   - **d. Sair:** Finaliza o programa.

---

## 🧠 Conceitos Utilizados
- **Transferência de Regras de Negócio para o Objeto:** A lógica de validação de saldo e cálculo do patrimônio em estoque foi movida de dentro da classe executável para os métodos da própria classe `Produto` (`adicionarEstoque`, `removerEstoque`, `exibirInformacoes`).
- **Validação Defensiva de Estado:** O método `removerEstoque` impede que o estoque assuma valores inconsistentes (negativos), garantindo integridade dos dados operacionais.
- **Cálculos Compostos Derivados:** O cálculo do valor total do inventário é computado dinamicamente no momento da exibição com base nos dados mais recentes da instância.
- **Estruturação de Pacotes (`package estoque`):** Agrupamento semântico de entidades ligadas ao domínio de comércio e suprimentos.
- **Loops Interativos de Terminal:** Menu baseado em `while` com tratamento de condições de parada.

---

## 📂 Estrutura de Arquivos
| Arquivo | Responsabilidade |
| :--- | :--- |
| `src/Produto.java` | Entidade do domínio de estoque com atributos e métodos que gerenciam a entrada, baixa e totalização do produto. |
| `src/Main.java` | Interface de usuário via terminal, leitura de dados e chamada dos métodos da classe `Produto`. |

---

## ▶️ Como Executar
Na raiz da pasta `QuintoPassoJava`:
```bash
javac src/Produto.java src/Main.java -d out
java -cp out Main
```
Ou execute a classe `Main.java` diretamente na sua IDE.
