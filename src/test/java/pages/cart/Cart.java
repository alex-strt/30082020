package pages.cart;

import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class Cart {

    SelenideElement selectActiveCart = $(byXpath("//*[@class='header-actions__button header-actions__button_type_basket header-actions__button_state_active']"));

   public SelenideElement getSelectActiveCart() {

        return selectActiveCart;
    }

    SelenideElement plusOneAction = $(byXpath("//button[contains(@aria-label,'Добавить ещё один товар')]"));
   public SelenideElement getPlusOneAction() {

        return plusOneAction;
    }

}
