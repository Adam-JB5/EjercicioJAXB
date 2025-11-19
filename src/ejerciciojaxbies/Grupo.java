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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DAM209
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlRootElement
public class Grupo {
    
    private String etapa;
    private int curso;
    private Tutor tutor;
    private ArrayList<Alumno> alumnos = new ArrayList();

    
    public Grupo() {
        
    }
    
    public Grupo(String etapa, int curso, Tutor tutor) {
        this.etapa = etapa;
        this.curso = curso;
        this.tutor = tutor;
    }

    @XmlAttribute
    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    @XmlAttribute
    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    @XmlElement
    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    @XmlElement
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
    
    public void annadirAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }
    
    
    
    
}
