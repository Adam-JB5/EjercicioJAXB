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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DAM209
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement
public class Direccion {
    @XmlAttribute
    private String tipo;
    @XmlElement
    private Director director;
    private ArrayList<JefeEstudios> jefesEstudios = new ArrayList();
    
    public Direccion() {
        
    }
    
    public Direccion(String tipo, Director director) {
        this.tipo = tipo;
        this.director = director;
    }

    public Direccion(String tipo, Director director, ArrayList<JefeEstudios> jefesEstudios) {
        this.tipo = tipo;
        this.director = director;
        this.jefesEstudios = jefesEstudios;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @XmlElement(name="jefe_estudios")
    public ArrayList<JefeEstudios> getJefesEstudios() {
        return jefesEstudios;
    }
    

    public void annadirJefesEstudio(JefeEstudios jefeEstudio) {
        jefesEstudios.add(jefeEstudio);
    }
    
}
