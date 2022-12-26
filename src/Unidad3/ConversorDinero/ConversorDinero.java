package Unidad3.ConversorDinero;

public class ConversorDinero {

    private int euros;
    private final int billete10 = 10;
    private final int billete5 = 5;
    private final int moneda2 = 2;
    private final int moneda1 = 1;

    private int contador10 = 0;
    private int contador5 = 0;
    private int contador2 = 0;
    private int contador1 = 0;

    public ConversorDinero(int euros) {
        this.euros = euros;
        if (euros > 0 && euros < 100) {
            float contadorGeneral = euros;

            for (int i = 1; i <= euros; i++) {
                if (billete10 <= contadorGeneral) {
                    contadorGeneral -= billete10;
                    contador10++;
                }
            }
            for (int i = 1; i <= euros; i++) {
                if (billete5 <= contadorGeneral) {
                    contadorGeneral -= billete5;
                    contador5++;
                }
            }
            for (int i = 1; i <= euros; i++) {
                if (moneda2 <= contadorGeneral) {
                    contadorGeneral -= moneda2;
                    contador2++;
                }
            }
            for (int i = 1; i <= euros; i++) {
                if (moneda1 <= contadorGeneral) {
                    contadorGeneral -= moneda1;
                    contador1++;
                }
            }
        } else {
            System.out.println("Introduzca un número positivo y menor de 100");
        }
    }

    public int getEuros() {
        return euros;
    }

    public void setEuros(int euros) {
        this.euros = euros;
    }

    public String printDescomposicionMonedas() {
        final StringBuilder sb = new StringBuilder();
        sb.append(euros);
        sb.append("€ son: ");
        sb.append("\nBilletes de ");
        sb.append(billete10);
        sb.append(" = ");
        sb.append(contador10);

        sb.append("\nBilletes de ");
        sb.append(billete5);
        sb.append(" = ");
        sb.append(contador5);

        sb.append("\nMonedas de ");
        sb.append(moneda2);
        sb.append(" = ");
        sb.append(contador2);

        sb.append("\nMonedas de ");
        sb.append(moneda1);
        sb.append(" = ");
        sb.append(contador1);

        return sb.toString();
    }
}
