package Unidad3.Calentador;

public class Calentador {
    private int temperatura;
    private int minimo;
    private int maximo;
    private int incremento;

    public Calentador(int minimo, int maximo) {
        this.minimo = minimo;
        this.maximo = maximo;
        temperatura = 15;
        incremento = 5;
    }

    public boolean calentar() {
        if ((temperatura + incremento) <= maximo) {
            temperatura += incremento;
            return true;
        } else {
            return false;
        }
    }

    public boolean enfriar() {
        if ((temperatura - incremento) >= minimo) {
            temperatura -= incremento;
            return true;
        } else {
            return false;
        }

    }

    public int getTemperatura() {
        return temperatura;
    }

    public boolean setIncremento(int incremento) {
        if (incremento >= 0) {
            temperatura += incremento;
            return true;
        } else {
            return false;
        }
    }
}
