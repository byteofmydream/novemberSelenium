package sfsdfsdfsd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage extends AbstractPO{



    private final By buyItNowSwitcher = By.cssSelector("[title=\"Buy It Now\"]");
    private final By someItem = By.cssSelector("h3.lvtitle>a");

    public SearchResultPage(WebDriver driver){
        super(driver);
    }

    public SearchResultPage switchToBuyItNow(){
        driver.findElement(buyItNowSwitcher).click();

        return this;
    }

    public void waitForMenu(String menuName) {
//        WebDriverWait wait = new WebDriverWait(driver,30);
//        wait.until(
//                ExpectedConditions.visibilityOfElementLocated(By.id(item)));
    }

    public SearchResultPage openSomeItem(){
        driver.findElement(someItem).click();
        return this;
    }
}
