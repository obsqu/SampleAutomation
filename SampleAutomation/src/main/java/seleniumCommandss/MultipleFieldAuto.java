package seleniumCommandss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFieldAuto {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/DELL/Desktop/seleniumHtml/samplehtml.html");
		
		List<WebElement> textbox=driver.findElements(By.id("1"));
		for(WebElement temp:textbox)
		{
			temp.sendKeys("HAi");
		}
		
		List<WebElement> radiobtn=driver.findElements(By.id("2"));
		for(WebElement temp:radiobtn)
		{
			temp.click();
		}

	}

}
