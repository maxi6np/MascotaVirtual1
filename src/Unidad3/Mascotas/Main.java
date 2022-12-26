package Unidad3.Mascotas;

public class Main {
    public static void main(String[] args) {
        Perro sanche = new Perro(47, "socialista", "moreno", "sanche", false);
        Perro max = new Perro("max", "labrador", "negro");


        Perro aux = sanche;
        sanche = max;
        max = aux;

        sanche.imprimir();
        max.imprimir();

        Gato doraemon = new Gato ();
        doraemon.comer();


    }
}
