package n1exercici1;

public abstract class Instrumentos {

    protected String nombre;
    protected int precio;


    public Instrumentos(String nombre, int precio) {

        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public abstract String tocar();

    static {
        System.out.println("Se ha inicializado la clase");
    }

}


