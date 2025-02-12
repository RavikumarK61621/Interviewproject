package Pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.AMEX.ProjectSpecificMethodBase;

public class DescriptionPage extends ProjectSpecificMethodBase{
	
	public UserDetailsPage addTheCard() throws IOException {
		try {
		getDriver().findElement(By.xpath("//a[text()='Demandez votre Carte']")).click();
		reportStep("Click on the Demandez votre carte", "pass");
	} catch(Exception e) {
		reportStep("Not click on the Demandez votre carte", "fail");
	}
		return new UserDetailsPage();	
	}
}
