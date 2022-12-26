package Unidad3.Ejer14;

public class Main {
    public static void main (String[] args){
        MaquinaExpendedora miMaquina = new MaquinaExpendedora(50);

        System.out.println(miMaquina.getPrecio());

        miMaquina.insertarDinero(20);

        System.out.println(miMaquina.getPrecio());

        miMaquina.insertarDinero(60);
        miMaquina.insertarDinero(100);
        miMaquina.insertarDinero(120);

        miMaquina.imprimirTicket();
    }
}
