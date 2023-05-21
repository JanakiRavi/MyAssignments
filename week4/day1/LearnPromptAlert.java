package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptAlert {

public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following::span")).click(); // click the button
		
		//switch the control
		Alert promptAlert = driver.switchTo().alert();
		//read the text
		String text = promptAlert.getText();
		System.out.println("Alert Message:" +text);
		
		//type in the alert
		promptAlert.sendKeys("Janaki");
		
		//accept the alert
		promptAlert.accept();
		//read the text
		String text2 = driver.findElement(By.id("confirm_result")).getText();
		System.out.println("After accepting alert"+ text2);

	}

}
