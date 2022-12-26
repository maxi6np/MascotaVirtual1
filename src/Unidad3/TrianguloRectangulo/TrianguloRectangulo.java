package Unidad3.TrianguloRectangulo;

public class TrianguloRectangulo {
    private int cateto1;
    private int cateto2;

    public TrianguloRectangulo(int cateto1,int cateto2){
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;

    }

    public void setCateto1(int cateto1) {
        this.cateto1 = cateto1;
    }

    public void setCateto2(int cateto2) {
        this.cateto2 = cateto2;
    }

    public int getCateto1(int cateto1) {
        return cateto1;
    }

    public int getCateto2(int cateto2) {
        return cateto2;
    }

    public double obtenerHipotenusa(){
        return Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
    }
}
