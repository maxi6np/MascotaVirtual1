package Unidad3.Ordenador;

public class Ordenador {

    private int maxMemoria;
    private int memoriaInstalada;

    public Ordenador(int maxMemoria) {
        this.maxMemoria = maxMemoria;
        if (maxMemoria <= 0) {
            this.maxMemoria = 1024;
        }
        this.memoriaInstalada = 0;
    }

    public int getMaxMemoria() {
        return maxMemoria;
    }

    public int obtenerMemoriaDisponible() {
        return maxMemoria - memoriaInstalada;
    }

    public void vaciarMemoria() {
        memoriaInstalada = 0;
    }

    public boolean instalar256Mb() {
        if (obtenerMemoriaDisponible() < 256) {
            return false;
        } else {
            memoriaInstalada += 256;
            return true;
        }
    }

    public boolean instalarMemoria(int cantidadMemoria) {
        if (obtenerMemoriaDisponible() > cantidadMemoria && cantidadMemoria > 0) {
            memoriaInstalada += cantidadMemoria;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Este ordenador puede tener hasta ");
        sb.append(getMaxMemoria());
        sb.append("MB de memoria. ");
        sb.append("Todavía es posible instalar ");
        sb.append(obtenerMemoriaDisponible());
        sb.append("MB");

        return sb.toString();
    }


}
