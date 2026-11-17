package base_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import page_pkg.Dashboardpage;
import page_pkg.Loginpage_class;

public class Baseclass {

public static WebDriver driver;
	
	public Loginpage_class loginobj;
	public Dashboardpage dashobj;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void objmthd()
	{
		loginobj=new Loginpage_class(driver);
		dashobj=new Dashboardpage(driver);
	}
}
