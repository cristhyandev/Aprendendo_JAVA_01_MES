# 📌 Passo 09: Sistema Completo de Mercado e Estoque com Coleções (`NonoPasso Java`)

## 📝 O que o código faz
Este sistema simula o controle comercial de um supermercado, gerenciando um inventário dinâmico de produtos com operações completas de criação, leitura, atualização e remoção (CRUD):
1. **Cadastrar Novo Produto:** Solicita nome, quantidade inicial e preço unitário. O produto é encapsulado com um código gerado sequencialmente e adicionado a um `ArrayList<Produto>`.
2. **Consultar Estoque (Listar todos):** Percorre a lista inteira exibindo código, nome, quantidade (com alerta de "Estoque vazio" se a quantidade for 0), preço unitário e o valor total em reais imobilizado no item ($\text{quantidade} \times \text{preço}$).
3. **Alterar Preço de um Produto:** Localiza o produto pelo código informado, exibe o preço atual, pede confirmação ao usuário e aciona o método de alteração validado da classe `Produto`.
4. **Dar Baixa / Remover Produto:** Localiza o produto pelo código e o exclui permanentemente da lista em memória.
5. **Sair do Sistema:** Encerra o laço do menu.

---

## 🧠 Conceitos Utilizados
- **CRUD Completo em Memória com `ArrayList`:** Implementação das 4 operações essenciais de gestão de dados sobre uma lista genérica de objetos.
- **Encapsulamento e Ocultamento de Dados:** Atributos privados e métodos de validação no mutador `setPreco(double valor)`, que impede que um produto receba preço zero, negativo ou idêntico ao já praticado.
- **Cálculo Derivado de Domínio (`getValorTotal`):** Método de instância que calcula o valor total do lote em tempo real.
- **Busca Linear com `for` Tradicional:** Utilização de laço baseado em índice (`int k = 0; k < produtos.size(); k++`) para varredura e comparação de códigos (`getCodigo() == codigoBuscado`).
- **Confirmação de Operações Críticas:** Inclusão de submenus de confirmação (1-Confirmar / 2-Cancelar) antes de aplicar alterações sensíveis no estado do produto.

---

## 📂 Estrutura de Arquivos
| Arquivo | Responsabilidade |
| :--- | :--- |
| `src/Produto.java` | Modelo do item de mercado com atributos privados, construtor completo, validação no `setPreco` e cálculo de total. |
| `src/Main.java` | Interface interativa com menu, controle da lista de produtos e execução de buscas, listagens e remoções. |

---

## ▶️ Como Executar
Na raiz da pasta `NonoPasso Java`:
```bash
javac src/Produto.java src/Main.java -d out
java -cp out Main
```
Ou execute a classe `Main.java` diretamente na sua IDE.
