package SeleniumTutorial;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
 import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

 import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageLaunch { 
	
	
	
 	@SuppressWarnings("deprecation")
	public void HomePage() {
		
	WebDriverManager.chromedriver().setup();
//	ChromeOptions op = new ChromeOptions();
//  disable notification parameter
//  op.addArguments("--disable-notifications");
	ChromeDriver driver = new ChromeDriver();
	
//	ChromeDriver driver = new ChromeDriver(op);
	
//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://www.saucedemo.com");
//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
    String s = driver.getTitle();
    
  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    
    if (s.equals("Swag Labs"))
    { 
      System.out.println( "Page is loaded successfully" ); 
	}
    else 
    	System.out.println( "Please porivde valid URL" ); 

  
}
}
