package pages.homepage;

import static com.codeborne.selenide.Selenide.$;

public class SearchFor {


    public void search(String text){
        $("[name='search']").val(text).pressEnter();

    }

}

