# 📌 Passo 16: Tabelas Chave-Valor com Map e Expressões Lambda (`DecimoSextoPasso`)

## 📝 O que o código faz
Este programa demonstra o armazenamento associativo chave-valor em Java e a introdução à programação funcional:
1. Instancia uma tabela hash para associar nomes de jogadores de futebol às suas respectivas contagens de gols na carreira (`Map<String, Integer>`).
2. Popula o mapa com registros através do método `put()`.
3. Percorre e imprime todos os pares de chave e valor utilizando a abordagem funcional do método `.forEach()` associado a uma **Expressão Lambda** `(jogador, gols) -> { ... }`.

---

## 🧠 Conceitos Utilizados
- **Estruturas Associativas Chave-Valor (`Map` e `HashMap`):** Uso da interface `java.util.Map` e da implementação `java.util.HashMap`, permitindo busca e recuperação ultrarrápidas ($O(1)$ em média) indexadas por uma chave única (`String`).
- **Genéricos em Mapas (`<String, Integer>`):** Tipagem estrita da chave (`String` para o nome do jogador) e do valor (`Integer` como wrapper de número de gols).
- **Inclusão de Registros com `put()`:** Método padrão para inserir ou atualizar associações chave-valor.
- **Expressões Lambda (`(a, b) -> ...`):** Recurso introduzido no Java 8 que permite escrever funções anônimas concisas, eliminando a verbosidade de classes anônimas internas.
- **Iteração Funcional com `forEach`:** Execução de uma ação declarativa sobre cada entrada do mapa via consumidor de dois parâmetros (`BiConsumer`).

---

## 📂 Estrutura de Arquivos
| Arquivo | Responsabilidade |
| :--- | :--- |
| `src/Main.java` | Criação do `HashMap`, inserção de dados e iteração funcional via expressão lambda. |

---

## ▶️ Como Executar
Na raiz da pasta `DecimoSextoPasso`:
```bash
javac src/Main.java -d out
java -cp out Main
```
Ou execute a classe `Main.java` diretamente na sua IDE.
