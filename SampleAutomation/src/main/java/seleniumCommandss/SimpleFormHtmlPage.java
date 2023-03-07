package seleniumCommandss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleFormHtmlPage {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		WebElement msg=driver.findElement(By.id("single-input-field"));
		msg.sendKeys(" Calculation is Performed");
		WebElement shmsg=driver.findElement(By.id("button-one"));
		shmsg.click();
		
		WebElement valA=driver.findElement(By.id("value-a"));
		valA.sendKeys("10");		
		WebElement valB=driver.findElement(By.id("value-b"));
		valB.sendKeys("20");
		WebElement tot=driver.findElement(By.id("button-two"));
		tot.click();

	}

}
