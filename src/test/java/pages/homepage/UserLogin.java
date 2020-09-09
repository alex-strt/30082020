package pages.homepage;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class UserLogin {


    public  void login(){
        $(byXpath("//*[@class='header-topline'] //*[contains(text(),'войдите в личный кабинет')]")).pressEnter();
        $(byId("auth_email")).setValue("alfabravo1233@gmail.com");
        $(byId("auth_pass")).setValue("TEST123test").pressEnter();
    }
}
