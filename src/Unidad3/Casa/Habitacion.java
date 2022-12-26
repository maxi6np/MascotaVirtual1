package Unidad3.Casa;


public class Habitacion {
    private int numCamas;
    private double metrosCuadrados;
    private int numArmarios;
    private Bano bano;

    public Habitacion(int numCamas, double metrosCuadrados, int numArmarios) {
        this.numCamas = numCamas;
        this.metrosCuadrados = metrosCuadrados;
        this.numArmarios = numArmarios;
    }

    public Bano getBano() {
        return bano;
    }

    public void setBano(Bano bano) {
        this.bano = bano;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Habitacion{");
        sb.append("numCamas=").append(numCamas);
        sb.append(", metrosCuadrados=").append(metrosCuadrados);
        sb.append(", numArmarios=").append(numArmarios);
        sb.append(", bano=").append(bano);
        sb.append('}');
        if (bano != null) {
            bano.toString();
        }
        return sb.toString();
    }

}
