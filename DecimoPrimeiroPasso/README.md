# 📌 Passo 11: Herança, Construtores com `super` e Pattern Matching (`DecimoPrimeiroPasso`)

## 📝 O que o código faz
Este sistema expande o controle de estoque de mercado incorporando o conceito de **especialização de classes via Herança**:
1. O sistema permite cadastrar tanto **Produtos Comuns** quanto **Produtos Perecíveis**.
2. No cadastro, o usuário informa se o item possui validade (`Y` ou `N`):
   - Se for perecível, solicita a data de validade e instancia a subclasse `ProdutoPerecivel`.
   - Se não for, instancia a superclasse `Produto`.
   - Ambos são armazenados juntos no mesmo `ArrayList<Produto>`.
3. Na listagem geral de estoque, o sistema inspeciona cada item: caso detecte que o objeto é uma instância de `ProdutoPerecivel`, extrai e exibe a data de validade correspondente de forma transparente.
4. Mantém as operações de alteração de preço, exclusão e saída do sistema.

---

## 🧠 Conceitos Utilizados
- **Herança (`extends`):** Relação do tipo *"é-um"* (`ProdutoPerecivel` **é um** `Produto`), herdando automaticamente todos os atributos e comportamentos da classe pai (código, nome, quantidade e preço).
- **Reutilização de Construtores com `super(...)`:** Chamada explícita ao construtor da superclasse (`super(codigo, nome, quantidadeEstoque, preco)`), garantindo que os atributos herdados sejam inicializados corretamente antes de configurar os atributos específicos da subclasse.
- **Polimorfismo em Coleções:** Capacidade de armazenar objetos de classes filhas (`ProdutoPerecivel`) dentro de uma lista tipada para a classe mãe (`ArrayList<Produto>`).
- **Verificação de Tipos e *Pattern Matching* com `instanceof`:** Uso moderno da sintaxe `if (produto instanceof ProdutoPerecivel perecivel)` (introduzida a partir do Java 16), que verifica o tipo dinâmico do objeto em tempo de execução e já declara e faz o *cast* da variável `perecivel` no mesmo comando.
- **Comparação Flexível de Strings:** Uso de `.equalsIgnoreCase()` para aceitar entradas maiúsculas e minúsculas de forma indistinta.

---

## 📂 Estrutura de Arquivos
| Arquivo | Responsabilidade |
| :--- | :--- |
| `src/Produto.java` | Superclasse base contendo atributos comuns a qualquer mercadoria e regras gerais de precificação. |
| `src/ProdutoPerecivel.java` | Subclasse que herda de `Produto`, acrescentando o atributo específico `dataValidade` e seu método acessor. |
| `src/Main.java` | Menu interativo que suporta cadastro polimórfico e utiliza `instanceof` para exibição detalhada de itens com validade. |

---

## ▶️ Como Executar
Na raiz da pasta `DecimoPrimeiroPasso`:
```bash
javac src/Produto.java src/ProdutoPerecivel.java src/Main.java -d out
java -cp out Main
```
Ou execute a classe `Main.java` diretamente na sua IDE.
