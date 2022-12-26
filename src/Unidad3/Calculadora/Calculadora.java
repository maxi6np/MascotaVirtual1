package Unidad3.Calculadora;

public class Calculadora {
    private int cantidad;
    private int suma;
    private int maximo;
    private int minimo;

    public Calculadora() {
        this.cantidad = 0;
        this.suma = 0;
        this.maximo = 0;
        this.minimo = 0;

    }

    public int getCantidad() {
        return cantidad;
    }

    public int getMaximo() {
        return maximo;
    }

    public int getMinimo() {
        return minimo;
    }

    public void introducirNumero(int numero) {
        suma += numero;
        cantidad++;
        maximo = Math.max(numero, maximo);
        minimo = Math.min(numero, minimo);
    }

    public double getMedia() {
        return ((float) suma / cantidad);
    }
}
