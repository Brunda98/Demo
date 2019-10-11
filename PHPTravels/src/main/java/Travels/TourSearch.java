package Travels;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class TourSearch extends LaunchBrowser{
	
	By search_click= By.xpath("//span[contains(text(),'Search by Listing or City Name')]");
	By select_city= By.xpath("//div[@id='s2id_autogen3']//a[@class='select2-choice select2-default']");
	By date= By.xpath("//div[@id='tchkin']//input[@placeholder='Check in']");
	By guests= By.xpath("//select[@id='adults']");
	By search= By.xpath("//div[@class='col-md-2 form-group go-right col-xs-12 search-button']//button[@class='btn-primary btn btn-lg btn-block pfb0 loader'][contains(text(),'Search')]");
	
	public WebElement city() {
		return driver.findElement(search_click);
	}
	
	WebElement selectCity() {
		return driver.findElement(select_city);
	}
	
	public WebElement tourDate() {
		return driver.findElement(date);
	}
	
	WebElement guest() {
		return driver.findElement(guests);
	}
	
	public WebElement searchButton() {
		return driver.findElement(search);
	}
}
