# 📌 Passo 04: Estado, Comportamento e Validação de Regras (`QuartoPassoJava`)

## 📝 O que o código faz
Este programa simula o funcionamento de uma **Conta Bancária** com interação contínua via console:
1. Coleta inicialmente o nome do titular e o saldo bancário de abertura.
2. Instancia um objeto `ContaBancaria` e inicializa seu estado.
3. Disponibiliza um menu interativo contínuo com as seguintes opções:
   - **a. Depositar:** Recebe um valor monetário e adiciona ao saldo da conta.
   - **b. Sacar:** Verifica se o saldo é suficiente antes de autorizar a operação; se for suficiente, debita o valor e exibe o novo saldo; caso contrário, avisa que o saldo é insuficiente.
   - **c. Ver saldo:** Exibe o saldo atual da conta vinculado ao nome do titular.
   - **d. Sair:** Encerra a aplicação de forma graciosa.

---

## 🧠 Conceitos Utilizados
- **Modelagem de Entidade com Estado e Comportamento:** Criação da classe `ContaBancaria` que mantém um estado interno (`titular`, `saldo`) que se modifica à medida que comportamentos (`depositar`, `sacar`) são acionados.
- **Validação de Regras de Negócio:** Aplicação de checagem condicional defensiva (`if (conta.saldo < saque)`) impedindo que uma conta fique negativa indevidamente.
- **Laços de Controle Contínuos (`while`):** Implementação de um menu interativo persistente que continua executando até o usuário digitar a condição de saída `"d"`.
- **Comparação de Textos com `.equals()`:** Uso correto do método `.equals()` para comparação de cadeias de caracteres (`String`), evitando a falha comum de comparar referências de objetos com `==`.
- **Pacotes e Separação de Camadas:** Organização da regra de negócio sob o pacote `package financeiro;`.

---

## 📂 Estrutura de Arquivos
| Arquivo | Responsabilidade |
| :--- | :--- |
| `src/ContaBancaria.java` | Classe que encapsula o estado bancário (titular e saldo) e métodos de movimentação financeira. |
| `src/Main.java` | Ponto de entrada com o menu em loop, interação com usuário via `Scanner` e chamada às operações bancárias. |

---

## ▶️ Como Executar
Na raiz da pasta `QuartoPassoJava`:
```bash
javac src/ContaBancaria.java src/Main.java -d out
java -cp out Main
```
Ou execute a classe `Main.java` diretamente na sua IDE.
