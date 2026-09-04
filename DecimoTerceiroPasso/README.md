# 📌 Passo 13: Abstração e Polimorfismo Aplicados à Biblioteca (`DecimoTerceiroPasso`)

## 📝 O que o código faz
Este sistema modela o funcionamento de uma biblioteca universitária, gerenciando o acervo e calculando multas de atraso de acordo com o tipo de mídia:
1. Permite o cadastro e controle de diferentes itens bibliográficos:
   - **Livros:** Possuem autor e possuem taxa de multa de **R$ 2,00 por dia** de atraso.
   - **Revistas:** Possuem número de edição e possuem taxa de multa de **R$ 1,00 por dia** de atraso.
2. Controla o estado de disponibilidade (`disponivel`), permitindo:
   - Realizar empréstimos (alterando para indisponível).
   - Realizar devoluções (restaurando a disponibilidade).
   - Apurar a penalidade financeira caso o usuário entregue o item após o prazo estipulado.
3. Centraliza a gestão do acervo na classe `Biblioteca`, que oferece busca e listagem das obras cadastradas.

---

## 🧠 Conceitos Utilizados
- **Abstração e Generalização:** Criação da classe `ItemBiblioteca` contendo comportamentos comuns a qualquer mídia (controle de empréstimo e devolução) e definindo a assinatura do método de cálculo de multa.
- **Sobrescrita Polimórfica (`@Override`):** Cada tipo de material sobrescreve o método `calcularMulta(int diasAtraso)` com sua regra de tarifação específica:
  - Livro: $\text{multa} = \text{dias} \times 2$.
  - Revista: $\text{multa} = \text{dias} \times 1$.
- **Encapsulamento de Regras de Empréstimo:** Métodos `emprestar()` e `devolver()` protegem a integridade do estado booleano do item.
- **Polimorfismo de Inclusão:** A classe `Biblioteca` manipula instâncias de `ItemBiblioteca`, tratando livros e revistas de maneira uniforme sem se preocupar com suas regras internas particulares.

---

## 📂 Estrutura de Arquivos
| Arquivo | Responsabilidade |
| :--- | :--- |
| `src/ItemBiblioteca.java` | Classe base para qualquer item do acervo, com atributos de identificação, disponibilidade e cálculo base de multa. |
| `src/Livro.java` | Subclasse com atributo `autor` e regra de multa específica de R$ 2,00 por dia. |
| `src/Revista.java` | Subclasse com atributo `edicao` e regra de multa de R$ 1,00 por dia. |
| `src/Biblioteca.java` | Classe gerenciadora responsável pelo acervo e controle de operações da biblioteca. |
| `src/Main.java` | Interface de terminal para interação com o sistema de biblioteca. |

---

## ▶️ Como Executar
Na raiz da pasta `DecimoTerceiroPasso`:
```bash
javac src/*.java -d out
java -cp out Main
```
Ou execute a classe `Main.java` diretamente na sua IDE.
