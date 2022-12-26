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
    private byte hambre; // 0 (saciado) a 10 (hambriento)
    private byte suicedad; // 0  (totalmente  limpio)  y  100(absolutamente inmundo
    private byte salud; // 0 (muerto) y 100 (totalmente sano)
    private byte energia; //0 (apático) a 100 (extremadamente activo)

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
    public void alimentar (float cantidadAlimento){
        if (hambre >= 0){
            hambre--;
        } else {
            hambre = 0;
        }

        if (cantidadAlimento > 5){ //suma como maximo 5 puntos
            cantidadAlimento = 5;
        }


        if (cantidadAlimento + energia >= 100){
            energia = 100;
        } else{
            energia += cantidadAlimento;
        }


        if (cantidadAlimento + salud >= 100){
            salud = 100;
        } else{
            salud += cantidadAlimento;
        }

    }
    public void curar(float cantidadMedicina){
        if (cantidadMedicina + salud >= 100){
            salud = 100;
        } else{
            salud += cantidadMedicina;
        }
    }



}