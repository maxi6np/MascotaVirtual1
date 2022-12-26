package Unidad3.Mascotas;

public class Perro extends Mascota{
    private boolean esPeligroso;


    public Perro(int edad, String raza, String color, String nombre, boolean esPeligroso) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
        this.esPeligroso = esPeligroso;
        this.tieneHambre = true;
    }

    /*
    - Constructor a partir de la raza, nombre y color
    - Edad siempre a 0
    - No es peligroso
     */

    public Perro(String nombre, String raza, String color) {
        this.raza = raza;
        this.nombre = nombre;
        this.edad = 0;
        this.esPeligroso = false;
        this.color = color;
        this.tieneHambre = true;
    }

    /*
    - Constructor sin parámetros
    - Raza a elegir
    - Edad aleatoria entre 1 y 18
    - Nombre, color y raza a elegir por mi
    - Es peligroso
     */

    public Perro() {
        this.raza = "Golden Retriever";
        this.nombre = "Belle";
        this.color = "Beige";
        this.edad = (int) (Math.random() * 19);
        this.esPeligroso = true;
        this.tieneHambre = true;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre +
                ", Raza: " + raza +
                ", Color: " + color +
                ", Peligroso: " + esPeligroso +
                ", Edad: " + edad +
                ", Tiene Hambre: " + tieneHambre);
    }
}
