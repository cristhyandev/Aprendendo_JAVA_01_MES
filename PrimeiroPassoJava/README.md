# 📌 Passo 01: Lógica Básica e Cálculos Geométricos (`PrimeirospassosJava`)

## 📝 O que o código faz
Este programa é uma aplicação de console interativa para cálculo de área de figuras geométricas. Ao ser executado:
1. Apresenta um menu perguntando se o usuário deseja calcular a área de um **Triângulo** (opção `1`) ou de um **Quadrado** (opção `2`).
2. Valida a escolha através de um laço `while`, impedindo opções inexistentes.
3. Solicita os dados da figura:
   - Para o triângulo: base ($b$) e altura ($h$), calculando $\text{área} = \frac{b \times h}{2}$.
   - Para o quadrado: lado ($l$), calculando $\text{área} = l \times l$.
4. Exibe o resultado calculado em metros quadrados ($m^2$) e finaliza liberando o leitor de entrada.

---

## 🧠 Conceitos Utilizados
- **Entrada e Saída Padrão (`Scanner` e `System.out`):** Utilização da classe `java.util.Scanner` para captura de dados digitados pelo usuário via terminal (`System.in`) e exibição de mensagens com `System.out.println`.
- **Tipos de Dados Primitivos:** Manipulação de variáveis numéricas do tipo `int` (para opções do menu) e `double` (para medidas e cálculos de ponto flutuante com casas decimais).
- **Estruturas de Decisão (`if` / `else if`):** Direcionamento do fluxo de execução do programa de acordo com a opção escolhida pelo usuário.
- **Estruturas de Repetição (`while`):** Validação defensiva de entrada, mantendo o usuário em repetição até que uma opção válida seja informada.
- **Operadores Lógicos e Relacionais:** Uso de `!=` (diferente) e `&&` (E lógico) para composição da condição de repetição.
- **Modularização com Métodos Estáticos:** Separação das responsabilidades de cálculo em métodos estáticos auxiliares (`CalcularTriangulo` e `CalcularQuadrado`), promovendo organização e reutilização de código dentro da classe `Main`.
- **Gerenciamento de Recursos:** Fechamento explícito da instância do `Scanner` através do método `leitor.close()` ao término da execução.

---

## 📂 Estrutura de Arquivos
| Arquivo | Responsabilidade |
| :--- | :--- |
| `src/Main.java` | Ponto de entrada (`main`), menu de opções, métodos de cálculo de áreas e controle do fluxo de execução. |

---

## ▶️ Como Executar
Na raiz da pasta `PrimeirospassosJava`:
```bash
javac src/Main.java -d out
java -cp out Main
```
Ou execute a classe `Main.java` diretamente em sua IDE de preferência.
