package Pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.AMEX.ProjectSpecificMethod;

public class SecurityInformation extends ProjectSpecificMethod{

	public SecurityInformation enterMothersMaidenName() throws IOException {
		try {
		getDriver().findElement(By.xpath("//input[@id='fieldControl-input-mothersMaidenName']")).sendKeys("deb");
		reportStep("Enter Mothers Maiden Name", "pass");
	} catch(Exception e) {
		reportStep("Mothers Maiden Name is not Entered", "fail");
	}
		return this;	
	}
	
	public SecurityInformation enterPinOne() throws IOException {
		try {
		getDriver().findElement(By.xpath("//input[@id='fieldControl-input-pin']")).sendKeys("9940");
		reportStep("Enter the Pin number", "pass");
	} catch(Exception e) {
		reportStep("Pin is not Entered", "fail");
	}
		return this;	
	}
	
	public SecurityInformation enterConfirmPinOne() throws IOException {
		try {
		getDriver().findElement(By.xpath("//input[@id='fieldControl-input-confirmPin']")).sendKeys("9940");
		reportStep("Enter the Confirm Pin number", "pass");
	} catch(Exception e) {
		reportStep("Confirm Pin is not Entered", "fail");
	}
		return this;	
	}
	
	public SecurityInformation clickOnPerMain() throws IOException {
		try {
		getDriver().findElement(By.xpath("//label[@class='css-13gukjc']")).click();
		reportStep("Select the Per Mail", "pass");
	} catch(Exception e) {
		reportStep("Not selected the Per Mail", "fail");
	}
		return this;	
	}
	
	public SecurityInformation clickOnPerSMS() throws IOException {
		try {
		getDriver().findElement(By.xpath("(//label[@class='css-13gukjc'])[3]")).click();
		reportStep("Select the Per SMS", "pass");
	} catch(Exception e) {
		reportStep("Not selected the Per SMS", "fail");
	}
		return this;	
	}
	
	public PreapprovedPage ClickSubmitButton() throws IOException {
		try {
		getDriver().findElement(By.xpath("//button[text()='Soumettre']")).click();
		reportStep("Submit button has clicked", "pass");
	} catch(Exception e) {
		reportStep("Submit button has not clicked", "fail");
	}
		return new PreapprovedPage();	
	}
	
}
