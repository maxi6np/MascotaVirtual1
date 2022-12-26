package Unidad3.Casa;


public class Cocina {
    private boolean tieneMesa;
    private Frigorifico frigo;
    private double metrosCuadrados;

    public Cocina(boolean tieneMesa, Frigorifico frigo, double metrosCuadrados) {
        this.tieneMesa = tieneMesa;
        this.frigo = frigo;
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cocina{");
        sb.append("tieneMesa=").append(tieneMesa);
        sb.append(", frigo=").append(frigo);
        sb.append(", metrosCuadrados=").append(metrosCuadrados);
        sb.append('}');
        return sb.toString();
    }
}
