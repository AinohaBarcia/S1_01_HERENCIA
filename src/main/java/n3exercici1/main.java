package n3exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        ArrayList<Redactora> llistaRedactores = new ArrayList<Redactora>();
        Redactora redactora = new Redactora("M", 12);
        llistaRedactores.add(redactora);

        menu(llistaRedactores);

    }

    public static void menu(ArrayList<Redactora> llistaRedactores) {
        Scanner input = new Scanner(System.in);

        int eleccio = 0;
        boolean seguir = true;

        do {

            System.out.println("Quina opció vols executar:\n0.-Sortir aplicacio\n1.-Donar d'alta redactor/a\n"
                    + "2.-Eliminar redactor/a\n3.-Introduir notícia redactor/a\n4.-Eliminar noticia\n5.-Mostrar "
                    + "totes les notícies del redactor/a\n6.-Calcular puntuació noticia\n7.-Calcular preu noticia");

            eleccio = input.nextInt();

            switch (eleccio) {
                case 0:
                    System.out.println("Has escollit sortir del menú");
                    seguir = false;
                    break;
                case 1:
                    crearRedactora(llistaRedactores, pideString("Digues el nom del/a redactora que vols" + " donar d'alta"),
                            pideInt("Quin DNI té el/la redactora?"));
                    break;
                case 2:
                    eliminarRedactora(llistaRedactores, pideString("Digues el nom del/la redactora que vols eliminar"),
                            pideInt("Digues el DNI del/la redactora que vols eliminar"));
                    break;
                case 3:
                    introduirNoticia(llistaRedactores, pideString("Digues el nom de/la redactor/a"),
                            pideInt("Digues el DNI del/a redactor/a qui li " + "asignarem la noticia"),
                            pideInt("Quin tipus de noticia vols introduir:\n1.-Futbol\n"
                                    + "2.-Basquet\n3.-Tenis\n4.-F1\n5.-Motociclsme"),
                            pideString("Digues el titular de la noticia que " + "vols introduir"));
                    break;
                case 4:
                    eliminarNoticia(llistaRedactores, pideString("Quin es el nom de/la redactora"),
                            pideInt("Quin es el dni del/a redacotoa a qui pertany la noticia?"),
                            pideString("Quin es el titular de la noticia que vols eliminar?"));
                    break;
                case 5:
                    mostrarTotesNoticies(llistaRedactores, pideString("Quin es el nom de/la redactora"),
                            pideInt("Quin es el dni del/a redacotora de qui vols mostrar totes les noticies?"));
                    break;
                case 6:
                    calcularPuntuacioNoticia(llistaRedactores,
                            pideInt("Digues el dni de/la redactora que te asignada la noticia"),
                            pideString("Quin es el titular de la noticia que vols calcular la puntuació"));
                    break;
                case 7:
                    calcularPreuNoticia(llistaRedactores,
                            pideInt("Digues el dni de/la redactora que te asignada la noticia"),
                            pideString("Quin es el titular de la noticia que vols calcular el preu"));
                    break;
                default:
                    System.out.println("L'opció escollida no es correcta");
                    break;
            }
        } while (eleccio <= 7 && eleccio > 0);

        input.close();
    }

    public static ArrayList<Redactora> crearRedactora(ArrayList<Redactora> llistaRedactores, String nom, int dni) {

        int posicion = buscarRedactora(llistaRedactores, dni);

        if (posicion == -1) {

            Redactora redactora = new Redactora(nom, dni);
            llistaRedactores.add(redactora);
            System.out.println("El/la redactor/a " + nom + " amb dni " + dni + " ja ha estat donada d'alta");
        } else {
            System.out.println("Aquest/a redactora ja existeix");
        }

        return llistaRedactores;
    }

    public static ArrayList<Redactora> eliminarRedactora(ArrayList<Redactora> llistaRedactores, String nom, int dni) {

        int posicion = buscarRedactora(llistaRedactores, dni);

        if (posicion >= 0) {
            llistaRedactores.remove(posicion);
            System.out.println("El/la redactor/a " + nom + " i DNI " + dni + " ja ha estat eliminat/da");
        } else {
            System.out.println("Aquest/a redactor/a NO existeix");
        }
        return llistaRedactores;
    }

    public static ArrayList<Redactora> introduirNoticia(ArrayList<Redactora> llistaRedactores, String nom, int dni,
                                                        int tipusNoticia, String titular) {

        int posicion = buscarRedactora(llistaRedactores, dni);
        int posicion2 = -1;
        String competicio, club, jugador, tenista1, tenista2, escuderia, equip;

        boolean seguir = true;

        if (posicion >= 0) {
            llistaRedactores.get(posicion).buscarNoticia(titular);
            if (posicion2 == -1) {
                do {
                    switch (tipusNoticia) {
                        case 1:
                            competicio = pideString("De quina competicio va la noticia?");
                            club = pideString("De quin club es tracta?");
                            jugador = pideString("De quin jugador estem parlant?");
                            Futbol futbol = new Futbol(titular, competicio, club, jugador);
                            llistaRedactores.get(posicion).altaNoticia(futbol, titular);
                            break;
                        case 2:
                            competicio = pideString("De quina competicio va la noticia?");
                            club = pideString("De quin club es tracta?");
                            Basquet basquet = new Basquet(titular, competicio, club);
                            llistaRedactores.get(posicion).altaNoticia(basquet, titular);
                            break;
                        case 3:
                            competicio = pideString("De quina competicio va la noticia?");
                            tenista1 = pideString("Quin es el primer jugador");
                            tenista2 = pideString("Quin es el segon jugador");
                            Tenis tenis = new Tenis(titular, competicio, tenista1, tenista2);
                            llistaRedactores.get(posicion).altaNoticia(tenis, titular);
                            break;
                        case 4:
                            escuderia = pideString("De quina escuderia tracta la noticia");
                            F1 f1 = new F1(titular, escuderia);
                            llistaRedactores.get(posicion).altaNoticia(f1, titular);
                            break;
                        case 5:
                            equip = pideString("De quin equip estem parlant");
                            Motociclisme motociclisme = new Motociclisme(titular, equip);
                            llistaRedactores.get(posicion).altaNoticia(motociclisme, titular);
                            break;
                        default:
                            System.out.println("No has escollit una opció correcte");
                            seguir = true;
                            break;
                    }
                } while (!seguir);
            } else {
                System.out.println("Aquesta noticia ja existeix");
            }

        } else {
            System.out.println("Aquest/a redactora no existeix");
        }

        return llistaRedactores;
    }

    public static ArrayList<Redactora> eliminarNoticia(ArrayList<Redactora> llistaRedactores, String nom, int dni,
                                                       String titular) {

        int posicion = buscarRedactora(llistaRedactores, dni);
        int posicion2 = llistaRedactores.get(posicion).buscarNoticia(titular);

        if (posicion2 >= 0) {
            llistaRedactores.get(posicion).getLlistaNoticies().remove(posicion2);
            System.out.println("La notitica " + titular + " ja ha estat eliminada");
        } else {
            System.out.println("Aquesta noticia NO existeix");
        }
        return llistaRedactores;
    }
    public static void mostrarTotesNoticies(ArrayList<Redactora> llistaRedactores, String nom, int dni) {

        int posicion = buscarRedactora(llistaRedactores, dni);

        if (posicion >= 0) {

            llistaRedactores.get(posicion).imprimirNoticies(llistaRedactores, posicion);

        } else {
            System.out.println("Aquest/a redactor/a NO existeix");
        }

    }

    public static ArrayList<Redactora> calcularPuntuacioNoticia(ArrayList<Redactora> llistaRedactores, int dni,
                                                                String titular) {

        int posicion = buscarRedactora(llistaRedactores, dni);
        int posicion2 = llistaRedactores.get(posicion).buscarNoticia(titular);
        int puntuacio = 0;

        if (posicion >= 0 && posicion2 >= 0) {
            puntuacio = llistaRedactores.get(posicion).getLlistaNoticies().get(posicion2).calcularPuntuacioNoticia();
            System.out.println("La noticia " + titular + " té una puntuació de " + puntuacio);

        } else if (posicion == -1 && posicion2 >= 0) {
            System.out.println("El/la redactor/a que has introduit no existeix, revisa les dades introduides");

        } else {
            System.out.println("El titular que has introduit no existeix, revisa les dades introduides");
        }

        return llistaRedactores;
    }

    public static ArrayList<Redactora> calcularPreuNoticia(ArrayList<Redactora> llistaRedactores, int dni,
                                                           String titular) {

        int posicion = buscarRedactora(llistaRedactores, dni);
        int posicion2 = llistaRedactores.get(posicion).buscarNoticia(titular);
        int preu = 0;

        if (posicion >= 0 && posicion2 >= 0) {
            preu = llistaRedactores.get(posicion).getLlistaNoticies().get(posicion2).calcularPreuNoticia();
            System.out.println("La noticia " + titular + " té una preu de " + preu + " Euros");

        } else if (posicion == 0 && posicion2 >= 0) {
            System.out.println("El/la redactor/a que has introduit no existeix, revisa les dades introduides");

        } else {
            System.out.println("El titular que has introduit no existeix, revisa les dades introduides");
        }
        return llistaRedactores;
    }

    public static int buscarRedactora(ArrayList<Redactora> llistaRedactora, int dni) {

        boolean encontrado = false;

        int posicion = -1;
        int indice = 0;

        while (indice < llistaRedactora.size() && !encontrado) {

            if (llistaRedactora.get(indice).getDni() == dni) {
                posicion = indice;
                encontrado = true;
            }
            indice++;
        }

        return posicion;
    }

    public static int pideInt(String mensaje) {
        Scanner input = new Scanner(System.in);

        System.out.println(mensaje);

        return input.nextInt();
    }

    public static String pideString(String mensaje) {
        Scanner input = new Scanner(System.in);

        System.out.println(mensaje);

        return input.nextLine();
    }
}
