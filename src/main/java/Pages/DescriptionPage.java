package Pages;

import org.openqa.selenium.By;

import com.framework.testng.api.base.ProjectSpecificMethods;

public class DescriptionPage extends ProjectSpecificMethods{
	
	public UserDetailsPage addTheCard() {
		try {
		getDriver().findElement(By.xpath("//a[text()='Demandez votre Carte']")).click();
		reportStep("Click on the Demandez votre carte", "pass");
	} catch(Exception e) {
		reportStep("Not click on the Demandez votre carte", "fail");
	}
		return new UserDetailsPage();	
	}
}
