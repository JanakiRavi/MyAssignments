package week7assignment.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateOpportunityWithoutMandatoryFields extends BaseClass{
	
	@Given("Choose close date as Tommorow")
	public void closeDate() throws InterruptedException {
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='14']")).click();
	}
	@When("Click SaveButton")
	public void ClickSave() {
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	}
	@Then("Verify the Alert message")
	public void verfiyAlert() {
		//no need to switch to alert(sweet alert)
		System.out.println(driver.findElement(By.xpath("//h2[@title='We hit a snag.']")).getText());
		System.out.println(driver.findElement(By.xpath("//strong[text()='Review the following fields']")).getText());
		System.out.println(driver.findElement(By.xpath("//a[@data-index='0']")).getText());
		System.out.println(driver.findElement(By.xpath("//a[@data-index='1']")).getText());
		
	}

}
