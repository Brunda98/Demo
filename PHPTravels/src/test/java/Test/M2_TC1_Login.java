package Test;
import Travels.HomePage;
import Travels.Login;
import org.testng.annotations.Test;
public class M2_TC1_Login {
	@Test
	public static void userLogin() throws Exception  {	

	HomePage h=new HomePage();
	h.Launch();
	h.loginOption();
	
	Login l=new Login();
	
	l.loginEmail().sendKeys(h.prop.getProperty("email"));
	l.loginPass().sendKeys(h.prop.getProperty("password"));
	l.loginSubmit();

}
}