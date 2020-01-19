import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class SeleniumTest {

    public static void main(String[] args){

        /*TODO: implement base test and move this code*/
        WebDriver driver;
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://www.google.com");
        String searchPattern = "CNN";

        /*TODO: implement base page generic methods there*/
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.enterSearchText(searchPattern);
        googleSearchPage.clickSearchButton();
        googleSearchPage.isMatchFound(searchPattern);
        Assert.assertTrue(googleSearchPage.isMatchFound(searchPattern));


        driver.quit();

    }

}
