package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classexcersise2 {
	public static void main(String arg[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		WebElement name=driver.findElement(By.xpath("//*[@id=\"input-to-name\"]"));
		name.sendKeys("abc");
		WebElement mail=driver.findElement(By.xpath("//*[@id=\"input-to-email\"]"));
		mail.sendKeys("abc@facebook.com");
		WebElement yourname=driver.findElement(By.xpath("//*[@id=\"input-from-name\"]"));
		yourname.sendKeys("def");
		WebElement yourmail=driver.findElement(By.xpath("//*[@id=\"input-from-email\"]"));
		yourmail.sendKeys("def@facebook.com");																							
		WebElement choice=driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]"));
		choice.click();	
		WebElement us=driver.findElement(By.xpath("//*[@name=\"agree\"]"));
		us.click();	
				
	}
}
		