package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Casestudy_01 {
	WebDriver driver;
	
	
	
	@Test (priority=2)
	
	  public void openbrowser()
	{
		  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://demowebshop.tricentis.com/login");
		  driver.manage().window().maximize();
		 
		  driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("saikrishna123@gmail.com");
		 driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("saikrishna");
		 driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}
		 
		 @Test	(priority=1)	
		    public void launchGoogle() {	
			 System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
			  driver = new ChromeDriver();
			 driver.manage().window().maximize();
		        driver.get("http://www.google.co.in");						
		    }	
}
	


			
		  
		  
		  
		  
		
		
		        					
		    		
	        
	
	
 
  

  

