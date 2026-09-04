# 📌 Passo 15: Padrão de Projeto Strategy e Polimorfismo de Pagamentos (`DecimoQuintoPasso`)

## 📝 O que o código faz
Este projeto implementa um sistema de checkout de vendas utilizando o famoso padrão de projeto comportamental **Strategy**:
1. Solicita ao usuário o montante em dinheiro a ser pago, com proteção via `try-catch` para evitar caracteres inválidos.
2. Apresenta o menu para seleção da modalidade de pagamento:
   - **1. Pix:** Aplica **10% de desconto** promocional no valor final.
   - **2. Cartão de Crédito:** Aplica acréscimo de **5% de taxa/juros** de processamento.
   - **3. Boleto Bancário:** Mantém o valor nominal integral.
   - **4. Sair:** Finaliza o programa.
3. A aplicação instancia a estratégia escolhida dinamicamente e executa `pagamento.pagar(valor)`, exibindo o valor final processado e as mensagens específicas de cada meio de pagamento.

---

## 🧠 Conceitos Utilizados
- **Padrão de Projeto Strategy (GoF):** Permite definir uma família de algoritmos de pagamento, encapsular cada um deles em uma classe separada e torná-los intercambiáveis em tempo de execução sem alterar o código cliente.
- **Princípio Aberto/Fechado (OCP - SOLID):** Novos métodos de pagamento (como Criptomoedas ou Carnê) podem ser adicionados criando novas classes que implementam `Pagamento`, sem precisar alterar a estrutura central de chamadas da classe `Main`.
- **Interface como Tipo de Referência:** A variável `Pagamento pagamento` é declarada utilizando a interface, e só recebe o objeto concreto (`new PagamentoPix()`, `new PagamentoCartao()` ou `new PagamentoBoleto()`) após a decisão do usuário.
- **Tratamento Robusto de Entrada com `InputMismatchException`:** Validação contínua da leitura de números decimais e inteiros com `try-catch` e limpeza de buffer (`leitor.nextLine()`).

---

## 📂 Estrutura de Arquivos
| Arquivo | Responsabilidade |
| :--- | :--- |
| `src/Pagamento.java` | Interface que define o contrato unificado de liquidação financeira (`pagar(double valor)`). |
| `src/PagamentoPix.java` | Estratégia concreta para pagamentos via Pix com desconto de 10%. |
| `src/PagamentoCartao.java` | Estratégia concreta para pagamentos com cartão com acréscimo de 5%. |
| `src/PagamentoBoleto.java` | Estratégia concreta para pagamentos via boleto sem taxas adicionais. |
| `src/Main.java` | Ponto de entrada que interage com o cliente, gerencia exceções de entrada e delega a cobrança à estratégia selecionada. |

---

## ▶️ Como Executar
Na raiz da pasta `DecimoQuintoPasso`:
```bash
javac src/*.java -d out
java -cp out Main
```
Ou execute a classe `Main.java` diretamente na sua IDE.
