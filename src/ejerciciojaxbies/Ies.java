/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojaxbies;


import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DAM209
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Ies {
    @XmlAttribute
    private String nombre;
    @XmlAttribute
    private String localidad;
    @XmlMixed
    @XmlElementRefs({
        @XmlElementRef(type = Direccion.class),
        @XmlElementRef(type = Grupo.class)
    })
    private ArrayList<Object> direccionesGrupos = new ArrayList();
    
    
    public Ies() {
        
    }
    
    public Ies(String nombre, String localidad) {
        this.nombre = nombre;
        this.localidad = localidad;
    }

    public Ies(String nombre, String localidad, ArrayList<Object> direccionesGrupos) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.direccionesGrupos = direccionesGrupos;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void annadirDireccionGrupo(Object direccionGrupo) {
        direccionesGrupos.add(direccionGrupo);
    }

    
    
    

    
    
    
}
