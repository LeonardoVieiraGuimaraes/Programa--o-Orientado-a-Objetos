package topico01;

public class Computadores extends Produtos{
//    public String processador;
//    private int memoria;
//    protected String sistemaOperacional;
//    int armazenamento;

    private String processador;
    private int memoria;
    private String sistemaOperacional;
    private int armazenamento;

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void promocao (){
        System.out.println("Este Compuador está em promoção com 15% de desconto");
    }


}
