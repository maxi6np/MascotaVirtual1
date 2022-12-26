package Unidad3.Mascotas;

public class Mascota {
    String raza;
    String nombre;
    String color;
    int edad;
    boolean tieneHambre;
    char sexo;

    public void comer (){
        this.tieneHambre = false;
    }
}
