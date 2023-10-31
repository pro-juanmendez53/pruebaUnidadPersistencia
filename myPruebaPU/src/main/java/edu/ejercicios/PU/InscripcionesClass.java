package edu.ejercicios.PU;

import java.sql.Date;
import java.util.Objects;

public class InscripcionesClass {
    //ACA SE CREARON LOS ATRIBUTOS DE LA CLASE InscripcionesClass
    private int idInscripcion;
    private Integer idEstudiante;
    private Integer idCurso;
    private Date fechaInscripcion;
    private EstudiantesClass listaEstudiantesidest;
    private CursosClass listaCursosidcur;

    //Aca se crearon los Getters and Setters de todos los atributos
    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Integer getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InscripcionesClass that = (InscripcionesClass) o; //Aca transformara al objeto "o" en uno del tipo InscripcionesClass
        return idInscripcion == that.idInscripcion && Objects.equals(idEstudiante, that.idEstudiante) && Objects.equals(idCurso, that.idCurso) && Objects.equals(fechaInscripcion, that.fechaInscripcion);
    } //Este metodo comparara dos objetos de la clase InscripcionesClass, devolvera true si son iguales en todos sus atributos y si no son iguales devuelve false

    //El siguiente metodo genera un valor hash para el objeto basado en los atributos  idInscripcion, idEstudiante, idCurso, fechaInscripcion
    //Este valor se utilizara para almacenar el objeto en una Collection
    @Override
    public int hashCode() {
        return Objects.hash(idInscripcion, idEstudiante, idCurso, fechaInscripcion);
    }

    public EstudiantesClass getListaEstudiantesidest() {
        return listaEstudiantesidest;
    }

    public void setListaEstudiantesidest(EstudiantesClass listaEstudiantesidest) {
        this.listaEstudiantesidest = listaEstudiantesidest;
    }

    public CursosClass getListaCursosidcur() {
        return listaCursosidcur;
    }

    public void setListaCursosidcur(CursosClass listaCursosidcur) {
        this.listaCursosidcur = listaCursosidcur;
    }
}
