package Unidad3.Fecha;

public class Main {
    public static void main(String[] args) {
        Fecha fecha1 = new Fecha(31,12,2022);
        fecha1.printCorta();
        fecha1.printLarga();
        System.out.println(fecha1.diasMes());
        System.out.println(fecha1.esBisiesto());
        System.out.println(fecha1.esCorrecta());
        System.out.println(fecha1.precedeA(14,12,2022));
        fecha1.avanzarDia();
        fecha1.printCorta();
    }
}
