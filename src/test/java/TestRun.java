
import com.codeborne.selenide.Condition;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.homepage.SearchFor;
import pages.productPage.Compare;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.*;

public class TestRun {

    private final String baseURL = "https://rozetka.com.ua/";

    SearchFor searchFor = new SearchFor();
    Compare compare = new Compare();

    WebDriver driver;


    @BeforeMethod
    public void beforeMethod() {
        driver();
    }


    @Test
    public void compareItems() {

        open(baseURL);
        searchFor.getSearchInput().val("планшеты").pressEnter();
        compare.getCompareFirstItem().click();
        compare.getCompareSecondItem().click();
        compare.getCompareBothItems().click();
        compare.getCompareBothItemsVisual().click();
        compare.getcCompareBothItemsNewPage().waitUntil(Condition.appear, 3000);

    }

    @AfterClass
    public void close() {
        closeWebDriver();
    }
}
