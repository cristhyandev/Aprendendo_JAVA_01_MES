# 📌 Passo 14: Interfaces e Contratos de Comportamento (`DecimoQuartoPasso`)

## 📝 O que o código faz
Este projeto introduz um dos pilares mais fundamentais da orientação a objetos avançada: o uso de **Interfaces**. O sistema simula um mecanismo de cálculo de impostos financeiros:
1. Define a interface `Tributavel`, que estabelece que qualquer entidade do sistema sujeita a tributação deve obrigatoriamente implementar o método `double calcularImposto()`.
2. Duas classes conceitualmente distintas implementam esse mesmo contrato:
   - **ContaCorrente:** Calcula o imposto cobrando uma alíquota de **1% sobre o saldo total** da conta.
   - **SeguroDeVida:** Calcula o imposto aplicando sua respectiva taxa cadastrada.
3. O programa principal solicita os valores ao usuário, cria as instâncias de cada produto financeiro e imprime os valores dos impostos calculados.

---

## 🧠 Conceitos Utilizados
- **Interfaces (`interface`):** Definição de contratos abstratos puros que obrigam as classes implementadoras a fornecer corpo aos métodos declarados.
- **Implementação de Contrato (`implements`):** Uso da palavra-chave `implements` em `ContaCorrente` e `SeguroDeVida` para assumir o compromisso de implementar `calcularImposto()`.
- **Desacoplamento e Baixo Acoplamento:** `ContaCorrente` e `SeguroDeVida` não compartilham nenhuma hierarquia de herança comum de dados (uma não herda da outra nem de uma classe mãe), mas compartilham o mesmo **comportamento tributário**.
- **Polimorfismo Baseado em Interfaces:** Permite que sistemas de faturamento ou fiscalização tratem qualquer objeto como um `Tributavel`, sem se importar com os detalhes internos de como cada entidade foi construída.

---

## 📂 Estrutura de Arquivos
| Arquivo | Responsabilidade |
| :--- | :--- |
| `src/Tributavel.java` | Interface que define o contrato de cálculo de imposto (`calcularImposto()`). |
| `src/ContaCorrente.java` | Classe financeira que implementa `Tributavel`, tributando 1% do saldo. |
| `src/SeguroDeVida.java` | Classe de apólice que implementa `Tributavel`, tributando a taxa do seguro. |
| `src/Main.java` | Ponto de entrada que captura os valores do usuário e dispara o cálculo de impostos de ambas as classes. |

---

## ▶️ Como Executar
Na raiz da pasta `DecimoQuartoPasso`:
```bash
javac src/*.java -d out
java -cp out Main
```
Ou execute a classe `Main.java` diretamente na sua IDE.
