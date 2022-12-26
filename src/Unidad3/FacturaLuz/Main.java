package Unidad3.FacturaLuz;

public class Main {
    public static void main(String[] args) {
        FacturaLuz fl = new FacturaLuz(70,130);
        System.out.println(fl.obtenerConsumo());
        System.out.println(fl.obtenerImporteTotal());
    }
}
