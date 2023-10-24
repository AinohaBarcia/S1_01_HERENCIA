package n3exercici1;

public class Futbol extends Noticia {
    private String competicio;
    private String club;
    private String jugador;

    public Futbol(String titular, String text, byte puntuacio, int preu, String competicio, String club,
                  String jugador) {
        super(titular, text, puntuacio, preu);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
    }

    public Futbol(String titular, String competicio, String club, String jugador) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;

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

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    @Override
    public int calcularPreuNoticia() {

        int preu = 300;
        String competicio1 = "Champions";
        String equip1 = "Barça";
        String equip2 = "Madrid";
        String jugador1 = "Torres";
        String jugador2 = "Benzema";

        if (competicio1.equalsIgnoreCase(competicio)) {
            preu += 100;

        }
        if (equip1.equalsIgnoreCase(club) || equip2.equalsIgnoreCase(club)) {
            preu += 100;

        }
        if (jugador1.equalsIgnoreCase(jugador) || jugador2.equalsIgnoreCase(jugador)) {
            preu += 50;
        } else {
            System.out.println("No acumules diners extres");
        }

        return preu;
    }

    @Override
    public int calcularPuntuacioNoticia() {

        int puntuacio = 5;
        String competicio1 = "Champions";
        String competicio2 = "Lliga";
        String equip1 = "Barça";
        String equip2 = "Madrid";
        String jugador1 = "Torres";
        String jugador2 = "Benzema";

        if (competicio.equalsIgnoreCase(competicio1)) {
            puntuacio += 3;
        }
        if (competicio.equalsIgnoreCase(competicio2)) {
            puntuacio += 2;

        }
        if (club.equalsIgnoreCase(equip1) || equip2.equalsIgnoreCase(equip2)) {
            puntuacio += 1;

        }
        if (jugador.equalsIgnoreCase(jugador1) || jugador2.equalsIgnoreCase(jugador2)) {
            puntuacio += 1;

        } else {
            System.out.println("No acumules puntuació extra");
        }

        return puntuacio;
    }

}
