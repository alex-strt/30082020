package pages.configuration;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.homepage.UserLogin;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.driver;

public class TestConfiguration {

    private final String baseURL = "https://rozetka.com.ua/";
    protected UserLogin userLogin = new UserLogin();

    @BeforeSuite
    public void startSession() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
        open(baseURL);
        userLogin.getSelectPersonalAccount().pressEnter();
        userLogin.getLoginInput().val("alfabravo1233@gmail.com").pressEnter();
        userLogin.getPasswordInput().val("TEST123test").pressEnter();

    }

    @AfterSuite
    public void stopSession() {
        userLogin.getSelectUserNameOnTheTopBar().shouldBe(visible).hover();
        userLogin.getExitUserNameOnTheTopBar().click();
        driver().close();
    }
}
