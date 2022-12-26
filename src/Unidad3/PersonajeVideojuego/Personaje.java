package Unidad3.PersonajeVideojuego;

public class Personaje {
    private String nombre;
    private int coordenadaX;
    private int coordenadaY;
    private char orientacion;
    private char NORTE = 'N';
    private char SUR = 'S';
    private char ESTE = 'E';
    private char OESTE = 'O';

    public Personaje(String nombre) {
        this.nombre = nombre;
        coordenadaX = 0;
        coordenadaY = 0;
        orientacion = 'N';
    }

    public void avanzar(int unidades) {
        if (orientacion == 'N' || orientacion == 'S') {
            coordenadaY += unidades;
        } else if (orientacion == 'O' || orientacion == 'E'){
            coordenadaX += unidades;
        } else {
            System.out.println("Orientacion erronea");
        }
    }

    public void girar(){
        switch (orientacion) {
            case 'N' -> orientacion = 'E';
            case 'S' -> orientacion = 'O';
            case 'E' -> orientacion = 'S';
            case 'O' -> orientacion = 'N';
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Personaje = ").append(this.nombre);
        sb.append("\nOrientacion = ").append(orientacion);
        sb.append("\nPosicion = ");
        sb.append("[ ");
        sb.append(coordenadaX);
        sb.append(", ");
        sb.append(coordenadaY);
        sb.append(" ]");

        return sb.toString();
    }



}
