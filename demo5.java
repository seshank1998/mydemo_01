package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo5 {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		
		driver.findElement(By.cssSelector("input#userName")).sendKeys("Seshank");
		driver.findElement(By.cssSelector("input#password")).sendKeys("seshank");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		
		
	}

}
