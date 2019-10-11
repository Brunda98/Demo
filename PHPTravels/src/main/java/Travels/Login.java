package Travels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends LaunchBrowser {
	By loginEmail=By.xpath("//input[@placeholder='Email']");
	By loginPass=By.xpath("//input[@placeholder='Password']");
	By loginSubmit=By.xpath("//button[@class='btn btn-action btn-lg btn-block loginbtn']");
	By cookies=By.xpath("//button[@id='cookyGotItBtn']");
	public WebElement loginEmail() {
		return driver.findElement(loginEmail);
	}
	

	public WebElement loginPass() {
		return driver.findElement(loginPass);
	}
	
	public WebElement loginsubmit() {
		return driver.findElement(loginSubmit);
	}
	
	
	  public void loginSubmit() throws InterruptedException{
			
		  driver.findElement(cookies).click();
			driver.findElement(loginSubmit).click();
		}
		
	
	
	

}
