# 📌 Passo 21: Sistema de Autenticação e Contratos de Login (`VigesimoPrimeiroPasso`)

## 📝 O que o código faz
Este projeto implementa um fluxo seguro de controle de acesso e autenticação de usuários via terminal:
1. Apresenta um menu de autenticação com 3 opções principais:
   - **1. CADASTRO:** Solicita nome de usuário (*nickname*) e senha, instanciando uma entidade `Usuario` que implementa a interface de autenticação `Login`.
   - **2. LOGIN:** Valida se já existe um usuário cadastrado no sistema; caso positivo, solicita as credenciais e as submete ao método `acessar(usuario, senha)`. Retorna mensagem de sucesso ou alerta de falha de credenciais.
   - **3. FECHAR:** Encerra a aplicação.

---

## 🧠 Conceitos Utilizados
- **Interfaces de Autenticação (`interface Login`):** Definição de contrato de segurança especificando a assinatura do método `String acessar(String usuario, String senha)`.
- **Implementação e Polimorfismo por Interface:** A variável receptora no `Main` é declarada como o tipo genérico `Login entrar = null;` e inicializada com a classe concreta `new Usuario(usuario, password)`.
- **Encapsulamento e Proteção de Credenciais:** As propriedades de acesso (`nick`, `senhaAcesso`) são declaradas como `private`, impedindo alterações arbitrárias fora da classe.
- **Validação Condicional Estrita de Credenciais:** Uso de `this.nick.equals(usuario) && this.senhaAcesso.equals(senha)` para validação simultânea e segura de chaves de acesso.
- **Tratamento de Estado Nulo (*Null Checking*):** Verificação preventiva `if (entrar == null)` para impedir erros de referência nula (`NullPointerException`) caso o usuário tente efetuar login antes de realizar o cadastro.

---

## 📂 Estrutura de Arquivos
| Arquivo | Responsabilidade |
| :--- | :--- |
| `src/Login.java` | Interface que define o contrato do método de verificação de credenciais (`acessar`). |
| `src/Usuario.java` | Classe de entidade que armazena os dados do usuário e implementa a lógica de comparação de credenciais. |
| `src/Main.java` | Ponto de entrada com menu interativo para cadastro e validação de login. |

---

## ▶️ Como Executar
Na raiz da pasta `VigesimoPrimeiroPasso`:
```bash
javac src/*.java -d out
java -cp out Main
```
Ou execute a classe `Main.java` diretamente na sua IDE.
