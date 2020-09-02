
import org.testng.annotations.Test;
import pages.homepage.SearchFor;
import pages.productPage.Compare;

import static com.codeborne.selenide.Selenide.open;

public class TestRun {

    SearchFor searchFor = new SearchFor();
    Compare compare = new Compare();

    @Test
    public void compareItems() throws InterruptedException {

        open("https://rozetka.com.ua/");
        Thread.sleep(500);
        searchFor.search("планшеты");
        compare.compareFirstItem();
        Thread.sleep(500);
        compare.compareSecondItem();
        compare.compareBothItems();
        Thread.sleep(2000);
        compare.compareBothItemsVisual();
        Thread.sleep(2000);


    }

 }
