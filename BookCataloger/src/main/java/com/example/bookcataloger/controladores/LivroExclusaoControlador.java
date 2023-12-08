package com.example.bookcataloger.controladores;

import com.example.bookcataloger.entidades.Livro;
import com.example.bookcataloger.repositorios.LivroRepositorio;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.omnifaces.util.Faces;
import org.omnifaces.util.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ViewScoped
@Data
public class LivroExclusaoControlador {
    @Autowired
    private LivroRepositorio livroRepositorio;

    private Livro livro;

    @PostConstruct
    public void carregar(){
        livro = Faces.getFlashAttribute("exclusao");
    }

    public void excluir(){
        livroRepositorio.remover(livro.getId());
        Messages.addFlashGlobalInfo("Registro removido");
        Faces.redirect("livro-listagem.xhtml");
    }
}
