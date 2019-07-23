package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http:10.232.237.143:443/TestMeApp/fetchcat.htm");
		
		List<WebElement> T_links =driver.findElements(By.tagName("a"));
		int Cnt_links=T_links.size();
		System.out.println(Cnt_links);

		 for(int i=0;i<Cnt_links;i++)
		{
		String Links=T_links.get(i).getText();
		System.out.println(Links);
	}

}
}
