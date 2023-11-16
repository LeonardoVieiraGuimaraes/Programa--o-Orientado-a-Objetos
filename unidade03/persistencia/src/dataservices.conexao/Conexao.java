package dataservices.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private Connection conexao;
    private final String URL = "jdbc:mysql://localhost:3306/biblioteca"; // substitua "seubanco" pelo nome do seu banco
                                                                         // de
                                                                         // dados
    private final String USER = "root";
    // private final String PASSWORD = "sua_senha"; // substitua "sua_senha" pela
    // senha do seu banco de dados
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public Connection abrirConexao() {
        try {
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return conexao;
    }

    public void fecharConexao() {
        try {
            if (conexao != null) {
                conexao.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}