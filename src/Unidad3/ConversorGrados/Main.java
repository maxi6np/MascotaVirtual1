package Unidad3.ConversorGrados;

public class Main {
    public static void main(String[] args) {
        ConversorGrados conv = new ConversorGrados(20);

        System.out.println(conv.aFarenheit());
        System.out.println(conv.aCentigrados());
    }
}
