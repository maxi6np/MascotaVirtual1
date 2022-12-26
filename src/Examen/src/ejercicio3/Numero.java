package ejercicio3;

import java.util.Scanner;

public class Numero {

    public boolean esChingon(int numero) {
        int division;
        int resto;
        int hexadecimal = 16;
        int aux = numero;

        do {
            division = aux / hexadecimal;
            resto = aux % hexadecimal;
            if (resto < 10) {
                return false;
            }
            aux = division;

        } while (division >= hexadecimal);
        return true;
    }

    public void pintarArbolNavidad(int numero) {
        System.out.println("==============================");
        System.out.println("F E L I Z  N A V I D A D");
        System.out.println("==============================");

        // HOJAS
        int numTriangulos = numero / 2;

        for (int l = 3; l <= numero; l += 2) { // numero triangulos

            int hoja = numero / 2 + 1; // donde empezar a pintar
            int contador = 1; // cuantos * pintar

            for (int i = 1; i <= l / 2 + 1; i++) { // numero filas triangulos
                int k = hoja;
                for (int j = 0; j <= numero; j++) { // numero columnas (siempre igual)
                    if (j == k && k < hoja + contador) {
                        System.out.print("*");
                        k++;
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                hoja -= 1; // empezar a pintar 1 antes
                contador += 2;
            }
        }

        // TRONCO
        int palo = numero / 2 + 1;
        int contadorPalos = numero / 3;
        for (int i = 0; i < numTriangulos / 2; i++) {
            for (int j = 0; j <= numero * 2 / 3 + 1; j++) {
                if (j > numero / 3) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
