package n2exercici1;

public class Telefono {
    protected String marca;
    protected String model;

    public Telefono(String marca, String model) {

        this.marca = marca;
        this.model = model;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String trucar (String numtel) {
        return "S'està trucant al número "+numtel;
    }

    @Override
    public String toString() {
        return "Es un telèfon de la marca " + marca + "i model" + model;
    }
}
