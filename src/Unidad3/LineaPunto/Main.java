package Unidad3.LineaPunto;

public class Main {
    public static void main(String[] args) {
        Punto p1  =new Punto(2,3);
        Punto p2  =new Punto(7,1);
        p1.desplaza(-3,-2);
        Linea l1 = new Linea(p1,p2);
        System.out.println(l1);
    }
}
