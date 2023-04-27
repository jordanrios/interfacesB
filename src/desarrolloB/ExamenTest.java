/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrolloB;

/**
 *
 * @author alumno
 */
public class ExamenTest extends Examen{
    
    private Integer numPreguntas;
    private Boolean resta;

    public ExamenTest(Integer numPreguntas, Boolean resta, String asignatura) {
        
        super(asignatura, Math.round(numPreguntas/2));
        this.numPreguntas = numPreguntas;
        this.resta = resta;
    }
    
    
    
    
    @Override
    public void hacer(){
        
    }

    @Override
    public Integer getEnergia() {
        Integer salida = null;
        if(resta){
            salida = Math.round(this.numPreguntas / 2);
        }else{
            salida = Math.round(numPreguntas / 2);
        }
        return salida;
    }

    
    
    public Integer getNumPreguntas() {
        return numPreguntas;
    }

    public Boolean getResta() {
        return resta;
    }

    @Override
    public String getAsignatura() {
        return asignatura;
    }

    @Override
    public Integer getMinutos() {
        return minutos;
    }

    @Override
    public Integer getEnergiaNecesaria() {
        return energiaNecesaria;
    }
    
    
    
}
