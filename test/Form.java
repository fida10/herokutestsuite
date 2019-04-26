import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/fida10/selenium/drivers/chrome/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage = new FormPage();
        formPage.submitForm(driver);

        WaitSubmitBanner wait = new WaitSubmitBanner();
        wait.waitForSubmitBanner(driver);

        assertEquals("The form was successfully submitted!", wait.getSubmitBannerText(driver));

        driver.quit();
    }
}