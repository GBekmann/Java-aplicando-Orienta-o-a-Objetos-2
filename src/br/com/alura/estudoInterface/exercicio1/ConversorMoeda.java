package br.com.alura.estudoInterface.exercicio1;

public class ConversorMoeda implements ConversaoFinanceira {

    private double valorSaldoEmReal;

    /*
        Conversor de moedas

        Caso a moeda que você quiser cotar na conversão tiver um valor menor que a outra que você quer
        Você divide

        Se a moeda que for converter for mais barata que a desejada, multiplique
     */

    //Getters & Setters


    public double getValorSaldoEmReal() {
        return valorSaldoEmReal;
    }

    public void setValorSaldoEmReal(double valorSaldoEmReal) {
        this.valorSaldoEmReal = valorSaldoEmReal;
    }

    @Override
    public double converterDolarParaReal(double cotacaoDolar) {
        return valorSaldoEmReal / cotacaoDolar;
    }
}
