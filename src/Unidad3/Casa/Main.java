package Unidad3.Casa;

public class Main {
    public static void main(String[] args) {
        Casa castilloDisney = new Casa();


        Frigorifico frigoAmericano = new Frigorifico(5,8,true);
        castilloDisney.setCocina(new Cocina(true,frigoAmericano,100));


        Habitacion habitacionConBano = new Habitacion(1,200,5);
        habitacionConBano.setBano(new Bano(true,80));
        castilloDisney.setHabitacion1(habitacionConBano);

        castilloDisney.setHabitacion2(new Habitacion(3,500,8));

        Bano bano = new Bano(true, 50);
        castilloDisney.setBano(bano);

        castilloDisney.setSalon(new Salon(true,500));

        System.out.println(castilloDisney);
    }
}
