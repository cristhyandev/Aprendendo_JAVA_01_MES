# 📌 Passo 18: Validações Defensivas com `IllegalArgumentException` (`DecimoOitavoPasso`)

## 📝 O que o código faz
Este projeto ilustra o conceito de programação defensiva e proteção de argumentos em operações bancárias críticas:
1. Define o método `sacar(saldo, valorSaque)`, responsável por processar o débito de uma conta.
2. Antes de realizar o desconto monetário, valida se o valor solicitado é compatível com o saldo disponível.
3. Caso a tentativa de saque exceda os fundos existentes ($R\$\ 200,00 > R\$\ 100,00$), o método interrompe o fluxo imediatamente disparando uma `IllegalArgumentException` com a mensagem `"Saldo Insuficiente!"`.
4. No método `main`, a tentativa de saque é envolvida em um bloco `try-catch`, que captura a exceção, extrai a mensagem de erro através de `e.getMessage()` e a exibe com segurança no console.

---

## 🧠 Conceitos Utilizados
- **Programação Defensiva (*Defensive Programming*):** Prática de desenvolvimento que antecipa condições adversas e impede que métodos operem com argumentos inválidos ou que causem inconsistências nos dados.
- **Uso de Exceções Padrão do Java (`IllegalArgumentException`):** Aplicação de exceções já fornecidas pela biblioteca padrão da linguagem (`java.lang.*`) para sinalizar argumentos ilegais ou inapropriados passados a um método.
- **Interrupção de Fluxo com `throw new`:** O lançamento da exceção garante que nenhuma linha subsequente de código potencialmente perigoso (como o cálculo de saque indevido) seja executada.
- **Recuperação de Mensagens com `e.getMessage()`:** Obtenção da descrição amigável encapsulada no objeto da exceção para registro ou exibição ao usuário final.
- **Controle com `try-catch` em Camadas Superiores:** O método produtor apenas valida e lança a falha, delegando ao método consumidor (`main`) a decisão de como tratar e apresentar o erro.

---

## 📂 Estrutura de Arquivos
| Arquivo | Responsabilidade |
| :--- | :--- |
| `src/Banco.java` | Classe que contém o método estático `sacar` com validação defensiva e o método `main` para teste e captura de exceção. |

---

## ▶️ Como Executar
Na raiz da pasta `DecimoOitavoPasso`:
```bash
javac src/Banco.java -d out
java -cp out Banco
```
Ou execute a classe `Banco.java` diretamente na sua IDE.
