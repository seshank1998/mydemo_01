package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest_03 {
	WebDriver driver;
	
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.w3schools.com/Js/tryit.asp?filename=tryjs_alert");
	  driver.manage().window().maximize();
	  driver.switchTo().frame(driver.findElement(By.name("iframeResult")));
	  driver.findElement(By.xpath("//button[text()='Try it']")).click();
	  String S = driver.switchTo().alert().getText();
	  System.out.println(S);
	  driver.switchTo().alert().accept();
	  driver.switchTo().defaultContent();
	  System.out.println(driver.findElement(By.xpath("//span[text()='JavaScript Alert']")).getText());
	  driver.close();
	  
	  
 
}
}
