package ejercicio2;

import java.util.Scanner;

/**
 * @author -
 *   Todo el código se escribirá dentro del main()
 */
public class AppLanzadora {

    /**
     * Incluye código para probar
     * los métodos de las clases Lanzadora,  Punto y Direccion
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // CREAR LANZADERA
        System.out.print("Teclee x: ");
        int x = teclado.nextInt();
        System.out.print("Teclee y: ");
        int y = teclado.nextInt();
        System.out.print("Teclee dirección (1 - ESTE / 2 - OESTE) : ");
        int dir = teclado.nextInt();
        while (dir != 1 && dir != 2) {
            System.out.print("Incorrecto, Teclee dirección (1 - ESTE / 2 - OESTE) : ");
            dir = teclado.nextInt();
        }
        //int dir = Integer.parseInt(teclado.nextLine());
        Lanzadora lanzadora = new Lanzadora(x, y, new Direccion(dir));

        System.out.println("-------------------------------------------");

        System.out.println("\nAntes de mover ..." +
                "\nDirección: " + lanzadora.getDireccion() +
                "\nPosición: " + lanzadora.getPosicion());
        System.out.println();

        lanzadora.mover();
        lanzadora.mover();
        System.out.println("\nDespués de hacer 2 movimientos..." + lanzadora.getDireccion() +
                "\nPosición: " + lanzadora.getPosicion());
        System.out.println();

        lanzadora.cambiarDireccion();
        lanzadora.mover();
        lanzadora.mover();
        System.out.println("\nDespués de cambiar de dirección y volver a mover..." + lanzadora.getDireccion() +
                "\nPosición: " + lanzadora.getPosicion());


    }
}
