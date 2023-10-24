package n3exercici1;

public class Tenis extends Noticia{
    private String competicio;
    private String tenista1;
    private String tenista2;

    // Constructor
    public Tenis(String titular, String text, byte puntuacio, int preu, String competicio, String tenista1,
                 String tenista2) {
        super(titular, text, puntuacio, preu);
        this.competicio = competicio;
        this.tenista1 = tenista1;
        this.tenista2 = tenista2;
    }

    public Tenis(String titular, String competicio, String tenista1, String tenista2) {
        super(titular);
        this.competicio = competicio;
        this.tenista1 = tenista1;
        this.tenista2 = tenista2;
    }

    // Getters & Setters
    public String getCompeticio() {
        return competicio;
    }

    public void setCompeticio(String competicio) {
        this.competicio = competicio;
    }

    public String getTenista1() {
        return tenista1;
    }

    public void setTenista1(String tenista1) {
        this.tenista1 = tenista1;
    }

    public String getTenista2() {
        return tenista2;
    }

    public void setTenista2(String tenista2) {
        this.tenista2 = tenista2;
    }

    // Métodes de classe
    @Override
    public int calcularPreuNoticia() {
        preu = 150;
        String master1 = "Federer";
        String master2 = "Nadal";
        String master3 = "Djokovic";

        if (tenista1.equalsIgnoreCase(master1) || tenista1.equalsIgnoreCase(master2)
                || tenista1.equalsIgnoreCase(master3)) {
            preu += 100;
        }
        if (tenista2.equalsIgnoreCase(master3) || tenista2.equalsIgnoreCase(master2)
                || tenista2.equalsIgnoreCase(master3)) {
            preu += 100;
        } else {
            System.out.println("No acumules diners extres");
        }

        return preu;
    }

    @Override
    public int calcularPuntuacioNoticia() {
        puntuacio = 4;

        String master1 = "Federer";
        String master2 = "Nadal";
        String master3 = "Djokovic";

        if (tenista1.equalsIgnoreCase(master1) || tenista1.equalsIgnoreCase(master2)
                || tenista1.equalsIgnoreCase(master3)) {
            puntuacio += 3;
        } else {
            System.out.println("No acumules puntuació extres");
        }

        return puntuacio;
    }

}


