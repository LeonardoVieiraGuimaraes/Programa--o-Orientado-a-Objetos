package topico03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    private Connection conexao;
    private final String URL = "jdbc:mysql://localhost:3306/livraria";
    private final String USER = "root";
    private final String PASSWORD = "270414";

    public Connection openConexao() {
        try {
            conexao = DriverManager.getConnection(URL, USER, PASSWORD);
            String sql = "INSERT into livro (id, titulo, autor, paginas, editora, isbn, avaliacao) ";
        } catch (SQLException e) {
            System.out.println("Erro ao estabelecer a conexão com o banco de dados");
            e.printStackTrace();
        }
        return conexao;
    }

    public void closeConexao() {
        if (conexao != null) {
            try {
                conexao.close();
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexão com o banco de dados");
                e.printStackTrace();
            }
        }
    }
}

//public class topico03.Conexao {
//    private Connection conexao;
//    private final String URL = "jdbc:mysql://localhost:3306/livraria";
//    private final String USER = "root";
//    private final String PASSWORD = "270414";
//    private final String TPCONEXAO = "com.mysql.jdbc.Driver";
//
//    public Connection openConexao() {
//        try {
//            Class.forName(TPCONEXAO);
//            conexao = java.sql.DriverManager.getConnection(URL, USER, PASSWORD);
//        } catch (ClassNotFoundException | SQLException e) {
//            System.out.println("Erro ao carregar o driver JDBC");
//            e.printStackTrace();
//        }
//        return conexao;
//    }
//
//    public void closeConexao() {
//        if (conexao != null) {
//            try {
//                conexao.close();
//            } catch (SQLException e) {
//                System.out.println("Erro ao fechar a conexão com o banco de dados");
//                e.printStackTrace();
//            }
//        }
//    }
//}