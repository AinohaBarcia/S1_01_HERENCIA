package n3exercici1;

public class F1 extends Noticia{
    private String escuderia;

    public F1(String titular, String text, byte puntuacio, int preu, String escuderia) {
        super(titular, text, puntuacio, preu);
        this.escuderia = escuderia;
    }

    public F1(String titular, String escuderia) {
        super(titular);
        this.escuderia = escuderia;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    @Override
    public int calcularPreuNoticia() {

        int preu = 100;
        String equip1 = "Ferrari";
        String equip2 = "Mercedes";

        if (escuderia.equalsIgnoreCase(equip1) || escuderia.equalsIgnoreCase(equip2)) {
            preu += 50;
        } else {
            System.out.println("No acumules diners extres");
        }

        return preu;
    }

    @Override
    public int calcularPuntuacioNoticia() {

        puntuacio = 4;
        String equip1 = "Ferrari";
        String equip2 = "Mercedes";

        if (escuderia.equalsIgnoreCase(equip1) || escuderia.equalsIgnoreCase(equip2)) {
            preu += 2;
        } else {
            System.out.println("No acumules diners extres");
        }

        return puntuacio;
    }
}
