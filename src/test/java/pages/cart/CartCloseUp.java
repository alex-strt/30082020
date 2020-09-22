package pages.cart;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CartCloseUp {

    SelenideElement closeCartModalWindow = $(byXpath("//button[contains(@class,'modal__close')]"));

    public SelenideElement getCloseCartModalWindow() {

        return closeCartModalWindow;
    }


}
