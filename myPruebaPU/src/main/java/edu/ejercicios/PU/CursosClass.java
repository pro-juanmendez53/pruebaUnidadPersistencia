package edu.ejercicios.PU;

import java.util.Collection;
import java.util.Objects;



public class CursosClass {

    //ACA SE CREARON LOS ATRIBUTOS DE LA CLASE CursosClass
    private int idCurso;
    private String nombreCurso;
    private String profesor;
    private Collection<InscripcionesClass> listaInscripcionesidcur; //Este atributo indica que se almacenara una Collectioin
    //de objetos de tipo "InscripcionesClass" en la variable llamada "listaInscripcionesidcur"

    //Aca se crearon los Getters and Setters de todos los atributos
    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CursosClass that = (CursosClass) o;  //Aca transformara al objeto "o" en uno del tipo CursosClass
        return idCurso == that.idCurso && Objects.equals(nombreCurso, that.nombreCurso) && Objects.equals(profesor, that.profesor);
    }  //Este metodo comparara dos objetos de la clase CursosClass, devolvera true si son iguales en todos sus atributos y si no son iguales devuelve false

    //El siguiente metodo genera un valor hash para el objeto basado en los atributos  idCurso, nombreCurso, profesor
    //Este valor se utilizara para almacenar el objeto en una Collection
    @Override
    public int hashCode() {
        return Objects.hash(idCurso, nombreCurso, profesor);
    }

    public Collection<InscripcionesClass> getListaInscripcionesidcur() {
        return listaInscripcionesidcur;
    }

    public void setListaInscripcionesidcur(Collection<InscripcionesClass> listaInscripcionesidcur) {
        this.listaInscripcionesidcur = listaInscripcionesidcur;
    }
}
