package ui;

import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void validarTituloDaPagina() {
        String titulo = driver.getTitle();
        System.out.println("Título da página: " + titulo);
        assert titulo.contains("DEMOQA");
    }
}