package Unidad3.Cafetera;

public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
    }

    public int servirTaza(int cantidadTaza) {
        if (cantidadActual >= cantidadTaza) {
            return this.cantidadActual -= cantidadTaza;
        } else {
            return cantidadActual = 0;
        }
    }

    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }

    public int agregarCafe(int cantidadAgregar) {
        if (cantidadAgregar + cantidadActual <= capacidadMaxima) {
            return this.cantidadActual += cantidadAgregar;
        } else {
            return cantidadActual = capacidadMaxima;
        }
    }
}

