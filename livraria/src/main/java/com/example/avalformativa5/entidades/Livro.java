package com.example.avalformativa5.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Livro {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    private String titulo;

    @ManyToOne
    private Autor autor;

    @ManyToOne
    private Editora editora;

    private Integer anoDePublicacao;
}
