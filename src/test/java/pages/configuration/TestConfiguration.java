package pages.configuration;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.*;

public class TestConfiguration {

    private final String baseURL = "https://rozetka.com.ua/";

    @BeforeMethod
    public void beforeMethod() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
        open(baseURL);
    }

   @AfterClass
    public void tearDown() {
        driver().close();
    }

    @AfterSuite
    public void cleanUP(){
        getSelenideDriver().clearCookies();
    }

}
