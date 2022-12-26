package ejercicio2;


import java.util.Random;

/**
 * @author -
 * <p>
 * Un objeto de esta clase representa a una máquina lanzadora situado en una
 * determinada posición en un espacio bidimensional
 * <p>
 * La lanzadora se mueve solo en horizontal
 * <p>
 * Cada vez que se mueve avanza una distancia aleatoria según la
 * dirección que tenga
 */

public class Lanzadora {
    private Punto posicion;  // posición de la lazadora   
    private Direccion direccion;  // dirección actual de movimiento de la lanzadora
    private int movimientos; // nº movimientos de la lanzadora

    /**
     * Constructor - crea lanzadora
     * La posición inicial es (0, 0) y la
     * dirección inicial siempre es ESTE
     * <p>
     * El resto de atributos se inicializan adecuadamente
     */
    public Lanzadora() {
        posicion = new Punto(0, 0);
        direccion = new Direccion();
        movimientos = 0;

    }

    /**
     * Constructor - crea la lanzadora
     * La posición inicial es (x, y) y la
     * dirección inicial la que indica el parámetro
     * <p>
     * Crea además el generador
     */
    public Lanzadora(int x, int y, Direccion direccion) {
        this.posicion = new Punto(x, y);
        this.direccion = direccion;
        movimientos = 0;

    }

    /**
     * Accesor para la posición de la lanzadora
     */
    public Punto getPosicion() {
        return posicion;
    }

    /**
     * Mutador para la posición de la lanzadora
     */
    public void setPosicion(Punto posicion) {
        this.posicion = posicion;
    }

    /**
     * Accesor para la dirección
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Mutador para la dirección
     * Cambia la dirección de movimiento de la lanzadora
     */
    public void cambiarDireccion() {
        direccion.cambiarDireccion();
    }

    /**
     * La lanzadora se mueve avanzando una distancia aleatoria,
     * un valor entre 10 y 40 (inclusive) según su dirección
     * Habrá   que   actualizar   el   estado   la lanzadora
     * adecuadamente (su posición y movimientos)
     * Muestra en pantalla un mensaje indicando el nº de movimientos,
     * y la dirección y distancia que se va a avanzar - (el valor aleatorio generado)
     */
    public void mover() {
        // GENERAR Y ACTUALIZAR POSICION
        int valor = (int) (Math.random() * 40) + 10;
        int dir = getDireccion().getDireccion();
        if (dir == 1) {
            posicion.setX(posicion.getX() + valor);
        } else {
            posicion.setX(posicion.getX() - valor);
        }
        // ACTUALIZAR MOVIMIENTOS
        movimientos++;

        // IMRPIMIR VALORES ACTUALIZADOS
        StringBuilder sb = new StringBuilder();
        sb.append("Movimientos: ").append(movimientos);
        sb.append("\nAvanzando hacia la ");
        if (dir == 1) {
            sb.append("derecha (este) ");
        } else {
            sb.append("izquierda (oeste) ");
        }
        sb.append(valor);
        System.out.println(sb.toString());

    }

    /**
     * Representación textual de la lanzadora
     * Se indica la dirección en la que se mueve y posición actual
     * (ver resultados ejecución)
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dirección: ").append(getDireccion());
        sb.append("\nPosición: ").append(getPosicion());

        return sb.toString();

    }
}
