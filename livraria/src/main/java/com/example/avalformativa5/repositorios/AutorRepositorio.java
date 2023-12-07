package com.example.avalformativa5.repositorios;

import com.example.avalformativa5.entidades.Autor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AutorRepositorio {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Autor> listar(){
        Query consulta = entityManager.createQuery("select a from Autor a");
        List<Autor> autors = consulta.getResultList();
        return autors;
    }
}
