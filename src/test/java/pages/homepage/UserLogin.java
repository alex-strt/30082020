package pages.homepage;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;


public class UserLogin {


    public void login() {
        $(byXpath("//*[@class='header-topline'] //*[contains(text(),'войдите в личный кабинет')]")).pressEnter();
        $(byId("auth_email")).setValue("alfabravo1233@gmail.com");
        $(byId("auth_pass")).setValue("TEST123test").pressEnter();
    }

    SelenideElement selectUserNameOnTheTopBar = $(byXpath("//a[@class='header-topline__user-link link-dashed']"));

    public SelenideElement getSelectUserNameOnTheTopBar() {

        return selectUserNameOnTheTopBar;
    }

    SelenideElement exitUserNameOnTheTopBar = $(byXpath("//a[contains(.,'Выход')]"));

    public SelenideElement getExitUserNameOnTheTopBar() {

        return exitUserNameOnTheTopBar;
    }

}
