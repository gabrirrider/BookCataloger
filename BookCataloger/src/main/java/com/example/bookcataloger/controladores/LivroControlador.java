package com.example.bookcataloger.controladores;

import com.example.bookcataloger.entidades.Autor;
import com.example.bookcataloger.entidades.Editora;
import com.example.bookcataloger.entidades.Livro;
import com.example.bookcataloger.repositorios.AutorRepositorio;
import com.example.bookcataloger.repositorios.EditoraRepositorio;
import com.example.bookcataloger.repositorios.LivroRepositorio;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.omnifaces.util.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ViewScoped
@Data
public class LivroControlador {
    @Autowired
    private AutorRepositorio autorRepositorio;

    @Autowired
    private EditoraRepositorio editoraRepositorio;

    @Autowired
    private LivroRepositorio livroRepositorio;

    private Livro livro;

    private List<Autor> autors;

    private List<Editora> editoras;

    @PostConstruct
    public void novo() {
        livro = new Livro();
        autors = autorRepositorio.listar();
        editoras = editoraRepositorio.listar();
    }

    public void salvar() {
        livroRepositorio.inserir(livro);
        Messages.addFlashGlobalInfo("Registro salvo com sucesso");
        livro = new Livro();
        autors = autorRepositorio.listar();
        editoras = editoraRepositorio.listar();
    }
}
