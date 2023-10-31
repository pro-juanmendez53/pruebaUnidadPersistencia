package edu.ejercicios.DTO;

import edu.ejercicios.PU.EstudiantesClass;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EstudiantesClassDTO
{
    private final SessionFactory sessionFactory;  //variable de instancia que almacena una referencia a
        //una fabrica de sesiones (SessionFactory)

    public EstudiantesClassDTO(SessionFactory sessionFactory)
    {
        this.sessionFactory=sessionFactory;  //constructor de la clase que recibe de parametro una referencia a la fabrica de sesiones
    }

    public List<EstudiantesClassDTO> obtenerTodos() {  //Esta funcion devolvera una lista de objetos
    Session session = sessionFactory.openSession();  //linea para abrir una sesion con la fabrica de sesiones
    Query query = session.createQuery("SELECT e FROM estudiantes e"); // Esta es una línea de código que crea una consulta SQL utilizando el método createQuery
        // de la sesión. La consulta selecciona todos los objetos de la clase Estudiantes (e).

    List<EstudiantesClassDTO> estudianteDTOs = query.list(); //ejecuta la consulta y devuelve una lista de objetos "EstudiantesClassDTO"
    session.close();  //aca cerramos la sesion
    return estudianteDTOs;  //esta línea de código nos devolvera una lista de objetos "EstudiantesClassDTO"
    }

    public EstudiantesClassDTO obtenerPorId(Long id) {  //esta funcion devolvera un objeto EstudianteClassDTO a partir del id de un objeto estudiante
        Session session = sessionFactory.openSession();
        EstudiantesClassDTO estudianteDTO = session.get(EstudiantesClassDTO.class, id); //selecciona un objeto EstudiantesClassDTO a partir del id que recibio como parametro
        session.close();
        return estudianteDTO;
    }

    public void guardar(EstudiantesClassDTO estudianteDTO) {  //esta funcion guardara un objeto EstudiantesClassDTO en la DB
        Session session = sessionFactory.openSession();
        session.persist(estudianteDTO);  //guarda el objeto de la base de datos utilizando el metodo persist de la sesion
        session.close();
    }

    public void actualizar(EstudiantesClassDTO estudianteDTO) { //esta funcion actualizara los datos de un objeto en la DB
        Session session = sessionFactory.openSession();
        session.update(estudianteDTO); //guardara el objeto en la base de datos utilizando el metodo update de la sesion
        session.close();
    }

    public void eliminar(Long id) { //funcion que eliminara un objeto de la base de datos
        Session session = sessionFactory.openSession();
        EstudiantesClassDTO estudianteDTO = session.get(EstudiantesClassDTO.class, id);
        //la linea de arriba selecciona el objeto a eliminar de la base de datos utilizando el id que recibe como parametro
        session.delete(estudianteDTO); //elimina el objeto seleccionado utilizando el metodo delete de la sesion
        session.close();
    }


}
