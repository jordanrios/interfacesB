package local.cdm.fluidos;

import local.cdm.energias.*;

/**
 *
 * @author alumno
 */
public class Vodka extends Liquido implements Graduable, Bebible{
    public static Double GRADOS_DEF = 1.0;
    private Double grados;

    public Vodka(Double grados, Double litros) {
        super(litros, "incoloro");
        this.grados = grados;
    }

    @Override
    public Double getGrados() {
        return grados;
    }

    public void setGrados(Double grados) {
         if (grados >= 0 && grados <= 1) {
            this.grados = grados;
        } else {
            this.grados = GRADOS_DEF;
        }
    }

    @Override
    public Liquido mezclar(Liquido l) throws NoSePuedeMezclarException {
        Copa c;
        if (l.getClass().getSimpleName().equals("Cola") || l.getClass().getSimpleName().equals("Agua")) {
            Graduable g = (Graduable) this;
            c = new Copa(g,l);
        }else{
            throw new NoSePuedeMezclarException();
        }
        return (Liquido) c;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGrados: " + grados;
    }

    @Override
    public Integer getEnergia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
