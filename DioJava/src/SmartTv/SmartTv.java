package SmartTv;

public class SmartTv {
    boolean ligada=false;
    int canal;
    int volume = 25;
     // nesse projeto vou trabalhar com meus ponteiros X E Y para manter essas variaveis.
    int x;
    int y;
    public boolean ligar(){
        ligada=true;
        return ligada;
    }
    public void trocarCanal() {
        if (ligada == true){
            this.canal=x;
        }

    }
    public void volume(){
        this.volume=y;
    }

}

