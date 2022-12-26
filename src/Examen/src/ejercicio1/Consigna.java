package ejercicio1;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;

/**
 * @author Esta clase modela la consigna de una estación de RENFE en la que se pueden
 * alquilar 2 tipos de taquillas: pequeñas y grandes.
 * Las tarifas de la consigna son las siguientes:
 * - 2€ por hasta 3 horas
 * - 0,50€ más por cada hora completa adicional o parte de hora de exceso de
 * las 3
 * - por las taquillas grandes se paga además un plus de 5€sea cual sea su
 * tiempo de alquiler
 * - los viajeros que están de Interrail tienen un descuento del 10% sobre su
 * importe total.
 * <p>
 * Se trata de calcular lo que cada cliente ha de pagar según su tiempo de
 * alquiler (por simplicidad consideramos que una taquilla no está ocupada
 * más de un día)
 * <p>
 * La consigna además realiza otros cálculos adicionales para obtener diferentes
 * estadísticas
 */
public class Consigna {
    private final char PEQUENA = 'P';
    private final char GRANDE = 'G';
    private final double HASTA_3HORAS = 2.0;
    private final double PRECIO_HORA = 0.5;
    private final double PLUS_GRANDE = 5.0;
    private final double DESCUENTO_INTERRAIL = 0.10;
    private String nombreEstacion;
    private int taquillasPequenas;
    private int taquillasGrandes;
    private double importeAcumulado;
    private int consignaCliente = 1;
    private double cantidadMaxima;
    private int clienteMaximaCantidad;

    /**
     * Constructor de la clase Consigna
     * Recibe un parámetro, el nombre de la estación
     * e inicializa los atributos adecuadamente
     */
    public Consigna(String nombreEstacion) {
        this.nombreEstacion = nombreEstacion;
        this.taquillasGrandes = 0;
        this.taquillasPequenas = 0;
        this.importeAcumulado = 0;
        this.cantidadMaxima = 0;
        this.clienteMaximaCantidad = 0;

    }

    /**
     * Mutador para el nombre de la estación
     */
    public void setNombre(String nuevoNombreEstacion) {
            this.nombreEstacion = nuevoNombreEstacion;
    }

    /**
     * Accesor para el importe total recogido por la consigna en el día
     */
    public double getTotalAcumulado() {
        return importeAcumulado;
    }

    /**
     * Este método simula la facturación a un cliente por el uso de la consigna
     * en el día.
     * El método incluye 3 parámetros (suponemos todos correctos):
     * - tipo - indica el tipo de taquilla ('P' pequeña o 'G' grande)
     * - totalMinutos - cantidad de minutos que ha estado la taquilla
     * ocupada.
     * - carnetInterrail - a true si el cliente es un viajero que está de
     * Interrail, false en otro caso
     * <p>
     * Las tarifas de la consiga son las siguientes:
     * - 2€ mínimo por hasta 3 horas
     * _ 0.50€ más por cada hora completa adicional o parte de hora de exceso
     * de las 3
     * _ por las taquillas grandes se paga además un plus de 5€ sea cual sea
     * su tiempo de ocupación.
     * _ los viajeros de Interrail tienen un descuento del 10% sobre su
     * importe total
     * <p>
     * <p>
     * Hay que actualizar además los atributos registrando el nº de taquillas
     * pequeñas y grandes alquiladas y acumulando el importe total recogido por
     * la consigna entre todos los clientes.
     * <p>
     * Además se obtendrá el nº de cliente que más ha pagado
     * <p>
     * Una vez realizados los cálculos se imprimirá el ticket del cliente
     * (ver resultados de ejecución9
     * <p>
     * Analiza con una sentencia switch el tipo de taquilla
     * <p>
     * Evita repetir código
     */
    public void facturarCliente(char tipo, int totalMinutos, boolean carnetInterrail) {
        int totalHoras = caclcularHoras(totalMinutos);
        String taquillas = chToStr(tipo);
        double importe = calcularImporte(totalHoras, tipo, carnetInterrail);

        // IMPRIMIR TICKET
        StringBuilder sb = new StringBuilder();
        sb.append("Estación: ").append(nombreEstacion);
        sb.append("\nTicket consigna cliente nº: ").append(consignaCliente);
        sb.append("\nTotal minutos alquilados: ").append(totalMinutos);
        sb.append("\nTotal horas a facturar: ").append(totalHoras);
        sb.append("\nTipo taquilla: ").append(taquillas);
        sb.append("\nCarnet Interrail: ").append(carnetInterrail);
        if (tipo == 'G') {
            sb.append("\nCon suplemento: ").append(PLUS_GRANDE).append("€");
        }
        sb.append("\nImporte total a pagar: ").append(importe).append("€");

        System.out.println(sb.toString());

        // ACTUALIZAR ATRIBUTOS
        if (importe > cantidadMaxima){
            cantidadMaxima = importe;
            clienteMaximaCantidad = consignaCliente;
        }
        consignaCliente++;
        importeAcumulado += importe;
    }

    private double calcularImporte(int totalHoras, char tipo, boolean interrail) {
        double importe = HASTA_3HORAS;
        if (totalHoras > 3) {
            importe += (totalHoras - 3) * PRECIO_HORA;
        }
        if (tipo == 'G') {
            importe += PLUS_GRANDE;
        }
        if (interrail) {
            return importe - importe * DESCUENTO_INTERRAIL;
        }
        return importe;
    }

    private int caclcularHoras(int totalMinutos) {
        if (totalMinutos % 60 != 0) {
            return totalMinutos / 60 + 1;
        }
        return totalMinutos / 60;
    }

    private String chToStr(char tipo) {
        switch (tipo) {
            case 'G':
                return "GRANDE";
            default:
                return "PEQUEÑA";
        }
    }


    /**
     * Imprimir cliente que más ha pagado y la cantidad abonada
     */
    public void printMaximo() {
        System.out.println("Nº de cliente que más ha pagado: " + clienteMaximaCantidad);
        System.out.println("Cantidad abonada: " + cantidadMaxima + "€");
    }
}