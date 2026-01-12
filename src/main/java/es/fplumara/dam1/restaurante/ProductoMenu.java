package es.fplumara.dam1.restaurante;

public abstract class  ProductoMenu {
    String id ;
    private String nombre;
    protected Double precioBase;

    protected ProductoMenu(String id, String nombre, Double precioBase) throws IllegalAccessException {
        this.id = id;
        this.nombre = nombre;
        this.precioBase = precioBase;

        if (id == null || id.isBlank()){
        throw new IllegalArgumentException("Este valor no puede estar vacio");
        }

    }

    // metodos
    public abstract double preciofinal () ;
    public abstract String ticketLine();

    // getters/setters

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }
}
