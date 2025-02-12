package Pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.AMEX.ProjectSpecificMethodBase;

public class FRAllcards extends ProjectSpecificMethodBase{

	public DescriptionPage selectTheCard() throws IOException {
		try {
		getDriver().findElement(By.xpath("(//div[@class = 'button parbase']/div/a)[2]")).click();
		reportStep("Click on the En Savoir plus ", "pass");
	} catch(Exception e) {
		reportStep("Not click on the En Savoir plus ", "fail");
	}
		return new DescriptionPage();	
	}

}
