package Pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.AMEX.ProjectSpecificMethod;

public class UserDetailsPage extends ProjectSpecificMethod{

	public UserDetailsPage selectTheCivilité() throws IOException {
		try {
		getDriver().findElement(By.xpath("//label[@class='css-13gukjc']")).click();
		reportStep("Click on the M", "pass");
	} catch(Exception e) {
		reportStep("Not click on the M", "fail");
	}
		return this;	
	}
	
	public UserDetailsPage enterThePrénom() throws IOException {
		try {
		getDriver().findElement(By.xpath("//input[@name='firstName']")).sendKeys("Andrew");
		reportStep("First name has entered", "pass");
	} catch(Exception e) {
		reportStep("First name has not entered", "fail");
	}
		return this;	
	}
	
	public UserDetailsPage enterTheNom() throws IOException {
		try {
		getDriver().findElement(By.xpath("//input[@name='lastName']")).sendKeys("Ben");
		reportStep("Last name has entered", "pass");
	} catch(Exception e) {
		reportStep("Last name has not entered", "fail");
	}
		return this;	
	}
	
	
	public UserDetailsPage enterTheDOB() throws IOException {
		try {
		getDriver().findElement(By.xpath("//input[@id='fieldControl-input-dateOfBirth']")).sendKeys("01/07/1986");
		reportStep("DOB has entered", "pass");
	} catch(Exception e) {
		reportStep("DOB has not entered", "fail");
	}
		return this;	
	}
	
	public UserDetailsPage enterTheEmail() throws IOException {
		try {
		getDriver().findElement(By.xpath("//input[@id='fieldControl-input-email']")).sendKeys("Andrew_ben_017@gmail.com");
		reportStep("Email has entered", "pass");
	} catch(Exception e) {
		reportStep("Email has not entered", "fail");
	}
		return this;	
	}
	
	
	public UserDetailsPage enterThePhoneNumber() throws IOException {
		try {
		getDriver().findElement(By.xpath("//input[@id='fieldControl-input-mobilePhoneNumber']")).sendKeys("0612345678");
		reportStep("Phone Number has entered", "pass");
	} catch(Exception e) {
		reportStep("Phone Number has not entered", "fail");
	}
		return this;	
	}
	
	public PersonalDetails clickOnSubmit() throws IOException {
		try {
		getDriver().findElement(By.xpath("//button[@type='submit']")).click();
		reportStep("Clicked the Submit button", "pass");
	} catch(Exception e) {
		reportStep("Not clicked the Submit button", "fail");
	}
		return new PersonalDetails();	
	}
	
}
