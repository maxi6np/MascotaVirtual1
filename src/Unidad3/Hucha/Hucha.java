package Unidad3.Hucha;

public class Hucha {
    private int cantidad;

    public Hucha(){
        cantidad = 0;
    }

    public int getDinero() {return cantidad;}

    public int meterDinero(int dinero){
        cantidad += dinero;
        return cantidad;
    }

    public int sacarDinero(int dinero){
        cantidad -= dinero;
        return cantidad;
    }

    public void printDetalles(){
        System.out.println("La cantidad de dinero acutal en la hucha es de: " + cantidad);
    }
}
