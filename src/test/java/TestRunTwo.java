import org.testng.Assert;
import org.testng.annotations.*;
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


    //f***g Data-Driven Testing


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
        searchFor.getSearchInput().val(item).shouldBe(visible).click();
        cartCheck.getCartCheck().click();
        cartCheck.getCartModalClose().click();
        homePageReturn.getHomePageReturn().click();

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


