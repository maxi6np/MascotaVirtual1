package Unidad3.PersonajeVideojuego;

public class Main {
    public static void main(String[] args) {
        Personaje mickey = new Personaje("Mickey");
        mickey.avanzar(21);
        mickey.avanzar(- 4);
        mickey.girar();
        mickey.girar();
        mickey.girar();
        mickey.girar();
        System.out.println(mickey);
    }
}
