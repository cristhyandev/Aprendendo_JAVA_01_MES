# 📌 Passo 07: Gestão de Estados e Ciclo de Vida do Objeto (`SetimoPasso`)

## 📝 O que o código faz
Este sistema simula o controle de locação de uma concessionária/locadora de automóveis:
1. Coleta o modelo do veículo e o valor da diária (com validação em loop garantindo que a diária seja estritamente positiva).
2. O veículo é instanciado com o estado inicial `"Disponível"`.
3. Oferece um menu completo para gestão do ciclo de vida da locação:
   - **a. Retirar/Alugar Veículo:** Solicita confirmação (`y`); se o veículo estiver `"Disponível"`, seu estado muda para `"Indisponível"`; se já estiver alugado, a operação é bloqueada.
   - **b. Devolver Veículo:** Solicita a quantidade de dias utilizados; se o veículo estava `"Indisponível"`, calcula e exibe o valor total do aluguel ($\text{diária} \times \text{dias}$) e restaura o status para `"Disponível"`.
   - **c. Ajustar Valor da Diária:** Permite reajustar a tarifa diária, validando se o novo valor é positivo e diferente do valor corrente.
   - **d. Exibir Status/Ficha:** Apresenta modelo, diária e a situação atual do carro no pátio.
   - **e. Encerrar:** Finaliza o sistema.

---

## 🧠 Conceitos Utilizados
- **Modelagem de Máquina de Estados:** Controle da transição de estados de uma entidade (`"Disponível"` $\leftrightarrow$ `"Indisponível"`), garantindo que certas ações só possam ocorrer se o objeto estiver no estado apropriado.
- **Encapsulamento de Regras de Transição:** As regras que alteram o status (`retirarVeiculo` e `devolverVeiculo`) estão encapsuladas no próprio objeto, impedindo que o chamador force uma devolução de um carro que nunca foi alugado.
- **Validação Prévia de Entrada:** Uso de laço `while` para sanitização de dados antes mesmo da instanciação do objeto (`valorDiaria <= 0`).
- **Lógica de Faturamento:** Cálculo dinâmico do montante a pagar no ato do encerramento do contrato de aluguel.

---

## 📂 Estrutura de Arquivos
| Arquivo | Responsabilidade |
| :--- | :--- |
| `src/Veiculo.java` | Classe com atributos privados e métodos de transição de estado, faturamento e reajuste de diária. |
| `src/Main.java` | Interface interativa com menu, validação inicial de valores e orquestração dos fluxos de locação e devolução. |

---

## ▶️ Como Executar
Na raiz da pasta `SetimoPasso`:
```bash
javac src/Veiculo.java src/Main.java -d out
java -cp out Main
```
Ou execute a classe `Main.java` diretamente na sua IDE.
