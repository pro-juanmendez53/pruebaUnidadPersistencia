package edu.ejercicios.DTO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.sql.Connection;

public class InscripcionesClassDTO
{
    private final SessionFactory sessionFactory;

    public InscripcionesClassDTO(SessionFactory sessionFactory)
    {
        this.sessionFactory=sessionFactory;
    }

    public List<InscripcionesClassDTO> obtenerTodos() {
    Session session = sessionFactory.openSession();
    Query query = session.createQuery("SELECT e FROM inscripciones i ");
    List<InscripcionesClassDTO> inscripcionDTOs = query.list();
    session.close();
    return inscripcionDTOs;
    }

    public InscripcionesClassDTO obtenerPorId(Long id) {
        Session session = sessionFactory.openSession();
        InscripcionesClassDTO inscripcionDTO = session.get(InscripcionesClassDTO.class, id);
        session.close();
        return inscripcionDTO;
    }

    public void guardar(InscripcionesClassDTO inscripcionDTO) {
        Session session = sessionFactory.openSession();
        session.persist(inscripcionDTO);
        session.close();
    }

    public void actualizar(InscripcionesClassDTO inscripcionDTO) {
        Session session = sessionFactory.openSession();
        session.update(inscripcionDTO);
        session.close();
    }

    public void eliminar(Long id) {
        Session session = sessionFactory.openSession();
        InscripcionesClassDTO inscripcionDTO = session.get(InscripcionesClassDTO.class, id);
        session.delete(inscripcionDTO);
        session.close();
    }



}
