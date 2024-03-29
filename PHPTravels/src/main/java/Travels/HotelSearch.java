package Travels;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class HotelSearch extends LaunchBrowser {

	By clickHotelSearch= By.xpath("//span[contains(text(),'Search by Hotel or City Name')]");
	By hotelsearchTextField= By.xpath("//div[@id='s2id_location']//a[@class='select2-choice select2-default']");
	By check_in= By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']");
	By guests= By.xpath("//input[@id='htravellersInput']");
	By adults= By.xpath("//input[@id='hadultInput']");
	By child= By.xpath("//input[@id='hchildInput']");
	By search= By.xpath("//button[@class='btn btn-lg btn-block btn-primary pfb0 loader']");
	
	
	public WebElement searchButton() {
		driver.findElement(clickHotelSearch).click();
		return driver.findElement(hotelsearchTextField);
	}
	
	public WebElement checkIn() {
		return driver.findElement(check_in);
	}
	
	public WebElement guests() {
		return driver.findElement(guests);
	}
	
	public WebElement adults(){
		return driver.findElement(adults);
	}
	
	public WebElement child() {
		return driver.findElement(child);
	}
	
	public WebElement hotelSearchButton(){
		return driver.findElement(search);
	}
	
	

}
