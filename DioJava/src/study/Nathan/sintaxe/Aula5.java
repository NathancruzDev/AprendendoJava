package study.Nathan.sintaxe;

public class Aula5 {
    public static void main(String [] args) {
        int a = 5;
        int b = 6;
        String resultado;
        boolean resultadoDois = true;
       /* if (a == b) {
            resultado = "True";
        } else {
            resultado = "False";
        }

        System.out.println(resultado);
        */
        //String resultadoDois= a!=b ?"Diferente " : "Igual";

        //System.out.println(resultadoDois);

        if ( a == b  && resultadoDois== false){
            System.out.println("Igual e verdadeira");
        }
        else {
            System.out.println("Alguma e diferente");
        }
    }

}
