package com.urbanity.urbanity;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    @Given("que o usuário está na página de login")
    public void usuarioNaPaginaDeLogin() {
        System.out.println("Usuário acessou a página de login.");
    }

    @When("ele insere email e senha válidos")
    public void usuarioInsereCredenciaisValidas() {
        System.out.println("Usuário inseriu email e senha corretos.");
    }

    @Then("ele deve ser redirecionado para a página inicial")
    public void usuarioRedirecionadoParaHome() {
        System.out.println("Usuário foi redirecionado para a página inicial.");
    }
}