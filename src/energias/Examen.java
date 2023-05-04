/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.cdm.energias;

/**
 *
 * @author alumno
 */
public abstract class Examen implements Accion{
    
    protected String asignatura;
    protected Integer minutos;
    protected Integer energiaNecesaria;

    public Examen(String asignatura, Integer minutos) {
        this.asignatura = asignatura;
        this.minutos = minutos;
        this.energiaNecesaria = null;
    }
    
    
    
    
    
    
    @Override
    public abstract void hacer();

    
    
    @Override
    public abstract Integer getEnergia();

    
    
    
    public String getAsignatura() {
        return asignatura;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public Integer getEnergiaNecesaria() {
        return energiaNecesaria;
    }

    

    
    
    
    
    
}
