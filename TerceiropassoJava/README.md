# 📌 Passo 03: Fundamentos de POO e a Primeira Classe (`TerceiropassoJava`)

## 📝 O que o código faz
Este programa marca a transição direta para a **Programação Orientada a Objetos (POO)**. Ele calcula a área de um retângulo a partir das dimensões fornecidas pelo usuário:
1. O programa solicita via console a base e a altura do retângulo.
2. Cria uma instância da classe `Retangulo` em memória.
3. Atribui os valores digitados diretamente aos atributos do objeto instanciado.
4. Invoca o método `calcularArea()` do próprio objeto, que realiza a multiplicação da base pela altura e retorna o resultado.
5. Exibe a área calculada em metros quadrados ($m^2$) no terminal e fecha o `Scanner`.

---

## 🧠 Conceitos Utilizados
- **Conceito de Classe e Objeto:** Compreensão da classe como molde/estrutura (`Retangulo`) e do objeto como a ocorrência concreta desse molde na memória (`ret`).
- **Atributos de Instância:** Declaração de variáveis pertencentes ao objeto (`public double base`, `public double altura`) que mantêm o seu estado.
- **Métodos de Instância:** Criação de comportamento atrelado ao objeto (`calcularArea()`), que utiliza os próprios atributos da instância para processar e retornar a informação.
- **Instanciação com Operador `new`:** Alocação dinâmica da classe `Retangulo` na memória Heap.
- **Organização em Pacotes:** Definição do pacote `package geometria;` e uso de `import geometria.Retangulo;` na classe consumidora.
- **Saída Formatada:** Utilização de `System.out.printf` e concatenação de strings para exibição amigável dos resultados.

---

## 📂 Estrutura de Arquivos
| Arquivo | Responsabilidade |
| :--- | :--- |
| `src/Retangulo.java` | Classe de domínio geométrico contendo os atributos `base` e `altura` e o método de cálculo de área. |
| `src/Main.java` | Ponto de entrada (`main`), interação com usuário via `Scanner` e invocação da entidade `Retangulo`. |

---

## ▶️ Como Executar
Na raiz da pasta `TerceiropassoJava`:
```bash
javac src/Retangulo.java src/Main.java -d out
java -cp out Main
```
Ou execute a classe `Main.java` na sua IDE.
