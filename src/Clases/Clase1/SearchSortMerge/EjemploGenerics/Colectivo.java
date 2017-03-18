package Clases.Clase1.SearchSortMerge.EjemploGenerics;

/**
 * Created by DiegoMancini on 1/3/17.
 */
public class Colectivo implements Comparable<Colectivo> {

    private int linea;
    private int interno;
    private int asientos;
    boolean discpacitados;



    public Colectivo(int linea, int interno, int asientos, boolean discpacitados) {
        this.linea = linea;
        this.interno = interno;
        this.asientos = asientos;
        this.discpacitados = discpacitados;
    }

    public Colectivo(int linea, int interno) {
        this.linea = linea;
        this.interno = interno;
    }

    public int compareTo(Colectivo x){
        if (this.linea != x.linea)
            return this.linea - x.linea;
        return this.interno - x.interno;

    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public int getInterno() {
        return interno;
    }

    public void setInterno(int interno) {
        this.interno = interno;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public boolean isDiscpacitados() {
        return discpacitados;
    }

    public void setDiscpacitados(boolean discpacitados) {
        this.discpacitados = discpacitados;
    }


}
