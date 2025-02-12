package Pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.AMEX.ProjectSpecificMethodBase;

public class PreapprovedPage extends ProjectSpecificMethodBase{

	public PreapprovedPage clickOnContinue() throws IOException {
		try {
		getDriver().findElement(By.xpath("//button[@class='btn btn-primary css-19hct2l']")).click();
		reportStep("Clicked on Continue button", "pass");
	} catch(Exception e) {
		reportStep("Not clicked on Continue button", "fail");
	}
		return this;	
	}
}
