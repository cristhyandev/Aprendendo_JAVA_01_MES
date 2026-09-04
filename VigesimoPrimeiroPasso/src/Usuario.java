package sign_in;

public class Usuario implements sign_in.Login {

    private String nick;
    private String senhaAcesso;

    public Usuario(String nick, String senhaAcesso){
        this.nick = nick;
        this.senhaAcesso = senhaAcesso;
    }

    @Override
    public String acessar(String usuario, String senha) {
        if (this.nick.equals(usuario)&& this.senhaAcesso.equals(senha)){
            return "Login concluído com sucesso";
        }
        else {
            return "Falha no Login: Usuário ou senha incorretos.";
        }

    }
}
