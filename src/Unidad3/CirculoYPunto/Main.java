package Unidad3.CirculoYPunto;

public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(2,4);
        Punto p2 = new Punto(12,5);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.getDistanciaDesde(p2));
        System.out.println(p2.getDistanciaDesdeOrigen());

        Circulo c1 = new Circulo(2,p1);
        c1.printCirculo();

    }
}
