package TestNg;

import org.testng.annotations.*;

public class Testing {

	@Test
	public void a() {
		System.out.println("test 1");
	}

	@BeforeTest
	public void b() {
		System.out.println("execuying before any test");
	}

	@AfterTest
	public void c() {
		System.out.println("executing after all test");
	}

	@BeforeClass
	public void d() {
		System.out.println("executing before first test");
	}

	@AfterClass
	public void e() {
		System.out.println("executing after all test (class)");
	}

	@BeforeMethod
	public void f() {
		System.out.println("executing before each test mthod");
	}

	@AfterMethod
	public void g() {
		System.out.println("executing after each test method");
	}
}
