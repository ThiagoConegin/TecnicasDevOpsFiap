package com.urbanity.urbanity.model;

import org.springframework.stereotype.Component;

public class Sensor {
    private Long id;
    private String tipo;
    private double valor;
    private String localizacao;

    public Sensor(Long id, String tipo, double valor, String localizacao) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
        this.localizacao = localizacao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public Long getId() {
        return id;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public String getTipo() {
        return tipo;
    }
}
