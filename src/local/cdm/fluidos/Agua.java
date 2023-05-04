package local.cdm.fluidos;

import local.cdm.energias.*;

/**
 *
 * @author alumno
 */
public class Agua extends Liquido implements Bebible{
    public static Double PUREZA_DEF=1.0;
    private Double pureza;

    public Agua(Double litros) {
        super(litros, "incoloro");
        this.pureza = PUREZA_DEF;
    }

    public Double getPureza() {
        return pureza;
    }

    public void setPureza(Double pureza) {
        if(pureza<=1 && pureza>=0){
            this.pureza = pureza;
        }else{
            this.pureza=PUREZA_DEF;
        }
    }

    @Override
    public Liquido mezclar(Liquido l) {
        Agua a = new Agua(l.getLitros()+this.litros);
        a.setColor(l.getColor() + "-" + this.color);
        if (l.getClass().getSimpleName().equals("Lejia")){
            a.setPureza(1.0);
        }else{
            Double r = a.getLitros()/l.getLitros();
            a.setPureza(r);
        }
        return a;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPureza: " + pureza;
    }

    @Override
    public Integer getEnergia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
