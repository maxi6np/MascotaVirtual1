package Unidad3.Casa;


public class Casa {
    private Salon salon;
    private Bano bano;
    private Cocina cocina;
    private Habitacion habitacion1;
    private Habitacion habitacion2;

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    public Bano getBano() {
        return bano;
    }

    public void setBano(Bano bano) {
        this.bano = bano;
    }

    public Cocina getCocina() {
        return cocina;
    }

    public void setCocina(Cocina cocina) {
        this.cocina = cocina;
    }

    public Habitacion getHabitacion1() {
        return habitacion1;
    }

    public void setHabitacion1(Habitacion habitacion1) {
        this.habitacion1 = habitacion1;
    }

    public Habitacion getHabitacion2() {
        return habitacion2;
    }

    public void setHabitacion2(Habitacion habitacion2) {
        this.habitacion2 = habitacion2;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Unidad3.Casa{");
        sb.append("salon=").append(salon);
        sb.append(", bano=").append(bano);
        sb.append(", cocina=").append(cocina);
        sb.append(", habitacion1=").append(habitacion1);
        sb.append(", habitacion2=").append(habitacion2);
        sb.append('}');
        return sb.toString();
    }
}
