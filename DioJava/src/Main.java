public class Main {
    //o public class vai ter sempre o nome do arquivo .java ex Main.java
    //args = argumentos ou parameters
     public static void main(String [] args ){
         System.out.println("Meu primeiro programa java.");
         //variaveis compostas sempre sao inicializadas com maiusculos "camelCase"
         int $anoFabricacao= 34;
         //final == const
         final String $BR = "Brazil";
         System.out.println($BR);

         double $salarioPorHora = 0.42;

         boolean $trabalha= false;

         double somar = $anoFabricacao+$salarioPorHora;

         String $primeiroNome= "Nathan";
         String $sobreNome= "Leite da Cruz Sangy";

        String $nomeCompleto = nomeCompleto($primeiroNome,$sobreNome);
        //duas formas de chamas parametro , no segundo caso economiza memoria creio eu pois a unica funcionalidade e imprimir um nome
        System.out.println($nomeCompleto);
        System.out.println(nomeCompleto($primeiroNome,$sobreNome));
     }
     public static String nomeCompleto(String $primeiroNome, String $segundoNome){
         return "Esse e meu nome " + $primeiroNome.concat(" ").concat($segundoNome);
     }


}