package com.urbanity.urbanity.StepDefinitions;

import io.cucumber.java.pt.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class DenunciaSteps {
    private Response response;
    private Map<String, String> denuncia;

    // Usuario registrando uma denuncia.
    @Dado("Usuário deseja registrar uma denúncia")
    public void usuarioDesejaRegistrarDenuncia() {
        denuncia = new HashMap<>();
        denuncia.put("descricao", "Árvore caída bloqueando rua");
        denuncia.put("localizacao", "Rua das Flores, 123");
    }

    @Quando("Usuário envia a descrição e a localização")
    public void enviaDescricaoELocalizacao() {
        response = RestAssured.given()
                .contentType("application/json")
                .body(denuncia)
                .post("http://localhost:8080/denuncias");
    }

    @Entao("Sistema retorna sucesso")
    public void sistemaRespondeCom() {
        Assert.assertEquals(200, response.getStatusCode());
    }

    // Teste de usuario tentando registrar uma denuncia incompleta.
    @Dado("Usuário quer registrar uma denúncia")
    public void usuarioQuerRegistrarDenuncia() {
        denuncia = new HashMap<>();
        denuncia.put("localizacao", "Avenida Paulista, 987"); // Sem descrição!
    }

    @Quando("ele envia apenas a localização")
    public void enviaApenasLocalizacao() {
        response = RestAssured.given()
                .contentType("application/json")
                .body(denuncia)
                .post("http://localhost:8080/denuncias");
    }

    @Entao("o sistema deve retornar um erro")
    public void sistemaRetornaErro() {
        Assert.assertEquals(400, response.getStatusCode());
    }

    // Teste para obter registros.
    @Dado("que há registros de denúncias no sistema")
    public void sistemaTemDenuncias() {
        // Supondo que já existam denúncias registradas na API
    }

    @Quando("o usuário faz uma requisição para buscar denúncias")
    public void usuarioBuscaDenuncias() {
        response = RestAssured.get("http://localhost:8080/denuncias");
    }

    @Entao("o sistema deve retornar uma lista contendo os registros disponíveis")
    public void sistemaRetornaLista() {
        Assert.assertEquals(200, response.getStatusCode());
        Assert.assertTrue(response.getBody().asString().contains("Árvore caída"));
    }

}