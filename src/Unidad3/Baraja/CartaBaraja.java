package Unidad3.Baraja;

public class CartaBaraja {
    private int valor;
    private int palo;
    private final int OROS = 1;
    private final int COPAS = 2;
    private final int ESPADAS = 3;
    private final int BASTOS = 4;

    public CartaBaraja(int queValor,int quePalo){
        this.valor = queValor;
        this.palo = quePalo;
    }

    public String getValor() {
        if (valor == 1){
            return "uno";
        } else if (valor == 2) {
            return "dos";
        } else if (valor == 3) {
            return "tres";
        } else if (valor == 4) {
            return "cuatro";
        } else if (valor == 5) {
            return "cinco";
        } else if (valor == 6) {
            return "seis";
        } else if (valor == 7) {
            return "siete";
        } else if (valor == 8) {
            return "ocho";
        } else if (valor == 9) {
            return "nueve";
        } else if (valor == 10) {
            return "sota";
        } else if (valor == 11) {
            return "caballo";
        } else if (valor == 12) {
            return "rey";
        } else{
            return "valor incorrecto";
        }
    }

    public String getPalo() {
        return switch (this.palo) {
            case OROS -> "oros";
            case COPAS -> "copas";
            case ESPADAS -> "espadas";
            case BASTOS -> "bastos";
            default -> "palo incorrecto";
        };
    }
    public String toString(){
        StringBuilder sb = new StringBuilder(getValor());
        sb.append(" de ");
        sb.append(getPalo());
        return sb.toString();
    }

}
