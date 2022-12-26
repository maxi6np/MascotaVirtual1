package Unidad3.Casa;

public class Salon {

    private boolean tieneSofa;

    private double metrosCuadrados;

    public Salon(boolean tieneSofa, double metrosCuadrados) {
        this.tieneSofa = tieneSofa;
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Salon{");
        sb.append("tieneSofa=").append(tieneSofa);
        sb.append(", metrosCuadrados=").append(metrosCuadrados);
        sb.append('}');
        return sb.toString();
    }
}
