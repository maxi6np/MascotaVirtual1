package Unidad3.CirculoYPunto;

/**
 * La clase representa a circulos con un centro
 * y un valor determinado de radio
 * 
 * @author 
 * @version 
 */
public class Circulo
{
    private final double PI = 3.14;
    private double radio;

    private Punto centro;

     /**
     * constructor para los objetos de la clase Circulo
     * 
     */
    public Circulo(double radio)
    {
       this.radio = radio;
       centro = new Punto(0,0);
    }
    public Circulo(double radio, Punto centro)
    {
        this.radio = radio;
        this.centro = centro;
    }

    /**
     * 
     * @return devuelve el radio del círculo    
     */
    public double getRadio()
    {
        return radio;
    }
    
        
      /**
     *
     * @param   nuevoRadio nuevo valor del radio
     */
    public void setRadio(int nuevoRadio)
    {
        radio = nuevoRadio;
    }
    
    /**
     * @return devuelve el área del círculo
     */
    public double calcularArea()
    {
        return 2 * PI * radio * radio;
    }
    
    /**
     * @return devuelve el perímetro del círculo
     */
    public double calcularPerimetro()
    {
        return 2 * PI * radio;
    }

    public Punto getCentro(){
        return centro;
    }

    public void setCentroX(int x){
        centro.setX(x);
    }
    public void setCentroY(int y){
        centro.setY(y);
    }

    public String toString(){
        String str = "";
        str += "Valor del radio = " + radio + "\n" + "Valor del centro = " + centro.toString();
        return str;
    }

    public void printCirculo(){
        System.out.println(this);
        /*
        Es lo mismo que System.out.println(toString());
        */
    }
 
    
}
