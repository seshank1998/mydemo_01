package pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Samantha_01 {
	@Test 
	  public void Registration() {
		  System.out.println("code for Registration"); 
	}
	
	@BeforeMethod
  public void Login() {
	  System.out.println("code for login");
	  }

  @AfterMethod
public void Logout() {
	  System.out.println("code for Logout");  
  }
  @BeforeClass
  public void AddtoCart() {
	  System.out.println("code for AddtoCart ");  
  }
  @AfterClass
  public void validate() {
	  System.out.println("code for Validating ");  
  }
     @BeforeTest
     public void mobilenumber() {
	  System.out.println("code for number "); 
  }
  @AfterTest
  public void address() {
	  System.out.println("code for adress "); 
  }
  @BeforeSuite
  public void Suite() {
	  System.out.println("code for Before Suite "); 
  }
  @AfterSuite
  public void Suite1() {
	  System.out.println("code for After Suite "); 
  }
}
