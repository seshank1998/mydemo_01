package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("gundu123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("gundu123");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		
		driver.close();
		driver.quit();

	}

}
