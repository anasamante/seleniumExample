import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class seleniumExample {
    public static void main(String[] args){
        WebDriver webDriver;

        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.addArguments("start-maximized");

        webDriver = new ChromeDriver(chromeOptions);

        webDriver.navigate().to("https://www.google.com");

        webDriver.quit();


    }
}
