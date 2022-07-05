package week2Day2;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSeleniumBasics {
	public static void main(String[] args) {
		
		//Edge Driver Setup	
	
		/*WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");*/

		
		//FireFox Driver Setup
	/*	WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
    */
		
		//Chrome Driver Setup
	 /*   WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
     */
		//Driver.exe method
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	
	/*
		// To Maximize Browser Window
		//Method-1
	/*  Options manage = driver.manage();
		Window window = manage.window();
		window.maximize();
	*/
		
		
		//Method-2
		driver.manage().window().maximize();
		
		
		//To close Browser
		driver.close();
	}
}
