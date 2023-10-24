package n1exercici1;

public class InstrumentoDePercusion extends Instrumentos{
    public InstrumentoDePercusion(String nombre, int precio) {
        super(nombre, precio);

    }
    @Override
    public  String tocar() {

        return "Está sonando un instrumento de percusión";
    }
}
