package pages.configuration;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.driver;

public class TestConfiguration {

    private final String baseURL = "https://rozetka.com.ua/";

    @BeforeSuite
    public void beforeMethod() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
        open(baseURL);
    }

    @AfterSuite
    public void tearDown() {
        driver().close();
    }


}
