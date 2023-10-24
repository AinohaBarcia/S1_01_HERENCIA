package n1exercici1;

public class InstrumentosDeViento extends Instrumentos{
    public InstrumentosDeViento(String nombre, int precio) {
        super(nombre, precio);

    }
    @Override
    public String tocar() {

        return "Está sonando un instrumento de viento";
    }

}
