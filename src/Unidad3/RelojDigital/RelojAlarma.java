package Unidad3.RelojDigital;

public class RelojAlarma {

    private VisorReloj reloj;
    private Alarma alarma;

    public RelojAlarma(){
        reloj = new VisorReloj();
        alarma = new Alarma();
    }

    public RelojAlarma(int hora, int minutos){
        reloj = new VisorReloj(hora,minutos);
        alarma = new Alarma();
    }

    public void setAlarma(int hora,int minutos) {
        alarma.setHoraAlarma(hora,minutos);
    }

    public String getAlarma() {
        return alarma.getHoraAlarma();

    }
    public String getHora(){
        return reloj.getHora();
    }

    public void emitirTic(){
        reloj.emitirTic();
        if (esHoraAlarma()){
            System.out.println("RRRRRIIIIINNNNNNGGGGGGGGG");
        }
    }

    private boolean esHoraAlarma(){
        return reloj.getHora().equals(alarma.getHoraAlarma());
    }

}
