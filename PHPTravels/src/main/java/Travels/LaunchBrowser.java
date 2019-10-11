package Travels;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	
 public static WebDriver driver;
 public static Properties prop = new Properties();
 
 public void Launch() throws Exception {
 FileInputStream fis= new FileInputStream("C:\\Users\\Online Test\\Desktop\\agiledge\\PHPTravels\\src\\main\\java\\prop\\data.properties");
	prop.load(fis);
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Online Test\\Desktop\\selenium jars\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(prop.getProperty("url"));
	

}

}
