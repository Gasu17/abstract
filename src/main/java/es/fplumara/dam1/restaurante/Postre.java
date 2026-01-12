package es.fplumara.dam1.restaurante;

import java.util.ArrayList;
import java.util.List;

public class Postre extends ProductoMenu {
private boolean esCasero;
    private List<Extra> extras = new ArrayList<>();

    public Postre(String id, String nombre, Double precioBase, boolean esCasero) throws IllegalAccessException {
        super(id, nombre, precioBase);
        if (id == null || id.isBlank()){
            throw new IllegalAccessException("Este valor no puede estar vacio");
        }
        this.esCasero= esCasero;
    }

    @Override
    public double preciofinal() {
        Double totalExtras = 0.00;
        Double precioFinal =0.00;

        for (int i = 0; i < extras.size(); i++) {
            totalExtras += extras.get(i).getCoste();
        }
        if(esCasero){
            this.precioBase += 1.50;
        }

        return precioFinal =  this.precioBase + totalExtras;
    }

    @Override
    public String ticketLine() {
        return "";
    }
}