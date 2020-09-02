package pages.productPage;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class Compare {
    public void compareFirstItem(){
        $(byXpath("//*[@class='compare-button']")).click();

 }

    public void compareSecondItem(){
        $(byXpath("//*[@class='compare-button']")).click();

 }

    public void compareBothItems(){
        $(byXpath("//*[@class='header-actions__button header-actions__button_type_compare header-actions__button_state_active']")).click();
//        $(byXpath("//*[@class='header-actions__button header-actions__button_type_compare']")).click();
    }

    public void compareBothItemsVisual(){
        $(byXpath("//*[@class='comparison-modal__link']")).click();
//        $(byXpath("//*[@class='header-actions__button header-actions__button_type_compare']")).click();
    }



}


