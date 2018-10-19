package seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxinvoke {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.gecko.driver", "E://Surya//selenium//geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mychoiceukb2b.wavecrest.in/v3/tpl/b2bindex.html");
		driver.manage().window().maximize();
		
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//System.out.println( driver.getPageSource());
	
		driver.findElement(By.id("inputEmail3")).sendKeys("stgmychukinactivebp@yopmail.com");
		driver.findElement(By.id("inputPassword3")).sendKeys("Test@123");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(" //*[@id='logindiv']/form/div[3]/button")).click();
		
		
	
	
	}

}

