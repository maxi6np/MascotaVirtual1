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
    private byte suciedad; // 0  (totalmente  limpio)  y  100(absolutamente inmundo
    private byte salud; // 0 (muerto) y 100 (totalmente sano)
    private byte energia; //0 (apático) a 100 (extremadamente activo)

    public RatoncitoFiuFiu(String nombre, int pesoEnGramos, byte hambre, byte suciedad, byte salud, byte energia) {
        // Un objeto RatoncitoFiuFiu debería informar cuando nace...
        this.nombre = nombre;
        this.edad = 0;
        this.pesoEnGramos = pesoEnGramos;
        this.hambre = hambre;
        this.suciedad = suciedad;
        this.salud = salud;
        this.energia = energia;

    }

    public void alimentar(float cantidadAlimento) {
        ganarPeso(cantidadAlimento);


        if (hambre >= 0 && hambre <= 10) {
            hambre--;
        } else {
            hambre = 0;
        }

        if (cantidadAlimento > 5) { //suma como maximo 5 puntos
            cantidadAlimento = 5;
        }


        if (cantidadAlimento + energia >= 100) {
            energia = 100;
        } else {
            aumentarEnergia(cantidadAlimento);
        }


        if (cantidadAlimento + salud >= 100) {
            salud = 100;
        } else {
            aumentarSalud(cantidadAlimento);
        }

    }

    public void curar(float cantidadMedicina) {
        if (cantidadMedicina + salud >= 100) {
            salud = 100;
        } else {
            aumentarSalud(cantidadMedicina);
        }
    }

    public void limpiar(float esfuerzoHigienico) {
        if (esfuerzoHigienico > 10) { //suma como maximo 10 puntos
            esfuerzoHigienico = 10;
        }
        if (suciedad - esfuerzoHigienico <= 0) {
            suciedad = 0;
        } else {
            suciedad -= esfuerzoHigienico;
        }
    }

    public String estadisticas() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre);
        sb.append("\nEdad: ").append(edad);
        sb.append("\nPeso: ").append(pesoEnGramos);
        sb.append("\nHambre: ").append(hambre);
        sb.append("\nSuciedad: ").append(suciedad);
        sb.append("\nSalud: ").append(salud);
        sb.append("\nEnergía: ").append(energia);

        return sb.toString();
    }

    public void envejecer(int segundos) {
        edad += segundos;

        if (hambre < 10) {
            hambre += 0.2; // aumenta el hambre 0.2 por segundo para que no suba tan rapido
        }

        if (suciedad < 100) {
            suciedad++;
        }

        if (salud >= 0 && salud <= 100) {
            salud--;
        }
    }

    public boolean estasSucio() { //depende del nivel de suciedad
        return suciedad > 50;
    }

    public boolean estasEnfermo() {//depende del nivel de salud
        return salud < 50;
    }

    public boolean estasMuerto() {//depende del nivel de salud
        return salud == 0;
    }

    public boolean tienesHambre() {//depende del nivel de hambre
        return hambre >= 5;
    }

    public boolean estasFeliz() {//depende del nivel de suciedad, de hambre y de salud
        return !tienesHambre() && !estasEnfermo() && !estasSucio();
    }

    private void ganarPeso(float cantidad) {
        if (!estasEnfermo()) {
            pesoEnGramos += cantidad;
        }
    }

    private void aumentarEnergia(float cantidad) {
        energia += cantidad;
    }

    private void aumentarSalud(float cantidad) {
        if (tienesHambre()) {
            salud += cantidad;
        }
        if (!tienesHambre()) {
            salud -= cantidad;
        }
    }

    public boolean estasDormido() {
        if (energia < 50 && energia >= 0){
            return true;
        } else if(energia >= 50 && energia <= 100){
            return false;
        }
        return false;
    }

    public boolean tienesQuejas() {
        return !estasFeliz();
    }

    public int queTramoEdad() {
        if (edad > 0 && edad <= 2.5){
            return 0;
        } else if (edad > 2.5 && edad <= 8.0){
            return 1;
        } else if (edad > 8) {
            return 2;
        } else{
         return -1;
        }
    }
}