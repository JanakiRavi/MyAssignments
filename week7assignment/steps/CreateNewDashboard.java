package week7assignment.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.*;
import io.cucumber.java.en.*;

public class CreateNewDashboard extends BaseClass{

	
	@Then("Click view All and click Dashboard from App Launcher")
	public void Dashboard() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Actions builder = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//p[text()='Dashboards']"));
		builder.scrollToElement(element).perform();
		element.click();
		
	}
	@When("Click on the New Dashboard option")
	public void newDashboard() {
		driver.findElement(By.xpath("//div[@title='New Dashboard']")).click();
	}
	@Given("Enter Name as Salesforce Automation by {string} and Click on Create")
	public void enternameandClickCreate(String name) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("dashboardNameInput")))).sendKeys("Salesforce Automation by "+name);
		driver.findElement(By.id("submitBtn")).click();
	}
	
	@When("Click on Save")
	public void clickSave() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Save']"))).click();
	}
	@Then("Verify Dashboard name")
	public void verify_individuals_name() {
		String name = driver.findElement(By.xpath("//span[@class='slds-form-element__static slds-grid slds-grid_align-spread']")).getText();
		if (name.indexOf("\n") != -1)
			name = name.substring(0, name.indexOf("\n"));
		System.out.println("Dashboard Name: "+name);
	}
}
