package Unidad3.TrianguloRectangulo;

public class Dibujo {
    private String nombre;
    private String autor;
    private TrianguloRectangulo trianguloRectangulo;
    private Cuadrado cuadrado;


    public Dibujo (String nombre, String autor){
        this.nombre = nombre;
        this.autor = autor;

    }

    public TrianguloRectangulo getTrianguloRectangulo() {
        return trianguloRectangulo;
    }

    public void setTrianguloRectangulo(TrianguloRectangulo trianguloRectangulo) {
        this.trianguloRectangulo = trianguloRectangulo;
    }

    public Cuadrado getCuadrado() {
        return cuadrado;
    }

    public void setCuadrado(Cuadrado cuadrado) {
        this.cuadrado = cuadrado;
    }
}
