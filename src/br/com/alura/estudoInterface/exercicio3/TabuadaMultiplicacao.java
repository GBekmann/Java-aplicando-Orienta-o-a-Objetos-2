package br.com.alura.estudoInterface.exercicio3;

public class TabuadaMultiplicacao implements Tabuada{

    //Implementação da interface
    @Override
    public void mostrarTabuada(int numero) {
        System.out.printf("""
                \n--------------------------------
                        TABUADA DO %d
                --------------------------------
                """, numero);
        //Laço de repetição que vai executando do 1 ao 10 a multiplicação
        for (int multiplicador = 1; multiplicador <= 10; multiplicador++){
            //Impressão do laço com a continha e o resultado
            System.out.println(numero + " X " + multiplicador + " = " + numero *multiplicador);
        }
        System.out.println("--------------------------------");
    }
}
