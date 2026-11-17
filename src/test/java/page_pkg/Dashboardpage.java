package page_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Dashboardpage {
	WebDriver driver;
	Select obj;
	Select obj1;
	

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a")WebElement dashboard;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")WebElement adminMenu;
    
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")WebElement username;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")WebElement userrole;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")WebElement profile;


    public Dashboardpage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public void VerifyDashboardmthd() 
    {

    	dashboard.isDisplayed();
    }

    public void clickAdmin() {

        adminMenu.click();
    }

    public void details() {
    	
    	username.sendKeys("sreya");

    	userrole.click();
    	
    	obj=new Select(userrole);
    	obj.selectByVisibleText("Admin");
    	
    	
    }	
    	
     public void logout() 
     {
    	 
    	   obj1=new Select(profile);
    	   obj.selectByVisibleText("Logout");
     }
    
    

}
