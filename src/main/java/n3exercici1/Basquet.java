package n3exercici1;

public class Basquet extends Noticia{
    private String competicio;
    private String club;

    public Basquet(String titular, String text, byte puntuacio, int preu, String competicio, String club) {
        super(titular, text, puntuacio, preu);
        this.competicio = competicio;
        this.club = club;
    }

    public Basquet(String titular, String competicio, String club) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
    }

    public String getCompeticio() {
        return competicio;
    }

    public void setCompeticio(String competicio) {
        this.competicio = competicio;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public int calcularPreuNoticia() {

        preu = 250;
        String competicio1 = "Eurolliga";
        String equip1 = "Barça";
        String equip2 = "Madrid";

        if (competicio1.equalsIgnoreCase(competicio)) {
            preu += 75;
        }
        if (equip1.equalsIgnoreCase(club) || equip2.equalsIgnoreCase(club)) {
            preu += 75;
        } else {
            System.out.println("No acumules diners extres");
        }

        return preu;
    }

    @Override
    public int calcularPuntuacioNoticia() {
        puntuacio = 4;
        String competicio1 = "Eurolliga";
        String competicio2 = "ACB";
        String equip1 = "Barça";
        String equip2 = "Madrid";

        if (competicio1.equalsIgnoreCase(competicio)) {
            puntuacio += 3;
        }
        if (competicio2.equalsIgnoreCase(competicio)) {
            puntuacio += 2;
        }
        if (equip1.equalsIgnoreCase(club) || equip2.equalsIgnoreCase(club)) {
            puntuacio += 1;
        } else {
            System.out.println("No acumules puntuació extra");
        }

        return puntuacio;
    }

}
