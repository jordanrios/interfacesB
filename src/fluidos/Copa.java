package local.cdm.fluidos;

import local.cdm.energias.*;

/**
 *
 * @author Silvia Martinez Riobo
 */
public class Copa extends Liquido implements Graduable, Bebible {

    private Graduable alcohol;
    private Liquido mezcla;

    public Copa(Graduable alcohol, Liquido mezcla) {
        super(mezcla.getLitros(), mezcla.getColor());
        this.alcohol = alcohol;
        this.mezcla = mezcla;
        
        Liquido l = (Liquido) this.alcohol;
        super.setLitros(l.getLitros() + mezcla.getLitros());
        super.setColor(l.getColor()+"-"+mezcla.getColor());
        
    }

    public Graduable getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Graduable alcohol) {
        this.alcohol = alcohol;
    }

    public Liquido getMezcla() {
        return mezcla;
    }

    public void setMezcla(Liquido mezcla) {
        this.mezcla = mezcla;
    }

    @Override
    public Liquido mezclar(Liquido l) throws NoSePuedeMezclarException {
        throw new NoSePuedeMezclarException();
    }

    @Override
    public Double getGrados() {
        Liquido l = (Liquido) this.alcohol;
        Double graduacion = this.alcohol.getGrados() * (l.getLitros() / this.mezcla.getLitros());
        return graduacion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGrados: " + this.getGrados();
    }

    @Override
    public Integer getEnergia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
