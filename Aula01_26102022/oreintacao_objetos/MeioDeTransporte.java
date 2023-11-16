
package oreintacao_objetos;

public class MeioDeTransporte {
    private int ano;
    private int quantidadePassageiros;
    private String combustiveis;

    // Quando formos acessar, “pegar” alguns atributos da classe, devemos utilizar
    // os métodos GET. Esse método sempre retornará um valor, seja ele String, int
    // ,double etc.

    public int getAno() {
        return ano;
    }

    // Para alterarmos, modificarmos os valores de um atributo da classe de maneira
    // protegida, utilizamos os métodos SET. Esse método não terá um retorno, pois o
    // atributo será somente modificado, criando um método de tipo VOID, sem
    // retorno.
    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    public void setQuantidadePassageiros(int quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public String getCombustiveis() {
        return combustiveis;
    }

    public void setCombustiveis(String combustiveis) {
        this.combustiveis = combustiveis;
    }

    public void acenderLuzes() {
        System.out.printf("Acendeu a Luz do Meio de Trasnporte \n");

    }
}
