package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edgeinvoke {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.edge.driver", "D://Surya//selenium//MicrosoftWebDriver.exe");
		WebDriver driver1 = new EdgeDriver();
		
		driver1.get("https://mychoiceukb2b.wavecrest.in/v3/tpl/b2bindex.html");	
		
		System.out.println(driver1.getCurrentUrl());
		
		System.out.println(driver1.getTitle());
		
		//System.out.println( driver.getPageSource());
		//driver.close();

	}

}
