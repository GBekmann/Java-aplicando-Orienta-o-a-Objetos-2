package br.com.alura.estudoInterface.exercicio2;

public class CalculadoraSalaRetangular implements CalculoGeometrico{

    public CalculadoraSalaRetangular() {
    }

    public CalculadoraSalaRetangular(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    private double altura;
    private double largura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        //Área é altura multiplicada pela largura
        return altura * largura;
    }

    @Override
    public double calcularPerimetro() {
        // Perímetro = 2 × (altura + largura)
        return 2 * (altura + largura);
    }
}
