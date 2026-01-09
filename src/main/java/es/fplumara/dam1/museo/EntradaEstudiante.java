package es.fplumara.dam1.museo;

import java.time.LocalDate;

public class EntradaEstudiante extends Entrada{

    private String centroEducativo;

    public EntradaEstudiante(String ID, Double precioBase, LocalDate fecha, String centroEducativo) {
        super (ID,precioBase, fecha);
        this.centroEducativo = centroEducativo;
    }
}
