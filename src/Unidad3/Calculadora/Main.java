package Unidad3.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora miCalculadora = new Calculadora();
        miCalculadora.introducirNumero(-1);
        miCalculadora.introducirNumero(120);
        miCalculadora.introducirNumero(3);
        System.out.println(miCalculadora.getMaximo());
        System.out.println(miCalculadora.getMinimo());
        System.out.println(miCalculadora.getMedia());
    }
}
