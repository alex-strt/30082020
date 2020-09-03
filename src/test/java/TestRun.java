
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import pages.homepage.SearchFor;
import pages.productPage.Compare;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.disappears;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestRun {

    SearchFor searchFor = new SearchFor();
    Compare compare = new Compare();

    @Test
    public void compareItems(){

        open("https://rozetka.com.ua/");
        searchFor.search("планшеты");
        compare.compareFirstItem();
        itemSelectionVisualisation();
        compare.compareSecondItem();
        itemSelectionVisualisation();
        compare.compareBothItems();

        compare.compareBothItemsVisual();
        waitUntilPagesIsLoaded();
    }

    protected static void itemSelectionVisualisation(){
        $(byXpath("//*[@class='compare-button']")).waitUntil(appear, 600);
    }

    protected static void waitUntilPagesIsLoaded() {
        $(byText("Сравниваем планшеты")).waitUntil(disappears, 1000);
    }

 }
