package Unidad3.Numeros;

public class Numeros {
    private int numero1;
    private int numero2;
    private int numero3;

    public Numeros(int numero1, int numero2, int numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    public int getMaximo() {
        int comparacion1 = Math.max(numero1, numero2);
        int comparacion2 = Math.max(numero3, numero2);
        return Math.max(comparacion1, comparacion2);
    }

    public int getMinimo() {
        int comparacion1 = Math.min(numero1, numero2);
        int comparacion2 = Math.min(numero3, numero2);
        return Math.min(comparacion1, comparacion2);
    }

    public boolean sonIguales() {
        return numero1 == numero2 && numero2 == numero3;
    }

    public int cuantosPares() {
        int contador = 0;
        if (numero1 % 2 == 0) {
            contador++;
        }
        if (numero2 % 2 == 0) {
            contador++;
        }
        if (numero3 % 2 == 0) {
            contador++;
        }
        return contador;
    }

    public int cuantosAcabanEn7() {
        int conta7 = 0;
        if (numero1 % 10 == 7) {
            conta7++;
        }
        if (numero2 % 10 == 7) {
            conta7++;
        }
        if (numero3 % 10 == 7) {
            conta7++;
        }
        return conta7;
    }

    public void ordenar() {
        int min = getMinimo();
        int max = getMaximo();
        if (numero1 > min){
            if (numero1 < max){
                numero2 = numero1;
            }
        }
        if (numero3 > min){
            if (numero3 < max){
                numero2 = numero3;
            }
        }
        numero1 = min;
        numero3 = max;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(numero1);
        sb.append("-");
        sb.append(numero2);
        sb.append("-");
        sb.append(numero3);
        sb.append("\n");
        sb.append(numero3);
        sb.append("-");
        sb.append(numero2);
        sb.append("-");
        sb.append(numero1);
        return sb.toString();
    }

}
