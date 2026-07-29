package br.com.alura.estudoInterface.exercicio5;

public class ProdutoFisico implements Calculavel {
    //Atributos
    private String nomeProduto;
    private double preco;

    @Override
    public double calcularPrecoFinal() {
        return preco * 0.9;
    }
}
