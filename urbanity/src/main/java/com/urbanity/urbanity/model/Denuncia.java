package com.urbanity.urbanity.model;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

public class Denuncia {
    private Long id;
    private String descricao;
    private String localizacao;
    private LocalDateTime dataHora;

    public Denuncia(Long id, String descricao, String localizacao, LocalDateTime dataHora) {
        this.id = id;
        this.descricao = descricao;
        this.localizacao = localizacao;
        this.dataHora = dataHora;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Long getId() {
        return id;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getDescricao() {
        return descricao;
    }
}