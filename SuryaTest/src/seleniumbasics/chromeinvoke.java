package seleniumbasics;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class chromeinvoke {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "E://Surya//selenium//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://mychoiceukb2b.wavecrest.in/v3/tpl/b2bindex.html");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getTitle());
		//System.out.println( driver.getPageSource());
		//driver.close();
		
		

		
		driver.findElement(By.xpath("//*[@id='inputEmail3']")).sendKeys("stgmychukinactivebp@yopmail.com");
		driver.findElement(By.id("inputPassword3")).sendKeys("Test@123");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.className("btn btn-blue2 btnFull ng-binding")).click();
		
		driver.findElement(By.xpath(" //*[@id='logindiv']/form/div[3]/button")).click();
		
		
		//driver.findElement(By.cssSelector("body > div.container1 > ng-include:nth-child(1) > header > div > div.row > div.col-xs-6.col-sm-6.col-md-7.m0p0.logo4 > h2 > img")).
				//("/html/body/div[2]/ng-include[1]/header/div/div[1]/div[2]/h2/img")).
		
	
		
		//driver.findElement(By.linkText("Forgot Password?")).click();
		
		//driver.findElement(By.linkText("Spanish")).click();
	
		
		//driver.findElement(By.xpath("//a[contains(text(), 'Manage Cardholder'[]")).click();

		//driver.findElement(By.xpath(".//a[text()='Manage Cardholder'][@href='#']")).click();
		
		
		
		//driver.findElement(By.cssSelector("body > div.container1 > ng-include:nth-child(1) > header > div > div.row > div.col-xs-6.col-sm-6.col-md-5.m0p0.mart30.col-xs-m0p0 > p > a:nth-child(2)")).click();
		
		//driver.findElement(By.xpath(" //button[@type='button'][@class='btn btn-primary  btn134 ng-binding'][@ng-click='loginSubmit()']")).click();
		// driver.findElement(By.cssSelector("body > div.container1 > ng-include:nth-child(1) > header > div > div.row > div.col-xs-6.col-sm-6.col-md-5.m0p0.mart30.col-xs-m0p0 > p > a:nth-child(2)")).click();
		
		//driver.close();
		
		
	}

}
