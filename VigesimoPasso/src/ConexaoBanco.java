package sistema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {

    private static final String URL = "jdbc:postgresql://localhost:5432/estudos_java";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "0707";

    public static Connection obterConexao() {
        try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao PostgreSQL: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
