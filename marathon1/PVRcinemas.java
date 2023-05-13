package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PVRcinemas {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.pvrcinemas.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search your city']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search city']")).click();
		driver.findElement(By.xpath("//img[@alt='Chennai']")).click();
		driver.findElement(By.xpath("//div[text()='Movie Library ']")).click();

		WebElement element1 = driver.findElement(By.name("city"));

		Select city=new Select(element1);
		city.selectByVisibleText("Chennai");

		WebElement element2 = driver.findElement(By.name("genre"));

		Select genre=new Select(element2);
		genre.selectByVisibleText("ANIMATION");


		WebElement element3 = driver.findElement(By.name("lang"));

		Select lan=new Select(element3);
		lan.selectByVisibleText("ENGLISH");

		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='https://originserver-static1-uat.pvrcinemas.com/app/movies/1/402x516/HO00018056.jpg?v=5']/following-sibling::div[1]")).click();
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();

		WebElement element4 = driver.findElement(By.name("cinemaName"));

		Select cinema=new Select(element4);
		cinema.selectByVisibleText("PVR Heritage RSL ECR Chennai");


		driver.findElement(By.xpath("//label[text()='Minimum 5 days of prior notice']/following::input")).click();
		driver.findElement(By.xpath("//span[text()='18']")).click();

		WebElement element5 = driver.findElement(By.name("timings"));

		Select time=new Select(element5);
		time.selectByVisibleText("09:00 AM - 12:00 PM");

        
		driver.findElement(By.name("noOfTickets")).sendKeys("5");
		driver.findElement(By.name("name")).sendKeys("Janaki");
		driver.findElement(By.name("email")).sendKeys("janakiravi77@gmail.com");
		driver.findElement(By.name("mobile")).sendKeys("7397597078");
		
		WebElement element6 = driver.findElement(By.name("food"));

		Select food=new Select(element6);
		food.selectByVisibleText("Yes");
		
		
		driver.findElement(By.xpath("//label[text()='F&B Requirements']/following::input")).sendKeys("NIL");
		
		driver.findElement(By.xpath("//span[text()='Copy To Self']")).click();
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		System.out.println(driver.findElement(By.xpath("//h2[text()='Success']")).getText());
		String title = driver.getTitle();

		if(title.equals("Movie Library"))
			System.out.println("Title is verified");
		else
			System.out.println("Wrong title");

	}

}
