package com.estudo.eventos.entidades;

import javax.persistence.*;

@Entity
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String categoria;
    private String descricao;
    private String imagem;
    private String criado_em;

    private String atualizado_em;

    // Getters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() { return categoria;}

    public String getDescricao() {
        return descricao;
    }

    public String getImagem() {
        return imagem;
    }

    public String getCriado_em() {
        return criado_em;
    }

    public String getAtualizado_em() { return atualizado_em;}

    // Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void SetCategoria(String categoria) { this.categoria = categoria;}

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public void setCriado_em(String criado_em) {
        this.criado_em = criado_em;
    }

    public void setAtualizado_em(String atualizado_em) { this.atualizado_em = atualizado_em;}
}
