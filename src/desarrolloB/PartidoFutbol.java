/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrolloB;

/**
 *
 * @author alumno
 */
public class PartidoFutbol implements Accion{
    
    private Integer categoria;
    private Boolean prorroga;
    private Boolean penaltis;
    private Integer energiaNecesaria;

    public PartidoFutbol(Integer categoria) {
        if(categoria >= 1 && categoria <=7){
            this.categoria = categoria;
        }else{
            this.categoria = 1;
        }
        this.prorroga = null;
        this.penaltis = null;
    }
    
    
    
    
    
    
    @Override
    public void hacer(){
        
    }

    @Override
    public Integer getEnergia() {
        Integer salida = null;
        if(this.penaltis){
            salida = Math.round(this.categoria * 40 * 1.20f);
        }else if(this.prorroga){
            salida = Math.round(this.categoria * 40 * 1.15f);
        }else{
            salida = Math.round(this.categoria * 40);
        }
        return salida;
    }

    
    
    
        
    public Boolean getProrroga() {
        return prorroga;
    }

    public void setProrroga(Boolean prorroga) {
        this.prorroga = prorroga;
    }

    public Boolean getPenaltis() {
        return penaltis;
    }

    public void setPenaltis(Boolean penaltis) {
        if(this.prorroga){
            this.penaltis = penaltis;
        }
    }
    
       
    
    
}
