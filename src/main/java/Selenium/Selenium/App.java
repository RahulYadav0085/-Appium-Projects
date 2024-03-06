package Selenium.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	
    	
    	WebDriverManager.chromedriver().setup();
		 ChromeDriver driver =new ChromeDriver();
		 
		 driver.get("https://dev.linkcxo.com");
		 Thread.sleep(10000);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		
    }
}
