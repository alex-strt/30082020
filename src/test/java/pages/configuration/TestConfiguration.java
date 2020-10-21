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


    private UserLogin userLogin = new UserLogin();

    public UserLogin getUserLogin() {
        return userLogin;
    }


    @BeforeSuite
    public void startSession() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
        open(baseURL);
        getUserLogin().login();
    }

    @AfterSuite
    public void stopSession() {
        getUserLogin().getSelectUserNameOnTheTopBar().shouldBe(visible).hover();
        getUserLogin().getExitUserNameOnTheTopBar().click();
        driver().close();
    }
}
