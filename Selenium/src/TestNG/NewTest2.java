package TestNG;

import org.testng.annotations.Test;

public class NewTest2 {
  @Test(priority = 1)
  //this priority will be set as 1 
  //priority will start from 1
  
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
}
