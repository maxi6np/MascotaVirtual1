package Unidad3.FacturaLuz;
/**
 * Escriba la descripcion de la clase Unidad3.FacturaLuz aqui.
 * La clase guarada inforamcion acerca del consumo de luz efectuado
 * @author (su nombre) 
 * @version (n version o fecha)
 */
public class FacturaLuz {
    // consumo en el inicio del periodo a facturar
    private int lecturaAnterior;
    // consumo al final del periodo a facturar
    private int lecturaActual;
    private double VALOR_KW = 8.6;
    private double IVA = 0.16;

    /**
     * Constructor de la clase Unidad3.FacturaLuz
     */
    public FacturaLuz(int lecturaAnterior, int lecturaActual) {
        this.lecturaAnterior = lecturaAnterior;
        this.lecturaActual = lecturaActual;
    }

    public double obtenerConsumo(){
        return lecturaActual-lecturaAnterior;
    }

    public double obtenerImporteTotal(){
        double precioKW = obtenerConsumo() * VALOR_KW;
        return  precioKW + (precioKW * IVA);
    }
  
    
    
}
