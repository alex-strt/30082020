import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.cart.Cart;
import pages.cart.CartCloseUp;
import pages.configuration.TestConfiguration;
import pages.homepage.PopUpKiller;
import pages.homepage.Registration;
import pages.homepage.SearchFor;
import pages.homepage.UserLogin;
import pages.productPage.AddItem;

import static com.codeborne.selenide.Condition.visible;


public class TestRunOne extends TestConfiguration {

    SearchFor searchFor = new SearchFor();
    AddItem addItem = new AddItem();
    Registration registration = new Registration();
    UserLogin userLogin = new UserLogin();
    Cart cart = new Cart();
    PopUpKiller popUpKiller = new PopUpKiller();
    CartCloseUp cartCloseUp = new CartCloseUp();


        /*
        new registration
         */
//    @Test
//    public void registration() {

//        registration.getEnterPersonalCabinet().click();
//        registration.getRegistration().click();
//        registration.getSurname().val("Смит");
//        registration.getName().val("Джон");
//        registration.getUsername().val("alfabravo1233@gmail.com");
//        registration.getPassword().val("TEST123test").pressEnter();
//    }

    @Test
    public void compareItems() {
        searchFor.getSearchInput().val("планшеты").pressEnter();

        popUpKiller.getQuestionPopup().shouldBe(visible);
        popUpKiller.getQuestionPopupClose().click();

        addItem.getAddFirstItem().click();
        addItem.getAddFirstItem().getAttribute("class").contains("active");
        cart.getSelectActiveCart().click();
        cart.getPlusOneAction().click();
        cart.getPlusOneAction().click();
        cart.getMinusOneAction().click();
        cart.getDeleteFromCart().click();
        cart.getConfirmDeleteFromCart().click();
        cartCloseUp.getCloseCartModalWindow().click();

    }
    @BeforeClass
    public void startSession() {
        userLogin.login();
    }

    @AfterClass
    public void stopSession() {
        userLogin.getSelectUserNameOnTheTopBar().shouldBe(visible).hover();
        userLogin.getExitUserNameOnTheTopBar().click();
    }

}
