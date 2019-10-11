package Test;
import org.testng.annotations.Test;
import Travels.HomePage;
import Travels.Registration;
public class M1_TC1_Reg extends HomePage {
	
	
	@Test
	public static void userRegistration() throws Exception  {
		HomePage h=new HomePage();
		h.Launch();
		h.signupOption();
		
		Registration r = new Registration();
		r.firstname().sendKeys(h.prop.getProperty("firstname"));
		r.lastname().sendKeys(h.prop.getProperty("lastname"));
		r.mobile().sendKeys(h.prop.getProperty("mobile"));
		r.email().sendKeys(h.prop.getProperty("email"));
		r.password().sendKeys(h.prop.getProperty("password"));
		r.confirmpassword().sendKeys(h.prop.getProperty("confirmpassword"));
		r.Regsubmit();
		
	}

}
