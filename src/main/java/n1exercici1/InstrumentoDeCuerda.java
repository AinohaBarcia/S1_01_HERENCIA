package n1exercici1;

public class InstrumentoDeCuerda extends Instrumentos {
    public InstrumentoDeCuerda(String nombre, int precio) {
        super(nombre, precio);
    }

    @Override
    public String tocar() {

        return "Está sonando un instrumento de cuerda";
    }

}
