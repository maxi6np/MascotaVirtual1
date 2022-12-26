package Unidad3.RelojDigital;

public class Main {
    public static void main(String[] args) {
        RelojAlarma ra = new RelojAlarma(17,35);
        System.out.println(ra.getHora());
        ra.setAlarma(17,37);
        ra.emitirTic();
        ra.emitirTic();
        System.out.println(ra.getHora());




    }
}
