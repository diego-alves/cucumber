package foo.steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import org.openqa.selenium.WebDriver;

import javax.inject.Inject;

/**
 * Created by diegoalves on 24/02/16.
 */
public class StepsDefs {

    private WebDriver driver;

    @Inject
    public StepsDefs(WebDriver driver) {
        this.driver = driver;
    }

    @Dado("^que meu nome e Diego$")
    public void queMeuNomeEDiego() throws Throwable {
        driver.get("http://www.google.com.br");
    }

    @Entao("^mostre ola Diego$")
    public void mostreOlaDiego() throws Throwable {

    }



}
