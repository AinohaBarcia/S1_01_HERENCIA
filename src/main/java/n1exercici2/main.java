package n1exercici2;

public class main {

    public static void main(String[] args) {

        Coche vehiculo1 = new Coche(180);

        System.out.println(vehiculo1.accelerar());
        System.out.println(Coche.frenar());
        System.out.println(Coche.getModel());


    }


}
