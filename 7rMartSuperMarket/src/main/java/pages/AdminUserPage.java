package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminUserPage {
	WebDriver driver; 
	 
 	public  AdminUserPage(WebDriver driver) { 
 		 
 		this.driver = driver; 
 		PageFactory.initElements(driver,this); 
}
 	@FindBy(xpath ="//p[text()='Manage Users']") WebElement manageUser;
 	@FindBy(xpath ="//a[@onclick='click_button(1)']") WebElement newButton;
 	@FindBy(xpath ="////input[@id='username']") WebElement username;
 	
 	
 	public AdminUserPage manageUserClick() { //if need to go to adminuser the change void to HomePage and return new HomePage(driver)
 		manageUser.click();
		return this;
 	}
 	
 	public AdminUserPage newButtonClick() { //if need to go to adminuser the change void to HomePage and return new HomePage(driver)
 		newButton.click();
		return this;
 	}
 	
 	public AdminUserPage addUserName() { //if need to go to adminuser the change void to HomePage and return new HomePage(driver)
 		username.click();
 		username.sendKeys("Nayana");
		return this;
 	}
 /*	public void logoutClick() {
 		logout.click();
 	}*/
}
