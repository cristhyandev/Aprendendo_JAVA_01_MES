# ☕ Jornada Java Core: Do Zero ao Banco de Dados (30 Dias)

Repositório dedicado ao registro prático da minha evolução no aprendizado de **Java** ao longo de 1 mês de estudos intensivos. O projeto foi estruturado em **20 passos progressivos**, partindo dos fundamentos da lógica imperativa até a integração completa com banco de dados relacional via JDBC puro.

> 👤 **Autor:** Cristhyan Gabriel Ferreira Duarte  
> 🎯 **Foco:** Java Core, Programação Orientada a Objetos (POO), Coleções, Tratamento de Exceções e Persistência (PostgreSQL + JDBC).

---

## 🚀 Resumo dos Passos de Evolução

| Passo | Projeto / Domínio | Principais Conceitos Aplicados |
| :---: | :--- | :--- |
| **01** | [`PrimeirospassosJava`](./PrimeirospassosJava/README.md) | Entrada de dados com `Scanner`, tipos primitivos, estruturas condicionais e de repetição (`while`, `if/else`). |
| **02** | [`SegundosPassosJava`](./SegundosPassosJava/README.md) | Criação e chamada de métodos com retorno, parâmetros e modularização de cálculos (descontos). |
| **03** | [`TerceiropassoJava`](./TerceiropassoJava/README.md) | Introdução à Programação Orientada a Objetos: primeira classe (`Retangulo`), atributos e métodos de instância. |
| **04** | [`QuartoPassoJava`](./QuartoPassoJava/README.md) | Modelagem de entidade com estado e comportamento (`ContaBancaria`: depósito, saque e saldo). |
| **05** | [`QuintoPassoJava`](./QuintoPassoJava/README.md) | Regras de negócio em métodos (`Produto`: controle de estoque, validação de saldo e cálculo de valor total). |
| **06** | [`SextoPassoJava`](./SextoPassoJava/README.md) | **Encapsulamento estrito**: atributos `private`, `getters/setters`, validação de piso salarial no construtor e métodos de domínio (`Funcionario`). |
| **07** | [`SetimoPasso`](./SetimoPasso/README.md) | Gestão de estados do objeto (`Veiculo`: status "Disponível"/"Indisponível", regras de locação, devolução e diárias). |
| **08** | [`OitavoPasso`](./OitavoPasso/README.md) | **Coleções dinâmicas**: primeiro CRUD em memória utilizando `ArrayList<Livro>`, menu interativo e busca/remoção por ID. |
| **09** | [`NonoPasso Java`](./NonoPasso%20Java/README.md) | Sistema de mercado e estoque completo com `ArrayList<Produto>`, métodos de ajuste de preço e totalização de inventário. |
| **09.2** | [`NonoPasso part.2`](./NonoPasso%20part.2/README.md) | Refatoração com Enhanced For-Loop (`for-each`), modernização de iteração e comparação de técnicas de acesso a listas. |
| **10** | [`DecimoPasso`](./DecimoPasso/README.md) | Introdução ao tratamento de erros com `try-catch` para capturar falhas de entrada do `Scanner` sem travar a aplicação. |
| **11** | [`DecimoPrimeiroPasso`](./DecimoPrimeiroPasso/README.md) | **Herança (`extends`)**: especialização de classes e reaproveitamento de construtores com `super()` (`ProdutoPerecivel`). |
| **12** | [`DecimoSegundoPasso`](./DecimoSegundoPasso/README.md) | **Polimorfismo e Pattern Matching**: hierarquia de cargos (`Gerente`, `Desenvolvedor`), classe de serviço (`Gerenciadora`) e uso moderno de `instanceof`. |
| **13** | [`DecimoTerceiroPasso`](./DecimoTerceiroPasso/README.md) | Abstração em sistema de biblioteca (`ItemBiblioteca`, `Livro`, `Revista`) com cálculo dinâmico de multas e empréstimos. |
| **14** | [`DecimoQuartoPasso`](./DecimoQuartoPasso/README.md) | **Interfaces**: criação do contrato `Tributavel` implementado por classes distintas (`ContaCorrente` e `SeguroDeVida`). |
| **15** | [`DecimoQuintoPasso`](./DecimoQuintoPasso/README.md) | Aplicação do **Padrão Strategy** via interface `Pagamento` com implementações para `Pix`, `Cartão` e `Boleto`. |
| **16** | [`DecimoSextoPasso`](./DecimoSextoPasso/README.md) | Estruturas chave-valor com `Map` / `HashMap` e iterações funcionais utilizando **Expressões Lambda**. |
| **17** | [`DecimoSetimoPasso`](./DecimoSetimoPasso/README.md) | **Exceções Personalizadas**: criação de classes herdando de `RuntimeException` (`ProdutoInvalidoException`) e controle de fluxo com `try-catch-finally`. |
| **18** | [`DecimoOitavoPasso`](./DecimoOitavoPasso/README.md) | Validações defensivas com lançamento explícito de `IllegalArgumentException` em operações de saque bancário. |
| **19** | [`DecimoNonoPasso`](./DecimoNonoPasso/README.md) | Arquitetura integrada em memória: Strategy Pattern + `Map<Integer, Transacao>` + Exceções customizadas. |
| **20** | [`VigesimoPasso`](./VigesimoPasso/README.md) | **Persistência Relacional**: CRUD completo de pagamentos com **PostgreSQL** via **JDBC**, consultas com `INNER JOIN`, conexões via `try-with-resources` e proteção contra SQL Injection. |

---

## 🛠️ Tecnologias e Boas Práticas Utilizadas

- **Linguagem:** Java 17+
- **Banco de Dados:** PostgreSQL
- **Conectividade:** JDBC (`java.sql.*`)
- **Segurança & Recursos:**
  - `PreparedStatement` para prevenção contra SQL Injection.
  - `try-with-resources` para fechamento automático de conexões e `ResultSet`.
- **Arquitetura & Design:**
  - Encapsulamento e separação de responsabilidades (Entidades, Regras de Negócio e Serviços de Conexão).
  - Interfaces e Polimorfismo (baixo acoplamento).
  - Exceções de domínio personalizadas.

---

## 💻 Como Executar os Projetos

1. **Pré-requisitos:**
   - JDK 17 ou superior instalado.
   - PostgreSQL instalado e rodando localmente (para os Passos 19 e 20).
   - Sua IDE favorita (IntelliJ IDEA, VS Code ou Eclipse).

2. **Executando um passo:**
   - Clone o repositório:
     ```bash
     git clone https://github.com/SEU-USUARIO/SEU-REPOSITORIO.git
     ```
   - Abra a pasta do passo desejado na IDE e execute o arquivo `src/Main.java`.

---

<div align="center">
  <sub>Desenvolvido com dedicação por <b>Cristhyan Gabriel Ferreira Duarte</b> durante os estudos de Java Core.</sub>
</div>
