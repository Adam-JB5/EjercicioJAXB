/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojaxbies;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author DAM209
 */
public class EjercicioJAXBIES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creo ies
        Ies ies = new Ies("Ataulfo Argenta", "Castro Urdiales");
        
        //Creo un Director y 2 JefesEstudio
        Director director = new Director("Director1");
        JefeEstudios jefeEstudio1 = new JefeEstudios("principal", "Juan JE1");
        JefeEstudios jefeEstudio2 = new JefeEstudios("principal", "Juan JE2");
        
        //Creo direccion y añado 2 JefesEstudio y un Director
        Direccion direccion = new Direccion("provisional", director);
        direccion.annadirJefesEstudio(jefeEstudio1);
        direccion.annadirJefesEstudio(jefeEstudio2);
        
        ies.annadirDireccionGrupo(direccion);
        
        
        //Creo 4 alumnos y 2 tutores
        Alumno alumno1 = new Alumno("Juan1", "masculino");
        Alumno alumno2 = new Alumno("Juan2", "masculino");
        Alumno alumno3 = new Alumno("Clara1", "femenino");
        Alumno alumno4 = new Alumno("Clara2", "femenino");
        
        Tutor tutor1 = new Tutor("Tutor1");
        Tutor tutor2 = new Tutor("Tutor2");
        
        
        //Creo 2 grupos
        Grupo grupo1 = new Grupo("ESO", 3, tutor1);
        Grupo grupo2 = new Grupo("ESO", 4, tutor2);
        
        //Annado 2 alumnos a cada grupo
        grupo1.annadirAlumno(alumno1);
        grupo1.annadirAlumno(alumno2);
        grupo2.annadirAlumno(alumno3);
        grupo2.annadirAlumno(alumno4);
        
        
        //Annado los grupos a ies
        ies.annadirDireccionGrupo(grupo1);
        ies.annadirDireccionGrupo(grupo2);
        
        
        
        
        
        
        try {
            System.out.println("Creando el objeto JAXBContext e iniciándolo con la clase de la que se va a hacer marshalling");
            JAXBContext jc = JAXBContext.newInstance(Ies.class);
            System.out.println("Creando el objeto Marshaller y configurándolo para que genere salida XML formateada");
            Marshaller m = jc.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            System.out.println("Convirtiendo el objeto en un documento XML y almacenándolo en un fichero");
            File ficheroXML = new File("fichero.xml");
            m.marshal(ies, ficheroXML);
            System.out.println("Fichero XML generado");
        } catch (JAXBException ex) {
            System.out.println(ex);
        }
    }
    
}
