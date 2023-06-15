package week7assignment.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;

public class CreateIndividuals extends BaseClass{

	@Then("Click view All and click Individuals from App Launcher")
	public void clickIndividual() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Actions builder = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//p[text()='Individuals']"));
		builder.scrollToElement(element).perform();
		element.click();
	}
	@When("Click on New Individual")
	public void newIndividual() {
		driver.findElement(By.xpath("//div[@title='New']")).click();
	}
	@Given("Enter the Last Name as {string}")
	public void lastName(String lname) {
		driver.findElement(By.xpath("//input[contains(@class,'lastName compoundBLRadius')]")).sendKeys(lname);
	}
	@When("Click saveButton")
	public void saveButton() {
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
	}
	@Then("Verify Individuals Name")
	public void verfiyName() {
		String name = driver.findElement(By.xpath("//span[@class='uiOutputText']")).getText();
		System.out.println(name);
		if(name.contains("Kumar"))
			System.out.println("Name verified");
		else
			System.out.println("Name not verified");
	}
}
