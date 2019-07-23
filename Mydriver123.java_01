package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Mydriver123 {
	public static WebDriver getDriver(String browser) {
		if(browser.equals("chrome")) {
			 System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
			 return new ChromeDriver();
			 }
		else if (browser.equals("ie")) {
			 System.setProperty("webdriver.ie.driver","C:\\drivers\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
			 return new InternetExplorerDriver();
		
}
		else
			return null;
	}
	
	
}
