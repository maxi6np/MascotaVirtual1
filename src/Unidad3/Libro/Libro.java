package Unidad3.Libro;

/**
 * Esta clase mantiene informacion sobre un libro.
 * Podria formar parte de una aplicacion mas grande como un sistema que gestionase una libreria, por ejemplo.
 *
 * @author (Introduce tu nombre)
 * @version (Inserta la fecha de hoy)
 */
public class Libro {
    // los atributos
    private String autor;
    private String titulo;
    private int numeroPaginas;
    private String numeroReferencia;
    private int vecesPrestado;

    /**
     * establecer el autor y el titulo cunado el objeto se construya
     */
    public Libro(String queAutor, String queTitulo, int cuantasPaginas) {
        autor = queAutor;
        titulo = queTitulo;
        numeroPaginas = cuantasPaginas;
        this.numeroReferencia = "";
        this.vecesPrestado = 0;
    }

    public String getAutor() {return autor; }

    public String getTitulo() {return titulo; }

    public int getPaginas() {
        return this.numeroPaginas;
    }

    public void printAutor() {System.out.println(getAutor()); }

    public void printTitulo() {System.out.println(getTitulo()); }

    public void printPaginas() {System.out.println(getPaginas()); }

    public void printDetalles() {
        System.out.println("Título: " + titulo +
                            "\nAutor: " + autor +
                            "\nNúmero de Páginas: " + numeroPaginas +
                            "\nNúmero de referencia: " + numeroReferencia +
                            "\nVeces prestado: " + vecesPrestado +
                            "\n");
    }

    public void setNumeroReferencia(String nuevoNumeroReferencia) {numeroReferencia = nuevoNumeroReferencia; }

    public void prestar(){vecesPrestado++; }
}
