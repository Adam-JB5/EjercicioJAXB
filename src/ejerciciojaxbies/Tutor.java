/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojaxbies;

import javax.xml.bind.annotation.XmlValue;

/**
 *
 * @author DAM209
 */
public class Tutor {
    private String nombre;
    
    public Tutor() {
        
    }
    
    public Tutor(String nombre) {
        this.nombre = nombre;
    }

    @XmlValue
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
