package com.example.bookcataloger.repositorios;

import com.example.bookcataloger.entidades.Livro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class LivroRepositorio {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void inserir(Livro livro){
        entityManager.persist(livro);
    }

    @Transactional
    public void editar(Livro livro){
        entityManager.merge(livro);
    }

    @Transactional
    public void remover(Integer id){
         Livro livro = entityManager.find(Livro.class, id);
        entityManager.remove(livro);
    }
    public List<Livro> listar(){
        Query consulta = entityManager.createQuery("select l from Livro l");
        List<Livro> livros = consulta.getResultList();
        return livros;
    }
}
