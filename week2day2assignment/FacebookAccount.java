package week2day2.assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccount {

	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");
        
        driver.manage().window().maximize();
        
      //implicitly wait
      	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        driver.findElement(By.linkText("Create new account")).click();
        
        driver.findElement(By.name("firstname")).sendKeys("Janaki");
        driver.findElement(By.name("lastname")).sendKeys("Ravi");
        
        driver.findElement(By.name("reg_email__")).sendKeys("7397597078");
        driver.findElement(By.id("password_step_input")).sendKeys("Pragathi@08");
        
        
        WebElement element1 = driver.findElement(By.id("day"));
        
        Select sec1=new Select(element1);
        sec1.selectByIndex(6);
        
        WebElement element2 = driver.findElement(By.id("month"));

        Select sec2=new Select(element2);
        sec2.selectByIndex(10);
        
        
        WebElement element3 = driver.findElement(By.id("year"));

        Select sec3=new Select(element3);
        sec3.selectByVisibleText("1998");
        
         driver.findElement(By.className("_58mt")).click(); 
        
        
        driver.findElement(By.name("websubmit")).click();
        
        
        


	}

}
