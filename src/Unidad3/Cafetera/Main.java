package Unidad3.Cafetera;

public class Main {
    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera();
        cafetera.llenarCafetera();
        cafetera.servirTaza(200);
        cafetera.agregarCafe(456);
        cafetera.servirTaza(233);
        System.out.println(cafetera.getCantidadActual());
    }
}
