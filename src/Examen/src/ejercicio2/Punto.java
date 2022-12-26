package ejercicio2;

/**
 * Representa a un punto
 * en el espacio bidimensional
 */
public class Punto {
    private int x;
    private int y;

    /**
     * Constructor de la clase Punto
     */
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Accesor para el atributo x
     *
     * @return El valor de la coordenada x
     */
    public int getX() {
        return x;
    }

    /**
     * Accesor para el atributo y
     *
     * @return El valor de la coordenada y
     */
    public int getY() {
        return y;
    }

    /**
     * Mutador para la coordenada x
     *
     * @param x es el nuevo valor de x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Mutador para la coordenada y
     *
     * @param y es el nuevo de y
     */
    public void setY(int y) {
        this.y = y;
    }


    /**
     * @return Devuelve una cadena con la representación del
     * punto
     */
    public String toString() {
        return "[x = " + x + " , " + " y = " + y + "]\n";

    }

}