package n3exercici1;

public class Motociclisme extends Noticia {
    private String equip;

    //Constructor
    public Motociclisme(String titular, String text, byte puntuacio, int preu,String equip) {
        super(titular, text, puntuacio, preu);
        this.equip = equip;
    }
    public Motociclisme (String titular,String equip) {
        super (titular);
        this.equip=equip;
    }

    //GEtter & Setter
    public String getEquip() {
        return equip;
    }

    public void setEscuderia(String escuderia) {
        this.equip = equip;
    }

    //Métodes de classe
    @Override
    public int calcularPreuNoticia() {
        preu = 100;
        String equip1 ="Honda";
        String equip2 = "Yamaha";


        if (equip.equalsIgnoreCase(equip1)||equip.equalsIgnoreCase(equip2)) {
            preu += 50;
        }else {
            System.out.println("No acumules diners extres");
        }

        return preu;
    }

    @Override
    public int calcularPuntuacioNoticia() {
        puntuacio =3;
        String equip1 ="Ferrari";
        String equip2 = "Mercedes";


        if (equip.equalsIgnoreCase(equip1)||equip.equalsIgnoreCase(equip2)) {
            preu += 3;
        }else {
            System.out.println("No acumules punts extres");
        }

        return puntuacio;
    }
}
