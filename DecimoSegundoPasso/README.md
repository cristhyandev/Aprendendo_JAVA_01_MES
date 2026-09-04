# 📌 Passo 12: Polimorfismo, Sobrescrita de Métodos e Classes de Serviço (`DecimoSegundoPasso`)

## 📝 O que o código faz
Este sistema implementa uma gestão de Recursos Humanos com arquitetura orientada a serviços e cálculo salarial polimórfico:
1. Permite a contratação de dois perfis profissionais distintos:
   - **Gerente:** Possui bônus de gestão somado à sua remuneração fixa.
   - **Desenvolvedor:** Possui o registro da linguagem de programação dominada.
2. Centraliza a gestão dos colaboradores em uma classe de serviço especializada (`Gerenciadora`), responsável por:
   - **Contratar:** Insere colaboradores na lista interna.
   - **Exibir Folha de Pagamento:** Calcula a remuneração de cada colaborador dinamicamente (respeitando o cálculo específico de cada cargo) e exibe detalhes de acordo com o papel.
   - **Buscar por ID:** Pesquisa um funcionário pelo seu código numérico.
   - **Demitir:** Remove o colaborador da folha de pagamento caso o código exista.
3. Fornece interface interativa via console para simulação de admissões, demissões e consultas financeiras da empresa.

---

## 🧠 Conceitos Utilizados
- **Polimorfismo Dinâmico:** Capacidade de invocar o método `calcularSalario()` sobre uma referência genérica de `Funcionario`, executando em tempo de execução a versão específica da subclasse (`Gerente` ou `Desenvolvedor`).
- **Sobrescrita de Métodos (`@Override`):** Redefinição do comportamento do método na classe filha (`Gerente`) para incorporar o bônus de gestão ao cálculo base.
- **Hierarquia de Herança:** Classe abstrata/base `Funcionario` que serve como contrato e reaproveitamento de código para cargos especializados.
- **Classe de Serviço / Gerenciadora (`Service Layer`):** Desacoplamento da lógica de negócios e coleções para uma classe dedicada (`Gerenciadora`), retirando essa responsabilidade da classe `Main`.
- **Pattern Matching com `instanceof`:** Verificação de tipo seguro para extrair informações pontuais (ex: linguagens de um dev ou bônus de um gerente) sem necessidade de quebrar o polimorfismo.

---

## 📂 Estrutura de Arquivos
| Arquivo | Responsabilidade |
| :--- | :--- |
| `src/Funcionario.java` | Classe base com identificador, nome, salário base e implementação padrão de `calcularSalario()`. |
| `src/Gerente.java` | Subclasse de `Funcionario` que sobrescreve `calcularSalario()` adicionando a bonificação de gestão. |
| `src/Desenvolvedor.java` | Subclasse de `Funcionario` que adiciona a informação da linguagem técnica dominada. |
| `src/Gerenciadora.java` | Classe de serviço que administra o repositório de funcionários em memória (admissão, demissão, busca e folha). |
| `src/Main.java` | Ponto de entrada com menu interativo de operações do departamento de RH. |

---

## ▶️ Como Executar
Na raiz da pasta `DecimoSegundoPasso`:
```bash
javac src/*.java -d out
java -cp out Main
```
Ou execute a classe `Main.java` diretamente na sua IDE.
