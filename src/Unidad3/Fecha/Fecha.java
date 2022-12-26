package Unidad3.Fecha;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public boolean esBisiesto() {
        return anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0);
    }

    public int diasMes() {
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (esBisiesto()) {
                    return 29;
                } else {
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 0;
        }
    }

    public void printCorta() {
        String fechaCorta = String.format("%02d",dia) + " - " + String.format("%02d",mes) + " - " + String.format("%02d",anio);
        System.out.println(fechaCorta);
    }


    public void printLarga() {
        System.out.print(dia + " de ");
        switch (mes) {
            case 1 -> System.out.print("enero");
            case 2 -> System.out.print("febrero");
            case 3 -> System.out.print("marzo");
            case 4 -> System.out.print("abril");
            case 5 -> System.out.print("mayo");
            case 6 -> System.out.print("junio");
            case 7 -> System.out.print("julio");
            case 8 -> System.out.print("agosto");
            case 9 -> System.out.print("septiembre");
            case 10 -> System.out.print("octubre");
            case 11 -> System.out.print("noviembre");
            case 12 -> System.out.print("diciembre");
            default -> System.out.print("incorrecto");
        }
        System.out.print(" de " + anio);
    }

    public boolean esCorrecta() {
        boolean diaCorrecto = (dia >= 1 && dia <= 31);
        boolean mesCorrecto = (mes >= 1 && mes <= diasMes());
        return diaCorrecto && mesCorrecto;

    }

    public boolean precedeA(int queDia, int queMes, int queAnio) {
        if ((queDia > this.dia) && (queMes >= this.mes) && (queAnio >= this.anio)) {
            return true;
        } else if ((queMes > this.mes) && (queAnio >= this.anio)) {
            return true;
        } else{
            return queAnio > this.anio;
        }
    }

    public void avanzarDia(){
        dia++;
        if (dia > diasMes()){
            dia = 1;
            mes++;
            if(mes > 12){
                mes = 1;
                anio++;
            }
        }
    }
}
