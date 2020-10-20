package pages.homepage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePageReturn {

    SelenideElement homePageReturn = $(By.xpath("//img[@alt='Интернет магазин Rozetka.ua - №1']"));

    public SelenideElement getHomePageReturn() {
        return homePageReturn;
    }
}
