package Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import Travels.FlightSearch;
import Travels.HomePage;


public class flightsearch_Testcase {
	
	static By month= By.xpath("//div[16]//div[1]//tr[1]//th[2]");
	static By next=By.xpath("//div[16]//div[1]//tr[1]//th[3]");
	
	
	@Test
	public static void flightSearch() throws Exception{
		
		
		HomePage h1= new HomePage();
		h1.Launch();
		h1.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		h1.flights();
		
		FlightSearch f1= new FlightSearch();
		f1.fromClick().click();
		f1.from().sendKeys(h1.prop.getProperty("from_location"));
		h1.driver.findElement(By.xpath("//span[@class='select2-match'][contains(text(),'"+h1.prop.getProperty("from_location")+"')]")).click();
		f1.toClick().click();
		f1.to().sendKeys(h1.prop.getProperty("to_city"));
		h1.driver.findElement(By.xpath("//span[@class='select2-match'][contains(text(),'"+h1.prop.getProperty("to_city")+"')]")).click();
		f1.departureDate().click();
		
		String str = h1.driver.findElement(month).getText();
		
		while(!str.equalsIgnoreCase(h1.prop.getProperty("departure_month_year"))) {
			h1.driver.findElement(next).click();
			str= h1.driver.findElement(month).getText();
		}
		
		checkInDate(h1.prop.getProperty("departure_date"));
		
		f1.guestClick().click();
		f1.adults().click();
		f1.adults().sendKeys(h1.prop.getProperty("f_adults"));
		int aval = Integer.parseInt(h1.prop.getProperty("f_adults"));
		h1.driver.findElement(By.xpath("//select[@id='madult']//option[@value='"+aval+"']")).click();
		
		f1.child().click();
		f1.child().sendKeys(h1.prop.getProperty("f_child"));
		int cval = Integer.parseInt(h1.prop.getProperty("f_child"));
		h1.driver.findElement(By.xpath("//select[@id='mchildren']//option[@value='"+cval+"']")).click();
		
		f1.infantb().click();
		f1.infantb().sendKeys(h1.prop.getProperty("f_infant"));
		int ival= Integer.parseInt(h1.prop.getProperty("f_infant"));
		h1.driver.findElement(By.xpath("//select[@id='minfant']//option[@value='"+ival+"']")).click();
		f1.done().click();
		Thread.sleep(1000);
		
		f1.searchButton().click();
	}

	public static void checkInDate(String date){
		
		String d;
		HomePage h1= new HomePage();
		for(int i=1; i<=6;i++){
			for(int j=1; j<=7; j++){
				 d = h1.driver.findElement(By.xpath("//div[16]//tr["+i+"]//td["+j+"]")).getText();
				 if(d.equals("1")) {
					 for(int k=i; k<6; k++) {
						 for(int l=j; l<7; l++) {
							 d = h1.driver.findElement(By.xpath("//div[16]//tr["+k+"]//td["+l+"]")).getText();
							 if(d.equals(date))
									h1.driver.findElement(By.xpath("//div[16]//tr["+k+"]//td["+l+"]")).click();
						 }
					 }
			}
		}
	}
	}	

}
	
	

