package week8.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	
	public RemoteWebDriver driver; // declare RemoteWebDriver which is parent to all driver
	// pass browser in @Parameters and give the value in xml file
	// can use either switch or if for checking condition
	
	 
	 @Parameters({"browser","url","username","password"})
	 @BeforeMethod
	public void precondition(String browser,String url,String uname, String pwd) {
		 
		 if(browser.equalsIgnoreCase("chrome"))
			 driver=new ChromeDriver();
		 else if (browser.equalsIgnoreCase("edge"))
			 driver=new EdgeDriver();
		 else if(browser.equalsIgnoreCase("internet Explorer"))
			 driver=new InternetExplorerDriver();
		 
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("username")).sendKeys(uname);
			driver.findElement(By.id("password")).sendKeys(pwd);
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();

	}
	@AfterMethod
	public void postcondition() {
		
    driver.close();
	}

}
