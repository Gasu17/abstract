package es.fplumara.dam1.museo;

import java.time.LocalDate;

public class EntradaVIP extends Entrada {


    private String zonaVIP;
    private int nivelPrioridad;

    public EntradaVIP (String ID, Double precioBase, LocalDate fecha, String zonaVIP, int nivelPrioridad) {
        super(ID,precioBase,fecha);
        this.zonaVIP = zonaVIP;
        this.nivelPrioridad = nivelPrioridad;
    }
}
