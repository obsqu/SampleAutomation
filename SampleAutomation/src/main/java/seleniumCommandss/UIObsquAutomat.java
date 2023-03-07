package seleniumCommandss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UIObsquAutomat {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.uitestpractice.com/Students/Form");
		
		WebElement fstnm=driver.findElement(By.id("firstname"));
		fstnm.sendKeys("Shibina");
		fstnm.clear();
		fstnm.sendKeys("Miraj");
		
		System.out.println("selected  "+fstnm.isSelected());
		
		System.out.println("enabled  "+fstnm.isEnabled());
		
		System.out.println("display  "+fstnm.isDisplayed());
		System.out.println("getText  "+fstnm.getText());
		System.out.println("getTagnm  "+fstnm.getTagName());
		System.out.println("getAttribute  "+fstnm.getAttribute("class"));
		
		System.out.println("getCssvalue  :"+fstnm.getCssValue("color"));
		System.out.println("getSize  :"+fstnm.getSize());
		System.out.println("getLocation  :"+fstnm.getLocation());
		
		WebElement lstnm=driver.findElement(By.xpath("//input[@id='lastname']"));
		lstnm.sendKeys("S N");
		WebElement mard=driver.findElement(By.xpath("(//input[@name='optradio'])[1]"));
		mard.click();
		WebElement sngl=driver.findElement(By.xpath("(//input[@name='optradio'])[2]"));
		sngl.click();
		WebElement divs=driver.findElement(By.xpath("(//input[@name='optradio'])[3]"));
		divs.click();
		
		//WebElement dance=driver.findElement(By.xpath("////input[@name='dance']"));
		//dance.click();
		
		WebElement number=driver.findElement(By.xpath("//input[@id='phonenumber']"));
		number.sendKeys("2389435893");
		
		WebElement usrnm=driver.findElement(By.cssSelector("input[id='username']"));
		usrnm.sendKeys("shibina");
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("shibi@gmail.com");
		
		//WebElement about=driver.findElement(By.cssSelector("input[id='comment']"));
		//about.sendKeys("hai my name is shibi from tvm");
		
		WebElement pwd=driver.findElement(By.xpath("//input[@id='pwd']"));
		pwd.sendKeys("hai hlo");
		
		WebElement submit=driver.findElement(By.xpath("//input[class='btn btn-default ']"));
		submit.click();
		
	


	}

}
