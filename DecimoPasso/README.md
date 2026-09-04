# 📌 Passo 10: Tratamento de Exceções e Entrada Segura (`DecimoPasso`)

## 📝 O que o código faz
Este programa aborda a resiliência de aplicações Java contra erros de entrada causados pelo usuário:
1. Solicita que o usuário informe sua idade através do console.
2. Se o usuário digitar um valor válido (inteiro positivo), a idade é confirmada na tela e o laço é encerrado com `break`.
3. Se o usuário digitar texto, símbolos ou qualquer entrada não numérica (o que normalmente causaria a quebra do programa com uma exceção `InputMismatchException`), o erro é interceptado.
4. Uma mensagem amigável de erro é apresentada no terminal, o buffer sujo do `Scanner` é limpo (`leitor.nextLine()`), e a aplicação solicita o dado novamente sem travar nem encerrar abruptamente.

---

## 🧠 Conceitos Utilizados
- **Tratamento de Exceções (`try-catch`):** Estrutura fundamental da linguagem Java para capturar erros em tempo de execução (*runtime exceptions*), impedindo a quebra não controlada da aplicação.
- **Bloco `try`:** Delimita o trecho de código considerado "perigoso" ou suscetível a falhas (neste caso, a conversão de entrada via `leitor.nextInt()`).
- **Bloco `catch`:** Captura a exceção lançada, permitindo a recuperação graciosa do sistema e fornecendo feedback claro ao usuário.
- **Limpeza de Buffer em Tratamento de Erros:** Quando o `Scanner` falha ao tentar ler um tipo primitivo (como `nextInt`), o caractere incorreto permanece no fluxo de entrada. A chamada a `leitor.nextLine()` dentro do bloco `catch` descarta esse caractere pendente, prevenindo loops infinitos de erro.
- **Controle de Fluxo com `while` e `break`:** Mecanismo de repetição que insiste na solicitação do dado até que a operação seja bem-sucedida.

---

## 📂 Estrutura de Arquivos
| Arquivo | Responsabilidade |
| :--- | :--- |
| `src/Main.java` | Demonstração prática do uso de `try-catch` para captura de erros de entrada de dados e sanitização de fluxo. |

---

## ▶️ Como Executar
Na raiz da pasta `DecimoPasso`:
```bash
javac src/Main.java -d out
java -cp out Main
```
Ou execute a classe `Main.java` diretamente na sua IDE.
