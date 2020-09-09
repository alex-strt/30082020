
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.cart.Cart;
import pages.homepage.Registration;
import pages.homepage.SearchFor;
import pages.homepage.UserLogin;
import pages.productPage.AddItem;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.isChrome;


public class TestRun {

    private final String baseURL = "https://rozetka.com.ua/";
    SearchFor searchFor = new SearchFor();
    AddItem addItem = new AddItem();
    Registration registration = new Registration();
    UserLogin userLogin = new UserLogin();
    Cart cart = new Cart();




    @BeforeMethod
    public void beforeMethod() {
        isChrome();
        open(baseURL);
    }


    @Test
    public void compareItems(){

        /*
        new registration
        test == pass
         */

//        registration.getEnterPersonalCabinet().click();
//        registration.getRegistration().click();
//        registration.getSurname().val("Смит");
//        registration.getName().val("Джон");
//        registration.getUsername().val("alfabravo1233@gmail.com");
//        registration.getPassword().val("TEST123test").pressEnter();

        /*
        website login
         */
        userLogin.login();
        /*
        select and add item to shopping cart
        add +1 to cart
        add -1 from cart
         */
        searchFor.getSearchInput().val("планшеты").pressEnter();
        addItem.getAddFirstItem().click();
        cart.getPlusOneAction().click();
        cart.getPlusOneAction().click();
        cart.getMinusOneAction().click();
    }

}
