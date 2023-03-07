package seleniumCommandss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HtmlLocatTestng {
	WebDriver driver;
	@BeforeClass
	public void startup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void launchsite()
	{
		driver.get("C:/Users/DELL/Desktop/seleniumHtml/samplehtml.html");
	}
	//@Test(priority=2,enabled=false)
	@Test(priority=2)
	public void testing()
	{
		List<WebElement> textbox=driver.findElements(By.id("1"));
		for(WebElement temp:textbox)
		{
			temp.sendKeys("HAi");
		}
	}
	
	@Test(priority=1)
	public void testing1()
	{
		
		List<WebElement> radiobtn=driver.findElements(By.id("2"));
		for(WebElement temp:radiobtn)
		{
			temp.click();
		}
	}
	
	

}
