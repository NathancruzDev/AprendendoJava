package edu.Nathan.aprendendoSintaxejava;

public class Aula4 {

    public static void main (String [] args){
           /* int mediaFinal= 7;
            if(mediaFinal >= 6){
                System.out.println("Aprovado");
            }
            else{
                System.out.println("Reprovado");
            }*/
        String name="Nathan";
        double salario= 2500;
        System.out.println("Meu Nome e ".concat(name).concat(" e recebo ").concat(String.valueOf(salario)));

        int recibo=(int) salario;
        System.out.println(recibo);

    }

}