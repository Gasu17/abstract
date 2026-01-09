package es.fplumara.dam1.museo;

import java.time.LocalDate;

public abstract class  Entrada {

    private String ID;
    private Double precioBase;
    private LocalDate fecha;

    //Constructor


    protected Entrada(String ID, Double precioBase, LocalDate fecha) {
        this.ID = ID;
        this.precioBase = precioBase;
        this.fecha = fecha;
    }

    // Getters and setters
    public String getID() {
        return ID;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    // Metodos
    // PASAR A LAS CLASES EXTENDIDAS
     public static Double precioFinal(){
        return null ;
    }
    public static String descripcion (){
        return null ;
    }
}