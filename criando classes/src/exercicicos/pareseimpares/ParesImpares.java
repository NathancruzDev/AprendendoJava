package exercicicos.pareseimpares;
import java.util.Scanner;
    /**
     * Escreva um código que o usuário entre com um primeiro número,
     * um segundo número maior que o primeiro e escolhe entre a opção par e impar,
     * com isso o código deve informar todos os números pares ou ímpares (
     * de acordo com a seleção inicial) no intervalo de números informados,
     * incluindo os números informados e em ordem decrescente;
     */
public class ParesImpares {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Insira o primeiro numero:");
        int primeiroNumero=scanner.nextInt();

        System.out.print("Insira o segundo numero:");
        int segundoNumero=scanner.nextInt();

        System.out.print("Par ou impar:");
        String parOuImpar=scanner.next();

        calc(primeiroNumero,segundoNumero);


    }

     static void calc(int primeiroNumero,int segundoNumero){

    }
}
