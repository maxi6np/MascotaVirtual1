package Unidad3.Casa;

public class Frigorifico {
    private int numCajones;
    private  int numEstanterias;
    private boolean tieneCongelador;

    public Frigorifico(int numCajones, int numEstanterias, boolean tieneCongelador) {
        this.numCajones = numCajones;
        this.numEstanterias = numEstanterias;
        this.tieneCongelador = tieneCongelador;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Frigorifico{");
        sb.append("numCajones=").append(numCajones);
        sb.append(", numEstanterias=").append(numEstanterias);
        sb.append(", tieneCongelador=").append(tieneCongelador);
        sb.append('}');
        return sb.toString();
    }
}
