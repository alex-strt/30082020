package pages.homepage;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;


public class UserLogin {


    SelenideElement selectPersonalAccount = $(byXpath("//*[@class='header-topline'] //*[contains(text(),'войдите в личный кабинет')]"));

    public SelenideElement getSelectPersonalAccount() {

        return selectPersonalAccount;
    }

    SelenideElement loginInput = $(byXpath("//input[@type='email']"));

    public SelenideElement getLoginInput() {

        return loginInput;
    }

    SelenideElement passwordInput = $(byXpath("//input[@type='password']"));

    public SelenideElement getPasswordInput() {

        return passwordInput;
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
