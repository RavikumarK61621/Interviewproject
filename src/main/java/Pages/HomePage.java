package Pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.AMEX.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod{

	public FRAllcards clickOnCard() throws IOException {
		try {
		getDriver().findElement(By.xpath("//p[text() = 'Cartes American Express®']")).click();
		reportStep("Card is clicked", "pass");
	} catch(Exception e) {
		reportStep("Card is not clicked", "fail");
	}
		return new FRAllcards();	
	}
}