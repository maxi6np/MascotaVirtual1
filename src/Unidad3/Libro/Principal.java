package Unidad3.Libro;

/**
 * 
 * 
 * @author  
 * @version 0.1
 */
public class Principal {

    /**
     * Punto de entrada de la aplicacion.
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro("Miguel de Cervantes", "Don Quijote",1345);
        Libro libro2 = new Libro("Gabriel García Marquez", "Cien años de soledad",496);

        libro1.printDetalles();
        libro2.printDetalles();
        
    }

    
}
