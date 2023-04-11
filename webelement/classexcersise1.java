package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classexcersise1 {
	public static void main(String arg[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		WebElement firstname=driver.findElement(By.id("input-firstname"));
		firstname.sendKeys("priya");
		WebElement lasttname=driver.findElement(By.id("input-lastname"));
		lasttname.sendKeys("dharshini");
		WebElement email=driver.findElement(By.id("input-email"));
		email.sendKeys("abc@outlook.com");
		WebElement pw=driver.findElement(By.id("input-password"));
		pw.sendKeys("****");
		WebElement yes=driver.findElement(By.id("input-newsletter-yes"));
		yes.click();
		
	}
}
