/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrolloB;

/**
 *
 * @author alumno
 */
public class ExamenPractico extends Examen{

    public ExamenPractico(String asignatura, Integer minutos) {
        super(asignatura, minutos);
        this.energiaNecesaria = Math.round(minutos/2);
    }
    
    
    @Override
    public void hacer(){
        System.out.println("");//Revisarrrrrr
    }

    @Override
    public Integer getEnergia() {
        return this.energiaNecesaria;
    }
    
    
}
