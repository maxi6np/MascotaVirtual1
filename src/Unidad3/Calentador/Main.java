package Unidad3.Calentador;

public class Main {
    public static void main(String[] args) {
        Calentador calentador1 = new Calentador(5,30);
        calentador1.calentar();
        calentador1.enfriar();
        calentador1.calentar();
        calentador1.calentar();
        calentador1.enfriar();
        calentador1.enfriar();
        calentador1.setIncremento(3);
        System.out.println(calentador1.getTemperatura());

    }
}
