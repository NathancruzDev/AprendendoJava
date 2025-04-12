package exercicicos.diferencaIdade;

import java.util.Scanner;

public class diferenca {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        Person pessoa1= new Person();
        Person pessoa2= new Person();


        System.out.print("Insira o nome da primeira pessoa:");
        pessoa1.setName(scanner.nextLine());

        System.out.print("Insira idade da primeira pessoa:");
        pessoa1.setAge(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Insira o nome da segunda pessoa:");
        pessoa2.setName(scanner.nextLine());


        System.out.print("Insira idade da segunda pessoa pessoa:");
        pessoa2.setAge(scanner.nextInt());

        int diferenca=Math.abs(CalcularDiferenca.diferencaAge(pessoa1,pessoa2));
        if(pessoa1.getAge() > pessoa2.getAge()){
            System.out.println(pessoa1.getName() + " e mais velho em "+ diferenca + " anos");
        }
        else if(pessoa2.getAge()> pessoa1.getAge()){
            System.out.println(pessoa2.getName() + " e mais velho em "+ diferenca + " anos");
        }
        else{
            System.out.println("Eles possuem a mesma idade!");
        }
    }
}
