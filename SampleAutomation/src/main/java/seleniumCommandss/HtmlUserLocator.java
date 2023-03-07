package seleniumCommandss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlUserLocator {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/example4me/htmlwrk/sample.html");
		System.out.println("Web driver");
		/*WebElement name=driver.findElement(By.id("1"));
		name.sendKeys("Shibina");
		WebElement male=driver.findElement(By.id("2"));
		male.click();
		WebElement female=driver.findElement(By.id("3"));
		female.click();
		WebElement agree=driver.findElement(By.id("4"));
		agree.click();
		WebElement butn=driver.findElement(By.id("5"));
		butn.click();*/
		
		/*WebElement name=driver.findElement(By.name("nm"));
		name.sendKeys("Miraj");
		WebElement male=driver.findElement(By.name("ml"));
		male.click();
		WebElement female=driver.findElement(By.name("fl"));
		female.click();
		WebElement agree=driver.findElement(By.name("ag"));
		agree.click();
		WebElement butn=driver.findElement(By.name("btn"));
		butn.click();*/
		
		/*WebElement name=driver.findElement(By.className("nmcl"));
		name.sendKeys("Naseera");
		WebElement male=driver.findElement(By.className("mlcl"));
		male.click();
		WebElement female=driver.findElement(By.className("flcl"));
		female.click();
		WebElement agree=driver.findElement(By.className("agcl"));
		agree.click();
		WebElement butn=driver.findElement(By.className("btncl"));
		butn.click();
		
		//WebElement link=driver.findElement(By.linkText("Link to facebook"));
		link.click();
		WebElement link=driver.findElement(By.partialLinkText("facebook"));
		link.click();*/
		
		//WebElement link=driver.findElement(By.tagName("facebook"));
		//link.click();
		
		/*WebElement name=driver.findElement(By.xpath("//input[@id='1']"));
		name.sendKeys("Shibi");
		WebElement male=driver.findElement(By.xpath("//input[@name='ml']"));
	    male.click();
	    WebElement female=driver.findElement(By.xpath("//input[@class='flcl']"));
		female.click();*/
		
	 WebElement name=driver.findElement(By.cssSelector("input[id='1']"));
	 name.sendKeys("Miru");
	 WebElement male=driver.findElement(By.cssSelector("input[name='ml']"));
	 male.click();
	 WebElement female=driver.findElement(By.cssSelector("input[class='flcl']"));
	 female.click();
		
		
		
		

	}

}
