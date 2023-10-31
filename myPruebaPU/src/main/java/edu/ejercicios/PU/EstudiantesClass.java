package edu.ejercicios.PU;

import java.util.Collection;
import java.util.Objects;

public class EstudiantesClass {
    //ACA SE CREARON LOS ATRIBUTOS DE LA CLASE EstudiantesClass
    private int idEstudiante;
    private String nombre;
    private String apellido;
    private String email;
    private Collection<InscripcionesClass> listaInscripcionesidest; //Este atributo indica que se almacenara una Collectioin
    //de objetos de tipo "InscripcionesClass" en la variable llamada "listaInscripcionesidest"

    //Aca se crearon los Getters and Setters de todos los atributos

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstudiantesClass that = (EstudiantesClass) o; //Aca transformara al objeto "o" en uno del tipo EstudiantesClass
        return idEstudiante == that.idEstudiante && Objects.equals(nombre, that.nombre) && Objects.equals(apellido, that.apellido) && Objects.equals(email, that.email);
    }  //Este metodo comparara dos objetos de la clase EstudiantesClass, devolvera true si son iguales en todos sus atributos y si no son iguales devuelve false

    //El siguiente metodo genera un valor hash para el objeto basado en los atributos  idEstudiante, nombre, apellido email
    //Este valor se utilizara para almacenar el objeto en una Collection
    @Override
    public int hashCode() {
        return Objects.hash(idEstudiante, nombre, apellido, email);
    }

    public Collection<InscripcionesClass> getListaInscripcionesidest() {
        return listaInscripcionesidest;
    }

    public void setListaInscripcionesidest(Collection<InscripcionesClass> listaInscripcionesidest) {
        this.listaInscripcionesidest = listaInscripcionesidest;
    }

}
