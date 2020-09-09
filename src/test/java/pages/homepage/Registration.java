package pages.homepage;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class Registration {

    SelenideElement enterPersonalCabinet = $(byXpath("//*[contains(text(),' войдите в личный кабинет ')]"));

    public SelenideElement getEnterPersonalCabinet() {
        return enterPersonalCabinet;
    }

    SelenideElement registration = $(byXpath("//*[contains(text(),' Зарегистрироваться ')]"));

    public SelenideElement getRegistration() {
        return registration;

    }

    SelenideElement surname = $(byXpath("//*[@formcontrolname='surname']"));

    public SelenideElement getSurname() {
        return surname;

    }

    SelenideElement name = $(byXpath("//*[@formcontrolname='name']"));

    public SelenideElement getName() {
        return name;

    }

    SelenideElement username = $(byXpath("//*[@formcontrolname='username']"));

    public SelenideElement getUsername() {
        return username;

    }

    SelenideElement password = $(byXpath("//*[@formcontrolname='password']"));

    public SelenideElement getPassword() {
        return password;

    }

    SelenideElement registerButton = $(byXpath("//button[contains(text(),' Зарегистрироваться ')]"));

    public SelenideElement getRegisterButton() {
        return registerButton;

    }


}
