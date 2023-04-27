/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrolloB;

import java.util.List;

/**
 *
 * @author alumno
 */
public class Persona implements Energetico{
    private String nombre;
    private Double capacidadVejiga;
    private Double estadoVejiga;
    private Integer energiaActual;
    private List<Accion> tareas;

    public Persona(String nombre, Double capacidadVejiga) {
        this.nombre = nombre;
        this.capacidadVejiga = capacidadVejiga;
        this.capacidadVejiga = 0.0;
        this.energiaActual = 100;
    }
    
    
    
    
    
    public void addTarea(Accion accion){
        
    }
    
    public Integer hacerTareas(){
        Integer salida = 0;
        return salida;
    }
    
    public void vaciarVejiga(){
        
    }
    
    public Double beber(Bebible bebida){
        Double salida = 0.0;
        return salida;
    }

    @Override
    public Integer getEnergia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
