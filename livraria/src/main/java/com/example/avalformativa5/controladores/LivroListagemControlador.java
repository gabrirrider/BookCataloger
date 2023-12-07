package com.example.avalformativa5.controladores;

import com.example.avalformativa5.entidades.Livro;
import com.example.avalformativa5.repositorios.LivroRepositorio;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.omnifaces.util.Faces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ViewScoped
@Data
public class LivroListagemControlador {
    private List<Livro> livros;

    @Autowired
    private LivroRepositorio livroRepositorio;

    @PostConstruct
    public void listar(){
        livros = livroRepositorio.listar();
    }

    public void excluir(Livro livro){
        Faces.setFlashAttribute("exclusao", livro);
        Faces.redirect("livro-exclusao.xhtml");
    }

    public void editar(Livro livro){
        Faces.setFlashAttribute("edicao", livro);
        Faces.redirect("livro-edicao.xhtml");
    }

}
