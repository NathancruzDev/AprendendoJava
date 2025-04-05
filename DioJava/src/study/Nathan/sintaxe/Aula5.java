package edu.Nathan.aprendendoSintaxejava;

public class Aula5 {
    public static void main(String [] args) {
        int a = 5;
        int b = 6;
        String resultado;

        if (a == b) {
            resultado = "True";
        } else {
            resultado = "False";
        }

        System.out.println(resultado);

        String resultadoDois= a!=b ?"Diferente " : "Igual";

        System.out.println(resultadoDois);
    }

}
