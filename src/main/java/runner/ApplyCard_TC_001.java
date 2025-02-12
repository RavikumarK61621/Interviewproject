package runner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.AMEX.ProjectSpecificMethodBase;

import Pages.HomePage;

public class ApplyCard_TC_001 extends ProjectSpecificMethodBase{

	
@Test
public void cardApplication() throws IOException {
	
	HomePage hp = new HomePage();
	hp.clickOnCard()
	.selectTheCard()
	.addTheCard()
	.selectTheCivilité()
	.enterThePrénom()
	.enterTheNom()
	.enterTheDOB()
	.enterTheEmail()
	.enterThePhoneNumber()
	.clickOnSubmit()
	.clickOnCheckBox()
	.enterTheBirthPlace()
	.selectTheDepartment()
	.enterTheResidence()
	.enterThePinCode()
	.enterTheCity()
	.enterResidentialStatus()
	.ClickSubmitButton()
	.enterTheIBAN()
	.enterTheSWIFT()
	.selectYourBanking()
	.enterGrossIncome()
	.clickOtherSourceIncome()
	.enterFinancialAssets()
	.selectTheProfessionalCategory()
	.selectYourProfession()
	.ClickSubmitButton()
	.enterMothersMaidenName()
	.enterPinOne()
	.enterConfirmPinOne()
	.clickOnPerMain()
	.clickOnPerSMS()
	.ClickSubmitButton()
	.clickOnContinue();
	
	}
	
}
