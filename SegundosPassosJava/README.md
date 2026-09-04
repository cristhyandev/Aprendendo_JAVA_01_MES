# 📌 Passo 02: Modularização, Métodos e Primeiros Objetos (`SegundosPassosJava`)

## 📝 O que o código faz
Este projeto tem como objetivo o cálculo do preço final de uma mercadoria aplicando um percentual de desconto informado pelo usuário. O passo explora e compara duas formas fundamentais de organizar essa lógica em Java:
1. **Abordagem Funcional/Serviço (`Main.java` e `calcularDesconto.java`):**
   - O programa solicita o preço do produto e o percentual de desconto.
   - Instancia a classe `calcularDesconto` e invoca o método `acao(valor, desconto)`, passando os valores como parâmetros e obtendo o resultado calculado.
2. **Abordagem Orientada a Estado/Entidade (`main2.java` e `Desconto.java`):**
   - O programa solicita os dados ao usuário.
   - Instancia o objeto `Desconto`, preenche seus atributos (`valorProduto` e `porcentagemDesconto`) e chama o método sem parâmetros `calcularValorFinal()`, que opera diretamente sobre o estado interno da instância.

---

## 🧠 Conceitos Utilizados
- **Pacotes (`package calculadora`):** Organização das classes em um namespace próprio, facilitando a separação entre classes executáveis (`Main` / `main2`) e classes utilitárias/modelos.
- **Importação de Classes (`import calculadora.*`):** Comunicação entre arquivos e pacotes distintos.
- **Criação e Instanciação de Classes (`new`):** Uso da palavra-chave `new` para alocar memória e instanciar novos objetos (`new calcularDesconto()` e `new Desconto()`).
- **Métodos com Parâmetros e Retorno:** Definição e invocação de métodos que recebem argumentos e retornam valores calculados com a instrução `return`.
- **Atributos de Instância:** Declaração e manipulação de variáveis de instância (`public double valorProduto`, `public double porcentagemDesconto`).
- **Diferenciação de Paradigmas:** Contraste prático entre passar dados via argumentos de método versus encapsular dados como estado de um objeto antes de disparar o comportamento.

---

## 📂 Estrutura de Arquivos
| Arquivo | Responsabilidade |
| :--- | :--- |
| `src/calcularDesconto.java` | Classe de serviço do pacote `calculadora` que calcula o desconto recebendo valor e porcentagem por parâmetro. |
| `src/Desconto.java` | Classe modelo do pacote `calculadora` contendo atributos para valor e percentual e método de cálculo baseado em seu próprio estado. |
| `src/Main.java` | Ponto de entrada que executa o cálculo utilizando a classe `calcularDesconto`. |
| `src/main2.java` | Ponto de entrada alternativo que executa o cálculo manipulando a entidade `Desconto`. |

---

## ▶️ Como Executar
Na raiz da pasta `SegundosPassosJava`:
```bash
# Compilar todas as classes:
javac src/*.java -d out

# Executar abordagem 1:
java -cp out Main

# Executar abordagem 2:
java -cp out main2
```
Ou execute a classe `Main.java` ou `main2.java` diretamente na sua IDE.
