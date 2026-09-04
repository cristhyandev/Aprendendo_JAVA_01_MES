# 📌 Passo 17: Exceções Personalizadas e Bloco Finally (`DecimoSetimoPasso`)

## 📝 O que o código faz
Este projeto implementa um repositório completo de produtos em memória utilizando `HashMap` e aplicando uma camada profissional de **Tratamento de Exceções Customizadas**:
1. Inicializa o catálogo com produtos padrão (`Arroz`, `Feijão`, `Café`).
2. Disponibiliza menu com 6 operações:
   - **1. Cadastrar novos produtos:** Bloqueia produtos com nomes vazios ou compostos apenas por espaços, disparando a exceção de domínio `ProdutoInvalidoException`.
   - **2. Busca pelo código:** Retorna o produto caso exista; se não existir, dispara a exceção `ProdutoNaoEncontradoException`.
   - **3. Verificar se existe:** Checa a presença de uma chave no mapa e avisa o usuário.
   - **4. Remover:** Valida se a chave existe antes de efetuar a exclusão.
   - **5. Listar todos:** Exibe o catálogo mapeado via expressão lambda.
   - **6. Sair:** Encerra a aplicação.
3. Garante que, ao sair ou em caso de encerramento, o bloco `finally` seja executado para liberar recursos e fechar o `Scanner`.

---

## 🧠 Conceitos Utilizados
- **Criação de Exceções Personalizadas (*Custom Exceptions*):** Definição de classes que estendem `Exception` ou `RuntimeException` (`ProdutoInvalidoException` e `ProdutoNaoEncontradoException`) para representar falhas semânticas específicas do negócio.
- **Lançamento Explícito de Exceções (`throw new`):** Disparo proposital de exceções quando uma regra de integridade é violada (ex: validação com `.trim().isEmpty()`).
- **Cláusula `throws` na Assinatura:** Declaração explícita de que um método pode propagar uma exceção checada para quem o invocar.
- **Tratamento Específico e Granular:** Captura individualizada das exceções (`catch (ProdutoInvalidoException e)`, `catch (ProdutoNaoEncontradoException e)` e `catch (InputMismatchException e)`), permitindo fornecer feedbacks precisos para cada tipo de falha.
- **Garantia de Execução com `finally`:** Uso do bloco `finally` que sempre é executado, independentemente de haver exceções ou não, ideal para desalocação de recursos (como `leitor.close()`).
- **Verificação Rápida de Chaves com `containsKey()`:** Consulta de alta performance para verificar existência de chaves no mapa.

---

## 📂 Estrutura de Arquivos
| Arquivo | Responsabilidade |
| :--- | :--- |
| `src/ProdutoInvalidoException.java` | Exceção customizada disparada quando atributos do produto violam regras de integridade. |
| `src/ProdutoNaoEncontradoException.java` | Exceção customizada disparada ao tentar buscar ou remover um código inexistente. |
| `src/Produtos.java` | Repositório em memória baseado em `HashMap` com métodos de CRUD e validações defensivas. |
| `src/Main.java` | Menu interativo com orquestração dos fluxos e tratamento granular de múltiplos blocos `catch` e `finally`. |

---

## ▶️ Como Executar
Na raiz da pasta `DecimoSetimoPasso`:
```bash
javac src/*.java -d out
java -cp out Main
```
Ou execute a classe `Main.java` diretamente na sua IDE.
