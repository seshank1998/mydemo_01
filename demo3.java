package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.Chromedriver;

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("sairoy987654");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("sai");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("roy");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sairoy987654");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Sairoy987654");
		driver.findElement(By.xpath("//input[@name='gender']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("sairoy@gmail.com");
		driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9669969669");
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("24/04/1996");
//        driver.findElement(By.xpath("//input[@name='address']")).sendKeys("hyderavjjdeogjonnasnkd");
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("hydrabad,telangana");
		driver.findElement(By.xpath("//option[@value='411012']")).click();
		
		driver.findElement(By.xpath("//input[@name='answer']")).sendKeys("lucky");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
     
        

}
}
