package local.cdm.fluidos;

import local.cdm.energias.*;

/**
 *
 * @author Silvia Martinez Riobo
 */
public class Cola extends Liquido implements Bebible{
    private boolean cafeina;

    public Cola(boolean cafeina, Double litros) {
        super(litros, "oscuro");
        this.cafeina = cafeina;
    }

    public boolean isCafeina() {
        return cafeina;
    }

    public void setCafeina(boolean cafeina) {
        this.cafeina = cafeina;
    }
    
    @Override
    public Liquido mezclar(Liquido l) throws NoSePuedeMezclarException{
        throw new NoSePuedeMezclarException();
    }

    @Override
    public String toString() {
        return super.toString() + "\nCafeina: " + cafeina;
    }

    @Override
    public Integer getEnergia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
