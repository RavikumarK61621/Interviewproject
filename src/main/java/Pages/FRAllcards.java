package Pages;

import org.openqa.selenium.By;

import com.framework.testng.api.base.ProjectSpecificMethods;

public class FRAllcards extends ProjectSpecificMethods{

	public DescriptionPage selectTheCard() {
		try {
		getDriver().findElement(By.xpath("(//div[@class = 'button parbase']/div/a)[2]")).click();
		reportStep("Click on the En Savoir plus ", "pass");
	} catch(Exception e) {
		reportStep("Not click on the En Savoir plus ", "fail");
	}
		return new DescriptionPage();	
	}

}
