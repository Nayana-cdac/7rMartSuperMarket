package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver; 
	 
 	public  HomePage(WebDriver driver) { 
 		 
 		this.driver = driver; 
 		PageFactory.initElements(driver,this); 
}
 	@FindBy(xpath ="//a[@data-toggle='dropdown']") WebElement admin;
 	@FindBy(xpath ="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']") WebElement logout;
 	//@FindBy(xpath ="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']") WebElement adminUser;//will not work
 	@FindBy(xpath ="//i[@class='nav-icon fas fa-users']") WebElement adminUser;
 	public void adminClick() { //if need to go to adminuser the change void to HomePage and return new HomePage(driver)
 		admin.click();
 	}
 	public AdminUserPage adminUserClick() {
 		adminUser.click();
		return new AdminUserPage(driver);
 	}
 	public void logoutClick() {
 		logout.click();
 	}
 	
}
