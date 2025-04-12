package exercicicos;

import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Person menino = new Person();
        String name = menino.getNome("Joao");
        int idade = menino.getAge(18);
        System.out.println("Ola "+ name + " voce fez "+ idade);

    }
}