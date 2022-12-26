package Unidad3.Contador;

public class Main {
    public static void main(String[] args) {
        Contador contador = new Contador();
        contador.incrementar();
        contador.incrementar();
        contador.incrementar();
        System.out.println(contador);;
        contador.decrementar();
        System.out.println(contador);;
        contador.incrementar();
        System.out.println(contador);;
        contador.reset();
        System.out.println(contador);;

    }
}
