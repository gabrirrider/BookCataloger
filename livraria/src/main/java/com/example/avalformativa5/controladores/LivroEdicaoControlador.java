package com.example.avalformativa5.controladores;

import com.example.avalformativa5.entidades.Autor;
import com.example.avalformativa5.entidades.Editora;
import com.example.avalformativa5.entidades.Livro;
import com.example.avalformativa5.repositorios.AutorRepositorio;
import com.example.avalformativa5.repositorios.EditoraRepositorio;
import com.example.avalformativa5.repositorios.LivroRepositorio;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.omnifaces.util.Faces;
import org.omnifaces.util.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ViewScoped
@Data
public class LivroEdicaoControlador {
    @Autowired
    private AutorRepositorio autorRepositorio;

    @Autowired
    private EditoraRepositorio editoraRepositorio;

    @Autowired
    private LivroRepositorio livroRepositorio;

    private List<Autor> autors;

    private List<Editora> editoras;

    private Livro livro;

    @PostConstruct
    public void carregar(){
        livro = Faces.getFlashAttribute("edicao");
        autors = autorRepositorio.listar();
        editoras = editoraRepositorio.listar();
    }
















    public void editar(){
        livroRepositorio.editar(livro);
        Messages.addFlashGlobalInfo("Registro editato");
        Faces.redirect("livro-listagem.xhtml");
    }
}
