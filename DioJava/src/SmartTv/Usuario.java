package SmartTv;

/**
 * Tenho o intuito de ampliar a ativade passada nas primeiras aulas fazendo ela funcionar
 * em uma especie de loop , que mantenha a tv ligada e alterne os canais.
 * ampliando minha logica , minha classe SmartTv no arquivo SmartTv.java e essencia;/
 */

public class Usuario {
    public static void main(String [] args ){
     SmartTv smarTv = new SmartTv();
        smarTv.ligar();
     if(smarTv.ligada==true){
         new Usuario().startScreen();
     }

     System.out.println("TV ligada? "+smarTv.ligada);
     System.out.println("Canal atual :"+smarTv.canal);
     System.out.println("Volume Atual:"+smarTv.volume);



    }
    public void startScreen(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
