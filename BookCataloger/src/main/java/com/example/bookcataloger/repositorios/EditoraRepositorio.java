package com.example.bookcataloger.repositorios;

import com.example.bookcataloger.entidades.Editora;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EditoraRepositorio {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Editora> listar() {
        Query consulta = entityManager.createQuery("select e from Editora e");
        List<Editora> editoras = consulta.getResultList();
        return editoras;
    }
}
