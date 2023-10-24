package n3exercici1;

public class Noticia {
    protected String titular;
    protected String text;
    protected byte puntuacio;
    protected int preu;

    public Noticia(String titular, String text, byte puntuacio, int preu) {

        this.titular = titular;
        this.text = text;
        this.puntuacio = puntuacio;
        this.preu = preu;
    }

    public Noticia(String titular) {
        this.titular = titular;
    }
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public byte getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(byte puntuacio) {
        this.puntuacio = puntuacio;
    }

    public int getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    public int calcularPreuNoticia() {

        return preu;
    }

    public int calcularPuntuacioNoticia() {

        return puntuacio;
    }

    @Override
    public String toString() {
        return "La noticia  amb titular " + titular + " encara no te text però té puntuacio de " + puntuacio
                + " amb un de preu de " + preu;
    }
}
