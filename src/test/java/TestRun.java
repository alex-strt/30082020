
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import pages.cart.Cart;
import pages.cart.CartCloseUp;
import pages.configuration.TestConfiguration;
import pages.homepage.Registration;
import pages.homepage.SearchFor;
import pages.homepage.UserLogin;
import pages.productPage.AddItem;


public class TestRun extends TestConfiguration {

    SearchFor searchFor = new SearchFor();
    AddItem addItem = new AddItem();
    Registration registration = new Registration();
    UserLogin userLogin = new UserLogin();
    Cart cart = new Cart();
    CartCloseUp cartCloseUp = new CartCloseUp();


    @Test
    public void compareItems() {

        /*
        new registration
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
        search for item
         */
        searchFor.getSearchInput().val("планшеты").pressEnter();


        /*
        select and add item to shopping cart
        add +1 to cart
        add -1 from cart
         */
        addItem.getAddFirstItem().click();
        addItem.getAddFirstItem().getAttribute("class").contains("active");
        cart.getSelectActiveCart().click();
        cart.getPlusOneAction().click();
        cart.getPlusOneAction().click();
        cart.getMinusOneAction().click();
        cart.getDeleteFromCart().click();
        cart.getConfirmDeleteFromCart().click();

        cartCloseUp.getCloseCartModalWindow().click();
        userLogin.getSelectUserNameOnTheTopBar().should(Condition.appear).hover();
        userLogin.getExitUserNameOnTheTopBar().click();


    }

}
