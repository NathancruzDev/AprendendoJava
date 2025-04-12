package exercicicos.diferencaIdade;

public class CalcularDiferenca {
    public static int diferencaAge(Person pessoa1,Person pessoa2){
        if(pessoa1.getAge()==pessoa2.getAge()){
            System.out.println("Eles possuem a mesma idade");
        }
        return pessoa1.getAge() - pessoa2.getAge();
    }
}
