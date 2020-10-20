package pages.cart;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartCheck {

    SelenideElement cartCheck = $(By.xpath("//*[contains(@class,'header-actions__button_type_basket')]"));

    public SelenideElement getCartCheck() {

        return cartCheck;
    }

    SelenideElement cartModalClose = $(By.cssSelector("button.modal__close"));

    public SelenideElement getCartModalClose() {

        return cartModalClose;
    }


}

