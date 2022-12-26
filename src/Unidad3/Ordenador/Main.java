package Unidad3.Ordenador;

public class Main {
    public static void main(String[] args) {
        Ordenador pc = new Ordenador(1024);
        pc.instalar256Mb();
        pc.vaciarMemoria();
        pc.instalarMemoria(240);

        System.out.println(pc);
    }
}
