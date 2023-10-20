package sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheapOAir {

	public static void main(String[] args) {
		//steps to load application
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.cheapoair.com/");
        
       WebElement popup = driver.findElement(By.xpath("//div[@class='modal-close-icon']"));  
       driver.executeScript("arguments[0].click();", popup);
       
        WebElement onewaytrip = driver.findElement(By.id("onewaytrip"));
        driver.executeScript("arguments[0].click();", onewaytrip);
        
        

	}

}
