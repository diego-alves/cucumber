package foo.module;

import com.google.inject.AbstractModule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by diegoalves on 24/02/16.
 */
public class CucumberModule extends AbstractModule {

    @Override
    protected void configure() {
        //bind(WebDriver.class).toInstance(new ChromeDriver());
    }
}
