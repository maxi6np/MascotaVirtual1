package Unidad3.Numeros;

public class Main {
    public static void main(String[] args) {
        Numeros prueba = new Numeros(54,7,337);
        System.out.println(prueba.getMaximo());
        System.out.println(prueba.getMinimo());
        System.out.println(prueba.cuantosPares());
        prueba.ordenar();
        System.out.println(prueba);
        System.out.println(prueba.cuantosAcabanEn7());
    }
}
