package week6;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;



public class BaseClass {

	 public ChromeDriver driver;
	 public String excelFileName;
	 
	 @Parameters({"url","username","password"})
	 @BeforeMethod(alwaysRun=true)
	public void precondition(String url,String uname, String pwd) {
		 	driver  = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("username")).sendKeys(uname);
			driver.findElement(By.id("password")).sendKeys(pwd);
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();

	}
	@AfterMethod(alwaysRun=true)
	public void postcondition() {
		
     driver.close();
	}
	@DataProvider
	public String[][] sendData() throws Exception{
		return ReadExcel.readExcel(excelFileName);
		
	}
	
	
}
