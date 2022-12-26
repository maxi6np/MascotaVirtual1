package Unidad3.Hucha;

public class Main {
    public static void main(String[] args) {
        Hucha num1 = new Hucha();
        num1.printDetalles();
        num1.meterDinero(9);
        num1.getDinero();
        num1.printDetalles();
        num1.sacarDinero(3);
        num1.getDinero();
        num1.printDetalles();
    }
}
