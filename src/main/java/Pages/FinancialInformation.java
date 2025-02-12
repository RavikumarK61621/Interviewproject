package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.AMEX.ProjectSpecificMethodBase;

public class FinancialInformation extends ProjectSpecificMethodBase{
	
	
	public FinancialInformation enterTheIBAN() throws IOException {
		try {
		getDriver().findElement(By.xpath("//input[@id='fieldControl-input-bankAccountNumber']")).sendKeys("FR1420041010050500013M02606");
		reportStep("Enter the IBAN", "pass");
	} catch(Exception e) {
		reportStep("Not Enter the IBAN", "fail");
	}
		return this;	
	}
	
	public FinancialInformation enterTheSWIFT() throws IOException {
		try {
		getDriver().findElement(By.xpath("//input[@id='//input[@id='fieldControl-input-bankIdentifierCode']")).sendKeys("FR142004101");
		reportStep("Enter the SWIFT", "pass");
	} catch(Exception e) {
		reportStep("Not Enter the SWIFT", "fail");
	}
		return this;		
	}

	public FinancialInformation selectYourBanking() throws IOException {
		try {
		WebElement element = getDriver().findElement(By.xpath("//select[@id='fieldControl-input-tenureOfAccount']"));
		Select option = new Select(element);
		option.selectByIndex(3);
		reportStep("Enter the SWIFT", "pass");
	} catch(Exception e) {
		reportStep("Not Enter the SWIFT", "fail");
	}
		return this;		
	}
	
	
	public FinancialInformation enterGrossIncome() throws IOException {
		try {
		getDriver().findElement(By.xpath("//input[@id='fieldControl-input-annualPersonalIncome']")).sendKeys("120000");
		reportStep("Enter the GrossIncome", "pass");
	} catch(Exception e) {
		reportStep("Not Enter the GrossIncome", "fail");
	}
		return this;		
	}
	
	public FinancialInformation clickOtherSourceIncome() throws IOException {
		try {
		getDriver().findElement(By.xpath("(//label[@class='css-13gukjc'])[2]")).click();
		reportStep("Click the Other Source Income", "pass");
	} catch(Exception e) {
		reportStep("Not Click the Other Source Income", "fail");
	}
		return this;		
	}
	
	public FinancialInformation enterFinancialAssets() throws IOException {
		try {
		WebElement element = getDriver().findElement(By.xpath("(//select[@id='fieldControl-input-totalAssets']"));
		Select option = new Select(element);
		option.selectByIndex(2);
		reportStep("Enter the Financial Assets", "pass");
	} catch(Exception e) {
		reportStep("Not enter the Financial Assets", "fail");
	}
		return this;		
	}
	
	public FinancialInformation selectTheProfessionalCategory() throws IOException {
		try {
		WebElement element = getDriver().findElement(By.xpath("//select[@id='fieldControl-input-occupation']"));
		Select option = new Select(element);
		option.selectByIndex(6);
		reportStep("Select the Professional Category", "pass");
	} catch(Exception e) {
		reportStep("Not select the Professional Category", "fail");
	}
		return this;		
	}
	
	public FinancialInformation selectYourProfession() throws IOException {
		try {
		WebElement element = getDriver().findElement(By.xpath("//select[@id='fieldControl-input-occupationDescription']"));
		Select option = new Select(element);
		option.selectByIndex(2);
		reportStep("Select the Your Profession", "pass");
	} catch(Exception e) {
		reportStep("Not select the Your Profession ", "fail");
	}
		return this;		
	}
	
	
	public SecurityInformation ClickSubmitButton() throws IOException {
		try {
		getDriver().findElement(By.xpath("//button[@type='submit']")).click();
		reportStep("Submit button has clicked", "pass");
	} catch(Exception e) {
		reportStep("Submit button has not clicked", "fail");
	}
		return new SecurityInformation();	
	}

}
