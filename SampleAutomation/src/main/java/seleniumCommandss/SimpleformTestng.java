package seleniumCommandss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleformTestng {
	
	WebDriver driver;
	@BeforeClass
	public void startup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void launchsite()
	{
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	}

	
	@Test
	public void verifyTitle()
	{
		String title=driver.getTitle();
		Assert.assertEquals(title,"Obsqura Testing","Failure Title");
		//String url=driver.getCurrentUrl();
		//Assert.assertEquals(url,"https://selenium.obsqurazone.com/simple-form-demo.php","Failed URL");
			
	}
	
	
	}
		
	/*WebElement msg=driver.findElement(By.id("single-input-field"));
	msg.sendKeys(" Calculation is Performed");
	WebElement shmsg=driver.findElement(By.id("button-one"));
	shmsg.click();
	
	WebElement valA=driver.findElement(By.id("value-a"));
	valA.sendKeys("10");		
	WebElement valB=driver.findElement(By.id("value-b"));
	valB.sendKeys("20");
	WebElement tot=driver.findElement(By.id("button-two"));
	tot.click();*/

