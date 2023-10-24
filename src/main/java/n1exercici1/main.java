package n1exercici1;

public class main {

    public static void main(String[] args) {

        InstrumentoDeCuerda guitarra = new InstrumentoDeCuerda("GuitarritaFantastica",1560);
        InstrumentoDePercusion bateria =  new InstrumentoDePercusion("Bateria",2600);
        InstrumentosDeViento flauta = new InstrumentosDeViento ("Flauta",890);

        System.out.println(guitarra.tocar());
        System.out.println(bateria.tocar());
        System.out.println(flauta.tocar());

    }

}
