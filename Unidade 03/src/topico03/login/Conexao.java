package topico03.login;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static Connection con;
    private final static String URL = "jdbc:mysql://localhost:3306/acesso?useTimezone=true&serverTimezone=UTC";
    private final static String USUARIO = "root";
    private final static String SENHA = "270414";
    private final static String DRIVER = "com.mysql.cj.jdbc.Driver";

    public static Connection getConnection() throws ClassNotFoundException {

        System.out.println("Conectando ao banco...");

        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USUARIO, SENHA);
//            System.out.println("Conectado com sucesso!");
        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao carregar o diver");
            e.printStackTrace();

        } catch (SQLException e ) {
            System.out.println("Erro ao acessar ao banco");
            e.printStackTrace();
        }
        return con;
    }


    public static void main(String[] args) throws ClassNotFoundException {
        Connection c = Conexao.getConnection();
        System.out.println("Connected com sucesso!");
    }
}

