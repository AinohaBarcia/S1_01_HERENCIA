package n2exercici1;

public class Smartphone extends Telefono implements ICamara,IReloj {
    public Smartphone(String marca, String model) {
        super(marca, model);

    }
    @Override
    public String alarma() {
        // TODO Auto-generated method stub
        return "Està sonant l'alarma";

    }

    @Override
    public String fotografiar() {
        // TODO Auto-generated method stub
        return "S'està fent una foto";
    }


    @Override
    public String toString() {
        return "És un smartphone marca " + marca + " i model=" + model + "]";
    }


}
