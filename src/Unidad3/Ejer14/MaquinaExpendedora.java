package Unidad3.Ejer14;

public class MaquinaExpendedora {
    // El precio de un ticket en esta máquina
    private int precio;
    // Cantidad de dinero introducida por el usuario hasta ahora
    private int importe;
    // Cantidad total de dinero recogida por la máquina
    private int total;

    public MaquinaExpendedora(int precioTicket) {
        precio = 0;
        importe = 0;
        total = 0;
    }

    public int getPrecio() {

        return precio;
    }


    public int getImporte() {

        return importe;
    }

    public void insertarDinero(int cantidad) {
        if (cantidad > 0) {
            importe = importe + cantidad;
        } else {
            System.out.println("Use a positive amount rather than: " + cantidad);
        }
    }


    public void imprimirTicket() {
        if (importe >= precio) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + precio + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + precio;
            // Reduce the balance by the price.
            importe = importe - precio;
        } else {
            System.out.println("Debes insertar al menos: " + (precio - importe) + " centimos m�s.");

        }
    }

    public int devolverImporte() {
        int importeADevolver;
        importeADevolver = importe;
        importe = 0;
        return importeADevolver;
    }
}
