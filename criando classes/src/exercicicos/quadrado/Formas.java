package exercicicos.quadrado;

public class Formas {
    int ladoBase;
    int ladoAltura;

    public int getLadoBase() {
        return ladoBase;
    }

    public void setLadoBase(int ladoBase) {
        this.ladoBase = ladoBase;
    }

    public int getLadoAltura() {
        return ladoAltura;
    }

    public void setLadoAltura(int ladoAltura) {
        this.ladoAltura = ladoBase;
    }

    public int calcQuadrado(int ladoAltura, int ladoBase) {
        if (ladoBase != ladoAltura) {
            throw new IllegalArgumentException("Um quadrado precisa ter os lados iguais.");

        }
        return getLadoAltura()*getLadoBase();
    }

}



