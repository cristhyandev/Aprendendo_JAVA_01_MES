# 📌 Passo 08: Coleções Dinâmicas e Primeiro CRUD em Memória (`OitavoPasso`)

## 📝 O que o código faz
Este projeto introduz a manipulação de múltiplos objetos em tempo de execução através de um sistema de biblioteca com operações CRUD (Create, Read, Delete) em memória:
1. Mantém uma lista dinâmica de livros (`ArrayList<Livro>`).
2. Disponibiliza um menu interativo com as ações:
   - **a. Cadastrar novo Livro:** Solicita o título da obra, associa a um código sequencial gerado automaticamente (`contadorCodigo++`), instancia o livro e o adiciona na lista.
   - **b. Remover Livro:** Solicita o código identificador, percorre a lista procurando o livro correspondente, o remove da coleção via `livros.remove(i)` e avisa caso o código não exista.
   - **c. Exibir livros na biblioteca:** Percorre a coleção inteira imprimindo o código e o título de cada livro cadastrado.
   - **n. Encerrar:** Finaliza a aplicação.

---

## 🧠 Conceitos Utilizados
- **Coleções Dinâmicas (`ArrayList`):** Substituição de vetores de tamanho fixo (`arrays[]`) pela estrutura de dados dinâmica `java.util.ArrayList`, que cresce e diminui em memória conforme a necessidade.
- **Tipagem com Generics (`<Livro>`):** Especificação do tipo de dado contido na lista (`ArrayList<Livro>`), garantindo segurança em tempo de compilação (*Type Safety*) sem a necessidade de conversões manuais (*casts*).
- **Geração Incremental de Identificadores (IDs):** Uso de uma variável contadora (`contadorCodigo`) para gerar chaves primárias lógicas e sequenciais para cada objeto cadastrado.
- **Iteração Clássica por Índices:** Uso de laço `for` tradicional com `livros.size()` e `livros.get(i)` para permitir a busca linear e remoção segura pelo índice `livros.remove(i)`.
- **Iteração Aprimorada (*Enhanced For-Loop*):** Uso de `for (Livro l : livros)` para simplificar a leitura de todos os elementos cadastrados.
- **Controle de Fluxo com Flag e `break`:** Uso de variável booleana (`boolean encontrado`) e instrução `break` para interromper a busca imediatamente após localizar o item desejado.

---

## 📂 Estrutura de Arquivos
| Arquivo | Responsabilidade |
| :--- | :--- |
| `src/Livro.java` | Classe de modelo com atributos privados (`codigo`, `nomeLivro`), construtor e métodos acessores (*getters*). |
| `src/Main.java` | Ponto de entrada com o menu interativo e a gestão da coleção dinâmica `ArrayList` de livros. |

---

## ▶️ Como Executar
Na raiz da pasta `OitavoPasso`:
```bash
javac src/Livro.java src/Main.java -d out
java -cp out Main
```
Ou execute a classe `Main.java` diretamente na sua IDE.
