package study.Nathan.sintaxe;
import java.util.Scanner;
import java.util.Locale;
public class ControleFluxo {
    public static void main(String [] args){
    Scanner scanner=new Scanner(System.in).useLocale(Locale.US);

        /*double saldo=25.00;
        double valorSolicitado=17.00;

        if(valorSolicitado < saldo){
            saldo=saldo-valorSolicitado;
        }
        System.out.println(saldo);
        */
        //System.out.println("Insira sua nota:");
        //int nota= scanner.nextInt();

        /*if(nota >=8 ){
            System.out.println("Parabens ,aprovado com nota:".concat(String.valueOf(nota)));
        }
        else if(nota >= 6 && nota <= 7) {
            System.out.println("Aprovado com nota:".concat(String.valueOf(nota)));
        }
        else {
            System.out.println("Reprovado com nota:".concat(String.valueOf(nota)));
        }*/
    /*
        String resultado = nota >=6 ? "Aprovado" :nota >= 6 && nota <= 7 ?"Aprovado mas da para melhorar" :"Reprovado";
        System.out.println(resultado);
    */

        System.out.println("Insira (P,M,G):");
        String sigla=scanner.next();
            switch (sigla){
                case "P":{
                    System.out.println(sigla);
                    break;
                }
                case "M":{
                    System.out.println(sigla);
                    break;
                }
                case "G":{
                    System.out.println(sigla);
                    break;
                }
                default:{
                    System.out.println("Error");
                    break;
                }
            }



    }
}
