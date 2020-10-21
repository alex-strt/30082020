import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.cart.Cart;
import pages.cart.CartCheck;
import pages.configuration.TestConfiguration;
import pages.homepage.HomePageReturn;
import pages.homepage.SearchFor;
import pages.homepage.UserLogin;

import static com.codeborne.selenide.Condition.visible;


public class TestRunTwo extends TestConfiguration {

    UserLogin userLogin = new UserLogin();
    SearchFor searchFor = new SearchFor();
    CartCheck cartCheck = new CartCheck();
    HomePageReturn homePageReturn = new HomePageReturn();
    Cart cart = new Cart();


    @DataProvider
    public Object[][] searchDifferentValues() {
        return new Object[][]{
                {"планшет"},
                {"смартфон"},
                {"фен"},
                {"телевизор"},
                {"ноутбук"},
                {"часы"},
                {"тостер"},
                {"клавиатура"},
                {"наушники"},
                {"монитор"},
        };
    }


    @Test(dataProvider = "searchDifferentValues")
    public void testMethode(String item) {
        cartCheck.getCartCheck().click();
        if (cartCheck.getEmptyCart().isDisplayed()) {
            cartCheck.getCartModalClose().click();

        } else {
            cart.getSelectFilledCart().click();
            cart.getConfirmDeleteFromCart().click();
            cartCheck.getCartModalClose().click();
        }
        homePageReturn.getHomePageReturn().click();
        searchFor.getSearchInput().val(item).shouldBe(visible).click();
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


