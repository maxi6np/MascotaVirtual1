package Unidad3.ConversorGrados;

public class ConversorGrados {
    private double grados;

    public ConversorGrados(double grados) {
        this.grados = grados;
    }

    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    public double aCentigrados() {
        return (5 * grados - 160) / 9;
    }

    public double aFarenheit() {
        return (9 * grados / 5) + 32;
    }

}
