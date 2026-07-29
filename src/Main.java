import br.com.alura.estudoInterface.exercicio1.*;
import br.com.alura.estudoInterface.exercicio2.*;
import br.com.alura.estudoInterface.exercicio3.TabuadaMultiplicacao;
import br.com.alura.estudoInterface.exercicio4.ConversorTemperaturaPadrao;

public class Main {
    public static void main(String[] args) {

        //Instânciando o objeto do exercício 1
        ConversorMoeda conversorExercicio = new ConversorMoeda();
        //Inserindo um valor de saldo em Reais
        conversorExercicio.setValorSaldoEmReal(10000);
        //Imprimindo mensagem com uma das variáveis já chamando o valor convertido
        System.out.printf("""
                    CONVERSOR DE MOEDAS
                --------------------------------
                      REAL P/ DÓLAR 
                
                 * Valor do saldo em real:
                 R$%.2f
                 
                 * Valor desse saldo em Dólares
                 $%.2f
                 
                """,
                conversorExercicio.getValorSaldoEmReal(),
                conversorExercicio.converterDolarParaReal(5.08)
                );

        //Exercício 2 - Cálculo de área e perímetro

        CalculadoraSalaRetangular retanguloExercicio = new CalculadoraSalaRetangular();

        retanguloExercicio.setAltura(20);
        retanguloExercicio.setLargura(50);

        System.out.printf("""
                        Calculando área
                --------------------------------
                 * Largura: %.1f
                 * Altura: %.1f
                --------------------------------
                 * Área: %.1f m2 (Metros quadrados)
                 * Perímetro: %.1f m
                """,
                retanguloExercicio.getLargura(),
                retanguloExercicio.getAltura(),
                retanguloExercicio.calcularArea(),
                retanguloExercicio.calcularPerimetro());


        //Exercício 3 - Tabuada maluca
        TabuadaMultiplicacao tabuadinha = new TabuadaMultiplicacao();
        tabuadinha.mostrarTabuada(8);
        tabuadinha.mostrarTabuada(6);
        System.out.println("\n");


        //Exercício 4 - Conversor de temperatura
        ConversorTemperaturaPadrao conversorTemperatura = new ConversorTemperaturaPadrao();
        conversorTemperatura.celsiusParaFahrenheit(18);
        System.out.println("\n");
        conversorTemperatura.fahrenheitParaCelsius(91);

        //Exercício 5 - Calculavel
    }
}
