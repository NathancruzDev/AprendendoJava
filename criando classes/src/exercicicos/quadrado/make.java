package exercicicos.quadrado;

import java.util.Scanner;

public class make {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Formas quadrado= new Formas();


        System.out.print("Digite o lado da Base:");
        quadrado.setLadoBase(scanner.nextInt());
        System.out.print("Digite o lado da altura:");
        quadrado.setLadoAltura(scanner.nextInt());
        System.out.println("fórmula: área=base X altura");
        System.out.println("fórmula:"+ quadrado.calcQuadrado(quadrado.getLadoAltura(), quadrado.getLadoBase())+ " = "+ quadrado.getLadoBase()+ " * "+ quadrado.getLadoAltura());

    }
}
