package Unidad3.RelojDigital;

public class Alarma {
    private int hora;
    private int minutos;
    public Alarma(){
        hora = 07;
        minutos = 00;
    }
    public void setHoraAlarma(int hora, int minutos){
        this.hora = hora;
        this.minutos = minutos;
    }
    public String getHoraAlarma(){
        String aux = "";
        if (hora < 10) {
            aux += "0";
        }
        aux += hora;
        if (minutos < 10) {
            aux += "0";
        }
        aux += minutos;
        return hora + ":" + minutos;

    }
}
