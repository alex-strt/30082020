package pages.productPage;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class Compare {

   SelenideElement compareFirstItem = $(byXpath("//*[@class='compare-button']"));
   public SelenideElement getCompareFirstItem(){
       return compareFirstItem;
   }

    SelenideElement compareSecondItem = $(byXpath("//*[@class='compare-button']"));
    public SelenideElement getCompareSecondItem(){
        return compareSecondItem;
    }

    SelenideElement compareBothItems = $(byXpath("//*[@class='header-actions__button header-actions__button_type_compare header-actions__button_state_active']"));
    public SelenideElement getCompareBothItems(){
        return compareBothItems;
    }

    SelenideElement compareBothItemsVisual = $(byXpath("//*[@class='comparison-modal__link']"));
    public SelenideElement getCompareBothItemsVisual(){
        return compareBothItemsVisual;
    }

    SelenideElement compareBothItemsNewPage = $(byText("Сравниваем планшеты"));
    public SelenideElement getcCompareBothItemsNewPage(){
        return compareBothItemsNewPage;
    }

}


