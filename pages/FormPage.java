import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {
	public static void submitForm(WebDriver driver){

		driver.findElement(By.id("first-name")).sendKeys("L");
		driver.findElement(By.id("last-name")).sendKeys("Fenix");
		driver.findElement(By.id("job-title")).sendKeys("Dev + QA analyst");

		driver.findElement(By.id("radio-button-1")).click();
		driver.findElement(By.id("checkbox-1")).click();

		driver.findElement(By.id("select-menu"));
		driver.findElement(By.cssSelector("option[value='1']")).click();

		driver.findElement(By.id("datepicker")).sendKeys("04/20/2020");
		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
	}
}
