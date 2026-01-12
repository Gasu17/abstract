package es.fplumara.dam1.restaurante;

import java.util.ArrayList;
import java.util.List;

public class Hamburguesa extends ProductoMenu implements Personalizable {
    private String tipoCarne ;
    private List<Extra> extras = new ArrayList<>();



    public Hamburguesa (String id, String nombre, Double precioBase,String tipoCarne ) throws IllegalAccessException {
        super (id,nombre,precioBase);
        if(tipoCarne.isBlank()){
            throw new IllegalAccessException("tipoCarne no puede ser ni nulo ni vacio");
        }
        this.tipoCarne = tipoCarne   ;

    }

    @Override
    public void añadirExtra(String nombreExtra, double coste) {
        if (nombreExtra.isBlank() ){
            throw new IllegalArgumentException("nombreExtra no puede ser nulo ni vacio");
        }
        if (coste <0){
            throw new IllegalArgumentException("El coste no puede ser 0");
        }
        extras.add((new Extra (nombreExtra, coste) ));

    }

    @Override
    public double preciofinal() {
        Double totalExtras = 0.00;
        Double precioFinal =0.00;

        for (int i = 0; i < extras.size(); i++) {
            totalExtras += extras.get(i).getCoste();
        }
       return precioFinal =  this.precioBase + totalExtras;
    }

    @Override
    // Formate :(
    public String ticketLine() {
        return "";
    }

    }



