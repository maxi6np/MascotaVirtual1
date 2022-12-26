package Unidad3.Contador;

public class Contador {
    private int valor;

    public void Contador(){
        this.valor = 0;
    }

    public void decrementar(){
        this.valor--;
    }

    public int getContador(){
        return valor;
    }

    public void incrementar(){
        this.valor++;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Unidad3.Contador{");
        sb.append("valor=").append(valor);
        sb.append('}');
        return sb.toString();
    }

    public void reset(){
        this.valor = 0;
    }
}
