package pages.homepage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PopUpKiller {

    SelenideElement questionPopup = $(By.xpath("//*[@id='rz-banner']"));

    public SelenideElement getQuestionPopup() {
        return questionPopup;
    }

    SelenideElement questionPopupClose = $(By.xpath("//*[@id='rz-banner']//*[@class='exponea-close-cross']"));

    public SelenideElement getQuestionPopupClose() {
        return questionPopupClose;
    }
}
