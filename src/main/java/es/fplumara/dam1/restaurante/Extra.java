package es.fplumara.dam1.restaurante;

public class Extra {
    private String nombreExtra;
    private double coste;

    public Extra(String nombreExtra, double coste) {
        this.nombreExtra = nombreExtra;
        this.coste = coste;
    }

    public String getNombreExtra() {
        return nombreExtra;
    }

    public double getCoste() {
        return coste;
    }
}
