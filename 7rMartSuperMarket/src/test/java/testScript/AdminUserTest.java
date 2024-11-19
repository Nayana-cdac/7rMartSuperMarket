package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUserTest extends Base {

	AdminUserPage adminUser;
	@Test
	public void verifyUserIsAbletoGotoAdminPage() throws IOException {
		String username= ExcelUtility.readStringData(1, 0, "loginpage");
	 	System.out.println(username);
	 	String password = ExcelUtility.readStringData(1, 1,"loginpage");
	 	LoginPage loginpage = new LoginPage(driver); 
	 	loginpage.enterUserNamefield(username); 
	 	loginpage.enterPasswordfield(password);
	 	HomePage homepage = new HomePage(driver);
	 	homepage=loginpage.clickOnsigninbutton();
	 	adminUser = homepage.adminUserClick();
	 	adminUser.manageUserClick();
	 	adminUser.newButtonClick();
	 	adminUser.addUserName();
	}
}
 