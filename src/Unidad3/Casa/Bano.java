package Unidad3.Casa;

public class Bano {
    private boolean tieneDucha;
    private double metrosCuadrados;

    public Bano(boolean tieneDucha, double metrosCuadrados) {
        this.tieneDucha = tieneDucha;
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bano{");
        sb.append("tieneDucha=").append(tieneDucha);
        sb.append(", metrosCuadrados=").append(metrosCuadrados);
        sb.append('}');
        return sb.toString();
    }
}
