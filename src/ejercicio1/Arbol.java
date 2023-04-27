/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author alumno
 */
import java.time.LocalDate;
import java.util.Objects;


public class Arbol implements Relaciones{
    
    private Double altura;
    private LocalDate fSiembra;

    public Arbol() {
        altura = null;
        fSiembra = null;
    }

    public Arbol(Double altura, LocalDate fSiembra) {
        this.altura = altura;
        this.fSiembra = fSiembra;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public LocalDate getfSiembra() {
        return fSiembra;
    }

    public void setfSiembra(LocalDate fSiembra) {
        this.fSiembra = fSiembra;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.altura);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Arbol other = (Arbol) obj;
        return Objects.equals(this.altura, other.altura);
    }

    
    
    
    
    @Override
    public String toString() {
        return "Arbol{" + "altura=" + altura + ", sembrado=" + fSiembra + '}';
    }        

    @Override
    public boolean esMayor(Object b) {
        boolean salida = false;
        if(b != null){
            if(this.getClass().equals(b.getClass())){
                Arbol aux =(Arbol) b;
                if(this.altura.compareTo(aux.getAltura()) > 0){
                    salida = true;
                }
            }
        }
        return salida;
    }

    @Override
    public boolean esMenor(Object b) {
        boolean salida = false;
        if(b != null){
            if(b instanceof Arbol){
                Arbol aux =(Arbol) b;
                if(this.altura.compareTo(aux.getAltura()) < 0){
                    salida = true;
                }
            }
        }
        return salida;
    }

    @Override
    public boolean esIgual(Object b) {
    
        boolean salida = false;
        if(b != null){
            if(b instanceof Arbol){
                Arbol aux =(Arbol) b;
                if(this.altura.compareTo(aux.getAltura()) == 0){    //o si no equals
                    salida = true;
                }
            }
        }
        return salida;
    }
    
}
