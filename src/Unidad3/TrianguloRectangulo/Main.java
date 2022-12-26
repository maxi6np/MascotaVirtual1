package Unidad3.TrianguloRectangulo;

public class Main {
    public static void main(String[] args) {
        TrianguloRectangulo t1 = new TrianguloRectangulo(5, 7);
        System.out.println(t1.obtenerHipotenusa());

        t1.setCateto1(12);
        System.out.println(t1.obtenerHipotenusa());

        Cuadrado c1 = new Cuadrado(6);

        Dibujo d1 = new Dibujo("Ecce Hommo", "Felissa");
        d1.setCuadrado(c1);
        d1.setTrianguloRectangulo(t1);
    }
}
