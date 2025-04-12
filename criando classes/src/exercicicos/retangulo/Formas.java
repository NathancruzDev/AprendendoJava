package exercicicos.retangulo;

public class Formas {
    int ladoAltura;
    int ladoBase;

    public int getLadoAltura(){
        return ladoAltura;
    }

    public void setLadoAltura(int ladoAltura){
        this.ladoAltura=ladoAltura;
    }

    public int getLadoBase(){
        return ladoBase;
    }
    public void setLadoBase(int ladoBase){
        this.ladoBase= ladoBase;
    }

    public int calcular(int ladoBase,int ladoAltura){
        if (ladoBase == ladoAltura){
            throw new IllegalArgumentException("Os lados devem ser diferentes para ser um retangulo");

        }
        return getLadoAltura() * getLadoBase();
    }

}
