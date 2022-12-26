package Unidad3.EjemploIntercambio;

public class Intercambio {
    private int a ;
    private int b ;

    public Intercambio(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void promptAntes (){
        System.out.println("Antes de la cadena:" + " atributo a es " + a + " y atributo b es " + b);
    }

    public void intercambiar() {
        int aux = a;
        a = b;
        b = aux;
    }

    public void escribir() {
        System.out.println("Atributo a: " + a +
                "\nAtributo b: " + b);;
    }


    public void promptDespues (){
        System.out.println("Después de la cadena:" + " atributo a es " + a + " y atributo b es " + b); ;
    }
}
