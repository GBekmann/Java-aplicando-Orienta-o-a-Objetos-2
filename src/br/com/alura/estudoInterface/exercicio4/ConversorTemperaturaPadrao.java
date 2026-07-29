package br.com.alura.estudoInterface.exercicio4;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public void fahrenheitParaCelsius(double temperaturaFahrenheit) {
        //Conversão de Fahrenheit --> Celsius
        double temperaturaConvertida = (temperaturaFahrenheit - 32) / 1.8;

        System.out.printf("""
                --------------------------------
                        TEMPERATURA DE
                    FAHRENHEIT P/ CELSIUS
                --------------------------------
                 * Temperatura em Fahrenheit:
                     %.1ff

                 * Conversão em Celsius:
                     %.1fc
                --------------------------------
                """, temperaturaFahrenheit, temperaturaConvertida);
    }

    @Override
    public void celsiusParaFahrenheit(double temperaturaCelsius) {
        //Conversão de Celsius --> Fahrenheit
        double temperaturaConvertida = (temperaturaCelsius * 1.8) + 32;

        System.out.printf("""
                --------------------------------
                        TEMPERATURA DE
                     CELSIUS P/ FAHRENHEIT
                --------------------------------
                 * Temperatura em Celsius:
                     %.1fc

                 * Conversão em Fahrenheit:
                     %.1ff
                --------------------------------
                """, temperaturaCelsius, temperaturaConvertida);

    }
}