package n3exercici1;

import java.util.ArrayList;

public class Redactora {
    private String nom;
    int dni; // esta variable no podrà canviar per aquest motiu no li afegirem el set.
    static int sou = 1500;
    private ArrayList<Noticia> llistaNoticies;

    // Constructor
    public Redactora(String nom, int dni) {

        this.nom = nom;
        this.dni = dni;
        llistaNoticies = new ArrayList<Noticia>();
    }

    public String getNom() {
        return nom;
    }

    public int getDni() {
        return dni;
    }

    public static int getSou() {
        return sou;
    }

    public ArrayList<Noticia> getLlistaNoticies() {
        return llistaNoticies;
    }

    public String setNom() {
        return nom;
    }

    public static int setSou() {
        return sou;
    }

    public ArrayList<Noticia> altaNoticia(Noticia noticia, String titular) {

        this.llistaNoticies.add(noticia);
        System.out.println("La noticia amb titular " + titular + " ja ha estat entrada al sistema");

        return llistaNoticies;
    }

    public void imprimirNoticies(ArrayList<Redactora> llistaRedactores, int posicion) {

        int i = posicion;
        int j = 0;// indice
        int posicion2 = llistaRedactores.get(i).llistaNoticies.size();

        if (posicion2 >= 0) {
            for (j = 0; j < posicion2; j++) {
                System.out.println(llistaRedactores.get(i).llistaNoticies.get(j).getTitular());
            }
        }

    }

    public int buscarNoticia(String titular) {

        boolean encontrado = false;

        int posicion2 = -1;
        int indice = 0;

        while (indice < llistaNoticies.size() && !encontrado) {

            if (llistaNoticies.get(indice).getTitular().equalsIgnoreCase(titular)) {

                posicion2 = indice;
                encontrado = true;
            }
            indice++;
        }
        return posicion2;
    }

    public void listarNoticias(int posicion) {

        int i = posicion;

        for (i = 0; i < llistaNoticies.size(); i++) {
            System.out.println(llistaNoticies.get(i).getTitular());
        }

    }

    @Override
    public String toString() {
        return "El/la redactor/a " + nom + "amb dni=" + dni + ", te un total de " + llistaNoticies.size()
                + " noticies al seu encàrreg";
    }

}
