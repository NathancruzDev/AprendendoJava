package exercicicos.retangulo;

import java.util.Scanner;

public class make {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Formas retangulo=new Formas();

        System.out.print("Insira o lado da base:");
        retangulo.setLadoBase(scanner.nextInt());

        System.out.print("Insira o lado da altura:");
        retangulo.setLadoAltura(scanner.nextInt());

        System.out.println("fórmula: área=base X altura");
        System.out.println(retangulo.calcular(retangulo.getLadoBase(), retangulo.getLadoAltura()) +" = "+ retangulo.getLadoBase() +" * "+ retangulo.getLadoAltura());



    }
}
