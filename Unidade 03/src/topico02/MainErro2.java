package topico02;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MainErro2 {

    public static void main(String[] args) {
        try {
            criarArquivo("arquivo.txt");
        } catch (IOException e) {

            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        public static void criarArquivo(String nome) throws FileNotFoundException, SQLException {
            new java.io.FileOutputStream(nome);
        }
}
