package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.AMEX.ProjectSpecificMethodBase;

public class PersonalDetails extends ProjectSpecificMethodBase{
	
	public PersonalDetails clickOnCheckBox() throws IOException {
		try {
		getDriver().findElement(By.xpath("//label[@class='css-qv4r03']")).click();
		reportStep("Clicked the checkbox", "pass");
	} catch(Exception e) {
		reportStep("Not clicked the checkbox", "fail");
	}
		return this;		
	}
	
	public PersonalDetails enterTheBirthPlace() throws IOException {
		try {
		getDriver().findElement(By.xpath("//input[@id='fieldControl-input-placeOfBirth']")).sendKeys("Texas");
		reportStep("Entered the Birth Place", "pass");
	} catch(Exception e) {
		reportStep("Birth Place is not entered", "fail");
	}
		return this;	
	}
	
	public PersonalDetails selectTheDepartment() throws IOException {
		try {
		WebElement element = getDriver().findElement(By.xpath("//select[@id='fieldControl-input-departmentOfBirth']"));
		Select option = new Select(element);
		option.selectByIndex(1);
		reportStep("Department has selected", "pass");
	} catch(Exception e) {
		reportStep("Department has not selected", "fail");
	}
		return this;		
	}
	
	
	public PersonalDetails enterTheResidence() throws IOException {
		try {
		getDriver().findElement(By.xpath("//input[@id='fieldControl-input-residentialAddressLine2']")).sendKeys("enter the residence");
		reportStep("Residence has entered", "pass");
	} catch(Exception e) {
		reportStep("Residence has not entered", "fail");
	}
		return this;		
	}
	
	
	public PersonalDetails enterThePinCode() throws IOException {
		try {
		getDriver().findElement(By.xpath("//input[@id='fieldControl-input-postcode']")).sendKeys("60940");
		reportStep("Pincode has entered", "pass");
	} catch(Exception e) {
		reportStep("Pincode has not entered", "fail");
	}
		return this;	
	}
	
	public PersonalDetails enterTheCity() throws IOException {
		try {
		getDriver().findElement(By.xpath("//input[@id='fieldControl-input-cityTown']")).sendKeys("texas");
		reportStep("City has entered", "pass");
	} catch(Exception e) {
		reportStep("City has not entered", "fail");
	}
		return this;	
	}
	
	
	public PersonalDetails enterResidentialStatus() throws IOException {
		try {
		WebElement element = getDriver().findElement(By.xpath("//select[@id='fieldControl-input-personalResidentialStatus']"));
		Select option = new Select(element);
		option.selectByIndex(1);
		reportStep("Residential status has selected", "pass");
	} catch(Exception e) {
		reportStep("Residential status has not selected", "fail");
	}
		return this;		
	}
	
	public FinancialInformation ClickSubmitButton() throws IOException {
		try {
		getDriver().findElement(By.xpath("//button[@type='submit']")).click();
		reportStep("Submit button has clicked", "pass");
	} catch(Exception e) {
		reportStep("Submit button has not clicked", "fail");
	}
		return new FinancialInformation();	
	}
	
}
