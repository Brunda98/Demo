package Travels;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Registration extends LaunchBrowser{
		By submit=By.xpath("//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']");
		By cookies=By.xpath("//button[@id='cookyGotItBtn']");
		By firstname = By.xpath("/html[1]/body[1]/div[6]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[3]/input[1]");
		By lastname=By.xpath("/html[1]/body[1]/div[6]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[4]/input[1]");
		By mobile=By.xpath("/html[1]/body[1]/div[6]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[5]/input[1]");
		By email=By.xpath("/html[1]/body[1]/div[6]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[6]/input[1]");
		By password=By.xpath("/html[1]/body[1]/div[6]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[7]/input[1]");
		By confirmpassword=By.xpath("/html[1]/body[1]/div[6]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[8]/input[1]");
		
	
	    public WebElement firstname() {
		    return driver.findElement(firstname);
	    }
	    public WebElement lastname() {
			return driver.findElement(lastname);
		}
		public WebElement mobile() {
			return driver.findElement(mobile);
		}
		public WebElement email() {
			return driver.findElement(email);
		}
		public WebElement password() {
			return driver.findElement(password);
		}
		public WebElement confirmpassword() {
			return driver.findElement(confirmpassword);
		}
	    public void Regsubmit() throws InterruptedException{
			
			driver.findElement(cookies).click();
			driver.findElement(submit).click();
		}
		
}
