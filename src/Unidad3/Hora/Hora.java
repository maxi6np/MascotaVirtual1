package Unidad3.Hora;

public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    public Hora(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int aSegundos() {
        int cambioSegundos = (hora * 3600) + (minutos * 60) + segundos;
        return cambioSegundos;
    }

    public void atrasarSegundos() {
        segundos--;
        if (segundos < 0){
            segundos = 59;
            minutos--;
            if (minutos < 0){
                minutos = 59;
                hora--;
                if (hora < 0){
                    hora = 23;
                }
            }
        }
    }

    public void avanzarSegundos() {
        segundos++;
        if (segundos == 60){
            segundos = 0;
            minutos++;
            if (minutos == 60){
                minutos = 0;
                hora++;
                if (hora == 24){
                    hora = 0;
                }
            }
        }
    }
    public String enFormatoAmPm(){
        String horaAmPm;
        if(hora < 12){
            horaAmPm = "AM";
        } else if(hora == 12){
            horaAmPm = "PM";
        } else{
            horaAmPm = "PM";
            hora -= 12;
        }
        return String.format("%02d",hora) + ":" + String.format("%02d",minutos) + ":" + String.format("%02d",segundos) +  horaAmPm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%02d",hora));
        sb.append(":");
        sb.append(String.format("%02d",minutos));
        sb.append(":");
        sb.append(String.format("%02d",segundos));
        return sb.toString();
    }
}
