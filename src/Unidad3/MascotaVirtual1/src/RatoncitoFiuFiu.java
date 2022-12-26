package Unidad3.MascotaVirtual1.src;

/**
 * <p>Título: </p>
 * <p>Descripción: </p>
 *
 * @author sin atribuir
 * @version 1.0
 */


public class RatoncitoFiuFiu {
    //
    // La clase RatoncitoFiuFiu aun no tiene ningun atributo
    //
    private String nombre;
    private double edad;
    private int pesoEnGramos;
    private byte hambre;
    private byte suicedad;
    private byte salud;
    private byte energia;

    public RatoncitoFiuFiu(String nombre, int pesoEnGramos,byte hambre, byte suciedad, byte salud, byte energia) {
        // Un objeto RatoncitoFiuFiu debería informar cuando nace...
        this.nombre = nombre;
        this.edad = 0.0;
        this.pesoEnGramos = pesoEnGramos;
        this.hambre = hambre;
        this.suicedad = suciedad;
        this.salud = salud;
        this.energia = energia;

    }


}