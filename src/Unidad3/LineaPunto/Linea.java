package Unidad3.LineaPunto;

public class Linea {
    private Punto punto1;
    private Punto punto2;

    public Linea(){
        punto1 = new Punto(0,0);
        punto2 = new Punto(0,0);
    }

    public Linea (Punto punto1, Punto punto2){
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public Punto getPunto1() {return punto1;}

    public void setPunto1(Punto punto1) {this.punto1 = punto1;}

    public Punto getPunto2() {return punto2;}

    public void setPunto2(Punto punto2) {this.punto2 = punto2;}

    public void moverDerecha(int distancia){
        punto1.setX(punto1.getX() + distancia);
        punto2.setX(punto2.getX() + distancia);
    }

    public void moverIzquierda(int distancia){
        punto1.setX(punto1.getX() - distancia);
        punto2.setX(punto2.getX() - distancia);
    }

    public void moverArriba(int distancia){
        punto1.setY(punto1.getY() + distancia);
        punto2.setY(punto2.getY() + distancia);
    }

    public void moverAbajo(int distancia){
        punto1.setY(punto1.getY() - distancia);
        punto2.setY(punto2.getY() - distancia);
    }

    public String toString(){
        return  "Punto 1 - " + punto1.toString() +
                "\n" +
                "Punto 2 - " + punto2.toString();
    }
    public void printLinea(){
        System.out.println(this.toString());
    }

}
