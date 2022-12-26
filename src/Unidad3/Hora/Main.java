package Unidad3.Hora;

public class Main {
    public static void main(String[] args) {
        Hora hora1 = new Hora(14, 3, 50);
        hora1.aSegundos();
        hora1.atrasarSegundos();
        System.out.println(hora1);
        hora1.avanzarSegundos();
        System.out.println(hora1);
        System.out.println(hora1.enFormatoAmPm());
    }
}
