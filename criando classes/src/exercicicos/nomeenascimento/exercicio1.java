package exercicicos.nomeenascimento;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String [] args) {
        boolean tratamentoErros = false;
        Scanner scanner = new Scanner(System.in);
        Person manipulado = new Person();
        while (!tratamentoErros) {
            System.out.print("Insira o seu nome:");
            manipulado.setName(scanner.nextLine());

            System.out.printf("Insira a sua idade:");
            manipulado.setAge(scanner.nextInt());

            System.out.println("Ola " + manipulado.getName() + " voce tem " + manipulado.getAge() + " anos");
        }
    }
}
