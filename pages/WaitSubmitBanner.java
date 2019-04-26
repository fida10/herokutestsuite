import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitSubmitBanner {
	public static void waitForSubmitBanner(WebDriver driver){

		WebDriverWait waitforSubmit = new WebDriverWait(driver, 10);
		waitforSubmit.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
	}
	public static String getSubmitBannerText(WebDriver driver){
		return driver.findElement(By.className("alert")).getText();
	}
}
