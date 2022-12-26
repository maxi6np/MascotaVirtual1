package Unidad3.EjemploIntercambio;

public class Principal {
    public static void main(String[] args) {
        Intercambio i1 = new Intercambio(111111,2);
        i1.promptAntes();
        i1.intercambiar();
        i1.promptDespues();
    }
}
