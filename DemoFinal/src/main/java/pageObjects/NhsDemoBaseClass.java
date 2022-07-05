package pageObjects;

import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NhsDemoBaseClass {

		 public static WebDriver driver;
		 public static WebDriverWait wait;

		 
		 
		public void setUp() {
			 
			
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver","DemoFinal/Drivers/chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS); 
			
			 try {
				    driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
				    System.out.println("URL launched Successfully");
					Thread.sleep(1000);
				  } catch (Exception e) {
					e.printStackTrace();
					System.out.println("URL launched Fails:"+e);
				}
			 
		 }
	

}
