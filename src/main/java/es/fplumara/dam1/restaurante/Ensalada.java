package es.fplumara.dam1.restaurante;

import java.util.ArrayList;
import java.util.IllegalFormatWidthException;
import java.util.List;

public class Ensalada extends ProductoMenu implements Personalizable , Aptopara{
    protected String size;
    private List<Extra> extras = new ArrayList<>();


    private Ensalada(String id, String nombre, Double precioBase,String size) throws IllegalAccessException {
        super(id, nombre, precioBase);
        if (size == null || size.isBlank()){
            throw new IllegalArgumentException("El tamaño no puede estar vacio");
        }
        if(!size.trim().equalsIgnoreCase("Mediana") && !size.trim().equalsIgnoreCase("Grande")){
            throw new IllegalArgumentException("El tamaño tiene que ser mediano o grande");

        }
        this.size = size;
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
        Double Base = this.precioBase;

        for (int i = 0; i < extras.size(); i++) {
            totalExtras += extras.get(i).getCoste();
        }
        if (size.equalsIgnoreCase("Grande")){
            Base += 2;
        }
        return precioFinal =  Base + totalExtras;
    }

    @Override
    // Formateo :(
    public String ticketLine() {
        return "";
    }

    @Override
    public boolean esApto(String apto) {
        if(!apto.trim().equalsIgnoreCase("Vegetariano") && !apto.trim().equalsIgnoreCase("Vegano") ){
            throw new IllegalArgumentException("Debe de ser apto para veganos o para vegetarianos");
        }
        if(apto.equalsIgnoreCase("Vegetariano")){
            return true;
        }
        else if (apto.equalsIgnoreCase("Vegano" ) && extras.isEmpty()){
            return true;
        } else {
            return false;
        }

    }
}
