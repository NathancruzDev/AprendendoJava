package exercicicos.IMC;

import java.util.Scanner;

/**
 *Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu
 *  IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:
 * Se for menor ou igual a 18,5 "Abaixo do peso";
 * se for entre 18,6 e 24,9 "Peso ideal";
 * Se for entre 25,0 e 29,9 "Levemente acima do peso";
 * Se for entre 30,0 e 34,9 "Obesidade Grau I";
 * Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
 * Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
 */
public class Imc{
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculador de Imc ...");
        System.out.print("Insira a sua altura:");
        double altura=scanner.nextDouble();
        System.out.print("Insira o seu peso:");
        double peso=scanner.nextDouble();
        calcImc(altura,peso);

    }

    static void  calcImc(double altura,double peso){
        double formula=peso/(altura*altura);
        if(formula <= 18.5){
            System.out.println("Abaixo do peso");
        }
        else if(formula <= 24.9 ){
            System.out.println("Peso Ideal");
        }
        else if(formula <=29.9){
            System.out.println("Levemente acima do peso");
        }
        else if( formula <= 34.9){
            System.out.println("Obesidade Grau I");
        }
        else if(formula <= 39.9){
            System.out.println("Obesidade Grau II (Severa)");
        }
        else if(formula >= 40){
            System.out.println("Obesidade III (Mórbida)");
        }
    }
}
