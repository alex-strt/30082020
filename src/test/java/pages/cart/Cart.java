package pages.cart;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class Cart {

    SelenideElement selectActiveCart = $(byXpath("//*[contains(@class,'header-actions__button_type_basket')]"));

    public SelenideElement getSelectActiveCart() {

        return selectActiveCart;
    }

    SelenideElement plusOneAction = $(byXpath("//button[contains(@aria-label,'Добавить ещё один товар')]"));

    public SelenideElement getPlusOneAction() {

        return plusOneAction;
    }

    SelenideElement minusOneAction = $(byXpath("//button[contains(@aria-label,'Убрать один товар')]"));

    public SelenideElement getMinusOneAction() {

        return minusOneAction;
    }

    SelenideElement deleteFromCart = $(By.xpath("//button[contains(@aria-label,'Удалить товар из корзины')]"));

    public SelenideElement getDeleteFromCart() {
        return deleteFromCart;
    }

    SelenideElement confirmDeleteFromCart = $(By.xpath("//button[contains(.,'Удалить из корзины')]"));

    public SelenideElement getConfirmDeleteFromCart() {
        return confirmDeleteFromCart;
    }

}
