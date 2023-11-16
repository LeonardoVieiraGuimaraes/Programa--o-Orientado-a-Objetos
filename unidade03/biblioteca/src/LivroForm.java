import javax.swing.*;
import java.awt.event.*;

import dao.LivroDAO;
import model.Livro;

public class LivroForm {
    private JFrame frame;
    private JTextField tituloField;
    private JTextField autorField;
    private JTextField paginasField;
    private JTextField editoraField;
    private JTextField isbnField;
    private JTextField avaliacaoField;
    private JButton salvarButton;
    private LivroDAO livroDAO;

    public LivroForm() {
        livroDAO = new LivroDAO();
        frame = new JFrame("Inserir Livro");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel tituloLabel = new JLabel("Título");
        tituloLabel.setBounds(10, 10, 80, 25);
        panel.add(tituloLabel);

        tituloField = new JTextField(20);
        tituloField.setBounds(100, 10, 160, 25);
        panel.add(tituloField);

        JLabel autorLabel = new JLabel("Autor");
        autorLabel.setBounds(10, 40, 80, 25);
        panel.add(autorLabel);

        autorField = new JTextField(20);
        autorField.setBounds(100, 40, 160, 25);
        panel.add(autorField);

        JLabel paginasLabel = new JLabel("Páginas");
        paginasLabel.setBounds(10, 70, 80, 25);
        panel.add(paginasLabel);

        paginasField = new JTextField(20);
        paginasField.setBounds(100, 70, 160, 25);
        panel.add(paginasField);

        JLabel editoraLabel = new JLabel("Editora");
        editoraLabel.setBounds(10, 100, 80, 25);
        panel.add(editoraLabel);

        editoraField = new JTextField(20);
        editoraField.setBounds(100, 100, 160, 25);
        panel.add(editoraField);

        JLabel isbnLabel = new JLabel("ISBN");
        isbnLabel.setBounds(10, 130, 80, 25);
        panel.add(isbnLabel);

        isbnField = new JTextField(20);
        isbnField.setBounds(100, 130, 160, 25);
        panel.add(isbnField);

        JLabel avaliacaoLabel = new JLabel("Avaliação");
        avaliacaoLabel.setBounds(10, 160, 80, 25);
        panel.add(avaliacaoLabel);

        avaliacaoField = new JTextField(20);
        avaliacaoField.setBounds(100, 160, 160, 25);
        panel.add(avaliacaoField);

        salvarButton = new JButton("Salvar");
        salvarButton.setBounds(10, 220, 80, 25);
        panel.add(salvarButton);

        salvarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Livro novoLivro = new Livro();
                novoLivro.setTitulo(tituloField.getText());
                novoLivro.setAutor(autorField.getText());
                // Repita para os outros campos...
                livroDAO.save(novoLivro);
            }
        });
    }

    public static void main(String[] args) {
        new LivroForm();
    }
}