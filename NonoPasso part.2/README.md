# 📌 Passo 09 (Parte 2): Refatoração com Enhanced For-Loop (`NonoPasso part.2`)

## 📝 O que o código faz
Esta etapa representa uma evolução de qualidade de código sobre o sistema de mercado do passo anterior:
1. Mantém todas as funcionalidades do sistema de estoque (cadastro, listagem, alteração de preço, exclusão de itens e saída).
2. **Refatora** a lógica de iteração: substitui os laços baseados em índices manuais (`for (int i = 0; ...)`) pelo **Enhanced For-Loop** (`for (Produto produto : produtos)`) nas operações de consulta geral e na busca para reajuste de preço.
3. Demonstra de forma didática quando usar a iteração simplificada direta sobre os elementos e quando o índice posicional ainda é necessário (como na exclusão via `remove(i)`).

---

## 🧠 Conceitos Utilizados
- **Refatoração de Código (*Code Refactoring*):** Aperfeiçoamento da estrutura interna do código para torná-lo mais limpo, legível e manutenível, sem alterar seu comportamento externo observável.
- **Enhanced For-Loop (*For-Each* em Java):** Sintaxe moderna e idiomática `for (Tipo variavel : colecao)` que elimina a necessidade de controle manual de contadores, índices ou chamadas a `.size()` e `.get(i)`.
- **Prevenção de Erros de Limite (*Off-by-one errors* e `IndexOutOfBoundsException`):** Como o *for-each* gerencia internamente o iterador da coleção, elimina completamente o risco de acessar índices inválidos.
- **Escolha Consciente da Estrutura de Repetição:** Análise de trade-off:
  - Leitura e busca de referências $\rightarrow$ **Enhanced For-Loop** (mais limpo e legível).
  - Remoção posicional $\rightarrow$ **For clássico com índice** (permite chamar `remove(i)` de forma direta).

---

## 📂 Estrutura de Arquivos
| Arquivo | Responsabilidade |
| :--- | :--- |
| `src/Produto.java` | Classe de domínio com dados e métodos de cálculo de valor total e reajuste de preço validado. |
| `src/Main.java` | Ponto de entrada com o código refatorado aplicando o laço *for-each* para manipulação da coleção de produtos. |

---

## ▶️ Como Executar
Na raiz da pasta `NonoPasso part.2`:
```bash
javac src/Produto.java src/Main.java -d out
java -cp out Main
```
Ou execute a classe `Main.java` diretamente na sua IDE.
