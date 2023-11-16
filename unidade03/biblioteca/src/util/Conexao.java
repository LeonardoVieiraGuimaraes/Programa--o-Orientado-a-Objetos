package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/biblioteca"; // substitua "nome_do_banco_de_dados"
                                                                                // pelo nome do seu banco de dados
    private static final String USER = "root"; // usuário padrão do XAMPP é "root"
    private static final String PASSWORD = ""; // senha padrão do XAMPP é vazia

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco de dados", e);
        }
    }
}