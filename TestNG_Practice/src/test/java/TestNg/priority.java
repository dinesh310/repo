package TestNg;

import org.testng.annotations.Test;

public class priority {
  
	@Test(priority=4)
  public void a() {
  }
	@Test(priority=6)
	  public void b() {
	  }
	@Test
	  public void c() {
	  }
	@Test(priority=3)
	  public void d() {
	  }
}
