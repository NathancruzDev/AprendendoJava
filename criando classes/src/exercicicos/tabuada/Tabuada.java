package exercicicos.tabuada;

import java.util.Scanner;

/***
 * Escreva um codigo onde o usuario entra com um numero e seja gerada a tabuada
 * de 1 ate 10 desse valor
 */

public class Tabuada {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Insira um numero:");
        int valorMudavel=scanner.nextInt();
        Tabuada.TabuadaCalc(valorMudavel);


    }

    static void TabuadaCalc(int valorMudavel){
        // 11 pois 11-1=10 ou seja o meu loop percorre 10 vezes os valores incrementados por I
        for(int i = 1; i < 11; i++){
            int calculo=valorMudavel* i;
            System.out.println(valorMudavel+" * "+ i +" = "+ calculo);
        }
    }
}
