# 📌 Passo 06: Encapsulamento Estrito e Regras de Validação (`SextoPassoJava`)

## 📝 O que o código faz
Este projeto simula a gestão de recursos humanos (RH) para o cadastro e manutenção da remuneração de um funcionário:
1. Cadastra o colaborador inicial com nome, cargo e salário.
2. No momento da instanciação, o construtor valida se o salário informado respeita o piso salarial nacional (R$ 1.412,00). Caso o valor informado seja inferior, ele é ajustado automaticamente para o salário mínimo vigente.
3. Disponibiliza um menu interativo com operações de RH:
   - **a. Promover Colaborador:** Atualiza o cargo do funcionário.
   - **b. Aplicar Aumento Percentual:** Aplica um percentual de reajuste positivo sobre o salário atual.
   - **c. Ajuste Salarial Direto:** Permite redefinir o salário nominal, impedindo valores abaixo do piso ou idênticos ao salário já registrado.
   - **d. Exibir Ficha Atualizada:** Imprime os dados cadastrais e o salário atualizado.
   - **e. Encerrar:** Finaliza a aplicação.

---

## 🧠 Conceitos Utilizados
- **Encapsulamento Estrito (`private`):** Todos os atributos de instância (`nome`, `cargo`, `salario`) são declarados como privados, impedindo que classes externas acessem ou corrompam o estado do objeto diretamente.
- **Métodos Acessores e Modificadores (`Getters` e `Setters`):** Exposição controlada do estado através de `getNome()`, `getCargo()`, `getSalario()`, `setCargo()` e `setSalario()`.
- **Validação de Invariantes no Construtor:** Garantia de que nenhum objeto `Funcionario` nasça em um estado inválido (com salário abaixo do piso legal).
- **Uso do `this`:** Desambiguação entre parâmetros de métodos/construtores e os atributos da própria instância (`this.salario = salario`).
- **Tratamento de Buffer do `Scanner`:** Solução do clássico problema de leitura de linha em Java utilizando `leitor.nextLine()` para consumir a quebra de linha residual após ler tipos primitivos numéricos.

---

## 📂 Estrutura de Arquivos
| Arquivo | Responsabilidade |
| :--- | :--- |
| `src/Funcionario.java` | Entidade que encapsula as regras trabalhistas (piso salarial, reajustes, promoções) com atributos privados e métodos de acesso e mutação. |
| `src/Main.java` | Interface interativa de console para gerenciamento do colaborador com menu de opções e limpeza de buffer. |

---

## ▶️ Como Executar
Na raiz da pasta `SextoPassoJava`:
```bash
javac src/Funcionario.java src/Main.java -d out
java -cp out Main
```
Ou execute a classe `Main.java` diretamente na sua IDE.
