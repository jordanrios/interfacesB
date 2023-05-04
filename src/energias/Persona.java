/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.cdm.energias;

import static java.lang.Integer.compare;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Persona implements Energetico {

    private String nombre;
    private Double capacidadVejiga;
    private Double estadoVejiga;
    private Integer energiaActual;
    private List<Accion> tareas;

    public Persona(String nombre, Double capacidadVejiga) {
        this.nombre = nombre;
        this.capacidadVejiga = capacidadVejiga;
        this.estadoVejiga = 0.0;
        this.energiaActual = 100;
        this.tareas = new ArrayList();
    }

    public void addTarea(Accion accion) {
        tareas.add(accion);
    }

    public Integer hacerTareas() {
        Integer tareasRealizadas = 0;
        for (Accion tarea : tareas) {
            //si tengo energia para hacer tarea
            if (this.energiaActual >= tarea.getEnergia()) {
                tarea.hacer();
                this.energiaActual -= tarea.getEnergia();
                tareas.remove(tarea);
                tareasRealizadas++;
            } else { //si no
                break;
            }

        }
        return tareasRealizadas;
    }

    public void vaciarVejiga() {
        this.capacidadVejiga = 0.0;
    }

    public Double beber(Bebible bebida) {
        Double litrosBebida = bebida.getLitros();
        float litrosBebidos = 0.0f;
        while(this.capacidadVejiga > this.estadoVejiga && litrosBebida > 0.0){
            this.estadoVejiga += 0.1;
            litrosBebida -= 0.1;
            litrosBebidos += 0.1;
        }
        this.energiaActual = Math.round(litrosBebidos);
        Double litrosBebidosDouble = Double.valueOf(litrosBebidos);
        return litrosBebidosDouble;
    }

    @Override
    public Integer getEnergia() {
        return this.energiaActual;
    }

}
