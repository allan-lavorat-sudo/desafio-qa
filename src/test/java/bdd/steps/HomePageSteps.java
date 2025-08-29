package bdd.steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import bdd.runners.Hooks;
import io.cucumber.java.Before;
import io.cucumber.java.pt.*;

public class HomePageSteps {

    WebDriver driver;

    @Before
    public void capturarDriver() {
        driver = Hooks.getDriver();
    }

    @Dado("que o usuário acessa o site")
    public void que_o_usuário_acessa_o_site() {
        driver.get("https://demoqa.com");
    }

    @Entao("o título da página deve ser {string}")
    public void o_título_da_página_deve_ser(String tituloEsperado) {
        String tituloAtual = driver.getTitle();
        Assert.assertEquals(tituloAtual, tituloEsperado);
    }
}