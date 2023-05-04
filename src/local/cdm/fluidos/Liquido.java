package local.cdm.fluidos;

/**
 *
 * @author alumno
 */
public abstract class Liquido {

    protected Double litros;
    protected String color;

    public Liquido(Double litros, String color) {
        this.litros = litros;
        this.color = color;
    }

    public Double getLitros() {
        return litros;
    }

    public void setLitros(Double litros) {
        this.litros = litros;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void incrementar(Double litros) {
        this.litros += litros;
    }

    public abstract Liquido mezclar(Liquido l) throws NoSePuedeMezclarException;

    @Override
    public String toString() {
        return "Litros: " + litros + "\nColor=" + color;
    }
}
