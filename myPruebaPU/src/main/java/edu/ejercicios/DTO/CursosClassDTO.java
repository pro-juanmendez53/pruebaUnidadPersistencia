package edu.ejercicios.DTO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import java.util.List;


public class CursosClassDTO
{
    private final SessionFactory sessionFactory;

    public CursosClassDTO(SessionFactory sessionFactory)
    {
        this.sessionFactory=sessionFactory;
    }

    public List<CursosClassDTO> obtenerTodos() {
    Session session = sessionFactory.openSession();
    Query query = session.createQuery("SELECT e FROM cursos c");
    List<CursosClassDTO> cursoDTOs = query.list();
    session.close();
    return cursoDTOs;
    }

    public CursosClassDTO obtenerPorId(Long id) {
        Session session = sessionFactory.openSession();
        CursosClassDTO cursoDTO = session.get(CursosClassDTO.class, id);
        session.close();
        return cursoDTO;
    }

    public void guardar(CursosClassDTO cursoDTO) {
        Session session = sessionFactory.openSession();
        session.persist(cursoDTO);
        session.close();
    }

    public void actualizar(CursosClassDTO cursoDTO) {
        Session session = sessionFactory.openSession();
        session.update(cursoDTO);
        session.close();
    }

    public void eliminar(Long id) {
        Session session = sessionFactory.openSession();
        CursosClassDTO cursoDTO = session.get(CursosClassDTO.class, id);
        session.delete(cursoDTO);
        session.close();
    }



}
