package sfsdfsdfsd;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OurFirstSeleniumTest {
    private FirefoxDriver driver;
    private HomePage homePage;
    private SearchResultPage searchResultPage;

    @Before
    public void precondition(){
        driver = new FirefoxDriver();
        homePage = new HomePage(driver);
        searchResultPage = new SearchResultPage(driver);
    }

    @Test
    public void ourFirstTest() throws InterruptedException {
        homePage.openHomePage()
                .enterSearchText("lightsaber")
                .clickSearchButton();
        searchResultPage.switchToBuyItNow()
                .openSomeItem();


        //buy it now
        driver.findElement(By.id("binBtn_btn")).click();
        //assert login
        Assert.assertTrue(driver.findElement(By.id("sgnBt")).isDisplayed());
    }

    @After
    public void postcondition(){
        driver.quit();
    }
}
