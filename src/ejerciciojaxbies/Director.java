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
public class Director {
    private String nombre;
    
    public Director() {
        
    }
    
    public Director(String nombre) {
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
