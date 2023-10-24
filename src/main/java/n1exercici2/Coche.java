package n1exercici2;

public class Coche {

    private static final String MARCA = "Honda";
    private static String model ="Civic";
    private final int POTENCIA ;
    public Coche(int pOTENCIA) {

        this.POTENCIA=pOTENCIA;
    }

    public static String getModel() {
        return model;
    }
    public static void setModel(String model) {
        Coche.model = model;
    }
    public static String getMarca() {
        return MARCA;
    }
    public int getPOTENCIA() {
        return POTENCIA;
    }
    public static String frenar() {
        return "El vehicle està frenant";
    }


    public String accelerar() {
        return "EL vehicle està accelerant";
    }


    static {
        System.out.println("La clase ha sido inicializada");

    }

}
