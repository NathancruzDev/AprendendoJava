package study.Nathan.sintaxe;
import java.util.Locale;
import java.util.Scanner;

public class Terminais {
    public static void main(String[] args){
    Scanner scanner =new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Insira seu nome:");
    String nome= scanner.next();

    System.out.println("Digite seu sobrenome:");
    String sobrenome=scanner.next();

    System.out.println("Insira sua idade:");
    int idade=scanner.nextInt();

    System.out.println("Digite sua altura:");
    double altura = scanner.nextDouble();


    System.out.println("Ola "+nome+" "+sobrenome+" voce tem a idade de:"+idade+" e sua altura :"+altura);



    /*System.out.println("Compilei!");
    String nome =args[0];
    String sobrenome=args[1];
    int idade= Integer.valueOf(args[2]);
    double altura = Double.valueOf(args[3]);


    System.out.println("Ola me chamo :"+nome+" "+sobrenome);
    System.out.println("Tenho "+idade+" anos e a altura de: "+altura);*/
    }
}

