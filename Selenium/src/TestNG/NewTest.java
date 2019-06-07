package TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void sample() {
	  System.out.println("This is sample");
  }
  @BeforeTest
  public void beforeMethod() {
	  System.out.println("*****Programe Starts*****");
  }
  @Test(priority = 1)
  public void c_test() {
	  System.out.println("THis is C test");
  }
  @Test(priority = 3)
  public void a_test(){
	  System.out.println("THis is A test");
  }
  @Test(priority = 2)
  public void b_test(){
	  System.out.println("THis is B test");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("*****Programe Ends*****");
  }

}
