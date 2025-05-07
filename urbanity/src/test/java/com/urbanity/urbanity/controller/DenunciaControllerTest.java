package com.urbanity.urbanity.controller;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DenunciaControllerTest {

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "http://localhost:8080";
    }

    @Test
    @Order(1)
    @DisplayName("Registrar denúncia com sucesso")
    public void testRegistrarDenuncia() {
        Map<String, String> denuncia = new HashMap<>();
        denuncia.put("descricao", "Buraco na rua");
        denuncia.put("localizacao", "Avenida Brasil, 45");

        given()
            .contentType("application/json")
            .body(denuncia)
        .when()
            .post("/denuncias")
        .then()
            .statusCode(200)
            .body(equalTo("Denúncia registrada!"));
    }

    @Test
    @Order(2)
    @DisplayName("Buscar todas as denúncias")
    public void testBuscarDenuncias() {
        given()
        .when()
            .get("/denuncias")
        .then()
            .statusCode(200)
            .body("$", not(empty()));
    }

    @Test
    @Order(3)
    @DisplayName("Verificar status de endpoint")
    public void testEndpointLocal() {
        given()
        .when()
            .get("/denuncias/local")
        .then()
            .statusCode(200)
            .body(equalTo("Staging"));
    }

    @Test
    @Order(4)
    @DisplayName("Erro: Registro de denúncia sem descrição - Erro 400")
    public void testRegistrarDenunciaSemDescricao() {
        Map<String, String> denuncia = new HashMap<>();
        denuncia.put("localizacao", "Rua das Palmeiras, 678");

        given()
            .contentType("application/json")
            .body(denuncia)
        .when()
            .post("/denuncias")
        .then()
            .statusCode(400)
            .body(containsString("Erro 400: Descrição e Localização são obrigatórias"));
    }

    @Test
    @Order(5)
    @DisplayName("Usuário acessa endpoint inválido - Erro 404")
    public void testEndpointInvalido() {
        given()
        .when()
            .get("/denuncias/inexistente")
        .then()
            .statusCode(404);
    }
}