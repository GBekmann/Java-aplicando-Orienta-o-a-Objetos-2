package br.com.alura.estudoInterface.exercicio5;

//Superclasse
public class Comerciavel implements Calculavel{
    //Atributos que serão herdados
    private String Produto;
    private double preco;

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String produto) {
        Produto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


}
