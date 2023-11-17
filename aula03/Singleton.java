package aula03;

// A classe Singleton garante que apenas uma instância dessa classe exista durante a execução do programa.
public class Singleton {
    // A variável 'instancia' é declarada como 'volatile' para garantir que
    // múltiplas threads lidem com a variável
    // de maneira correta quando ela está sendo inicializada para a instância
    // Singleton.
    private static volatile Singleton instancia;

    // O construtor privado impede que outras classes instanciem esta classe
    // diretamente.
    private Singleton() {

        // Construtor privado para evitar instanciação direta.
    }

    // O método 'getInstance' controla a instância desta classe. A primeira vez que
    // este método é chamado,
    // a instância Singleton é criada. Nas próximas vezes, a mesma instância é
    // retornada.
    public static Singleton getInstance() {
        // Primeiro, verificamos se a instância já foi criada.
        if (instancia == null) {
            // Se a instância ainda não foi criada, entramos em um bloco sincronizado para
            // evitar que várias threads
            // criem múltiplas instâncias.
            synchronized (Singleton.class) {
                // Dentro do bloco sincronizado, verificamos novamente se a instância já foi
                // criada.
                // Isso é necessário porque enquanto uma thread estava esperando para entrar no
                // bloco sincronizado,
                // outra thread pode ter criado a instância.
                if (instancia == null) {
                    // Se a instância ainda não foi criada, a criamos aqui.
                    instancia = new Singleton();
                }
            }
        }
        // Retornamos a instância Singleton.
        return instancia;
    }
}