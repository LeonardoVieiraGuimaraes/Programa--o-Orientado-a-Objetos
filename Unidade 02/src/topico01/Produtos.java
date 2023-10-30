package topico01;

public class Produtos {
    private double preco;
    private String marca;
    private String modelo;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

   public void promocao (){
        System.out.println("Este Produto não está em promoção");
   }
}
