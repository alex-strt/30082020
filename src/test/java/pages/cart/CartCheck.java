package pages.cart;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartCheck{



    SelenideElement cartCheck = $(By.xpath("//*[contains(@class,'header-actions__button_type_basket')]"));

    public SelenideElement getCartCheck() {

        return cartCheck;
    }


    SelenideElement cartModalClose = $(By.xpath("//button[contains(@aria-label,'Закрыть модальное окно')]"));


    public SelenideElement getCartModalClose() {

        return cartModalClose;
    }


    SelenideElement emptyCart = $(By.xpath("//h4[@class='cart-dummy__heading'][contains(.,'Корзина пуста')]"));

    public SelenideElement getEmptyCart() {

        return emptyCart;
    }

}