package pages.productPage;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class AddItem {

    SelenideElement addFirstItem = $(byXpath("//*[@class='buy-button goods-tile__buy-button']"));
    public SelenideElement getAddFirstItem(){

        return addFirstItem;
    }

}
