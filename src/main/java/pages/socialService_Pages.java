package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class socialService_Pages extends StartupPage {

	String pageName = this.getClass().getSimpleName();
	public socialService_Pages(WebDriver driver) {
		super(driver);
	}

	/**@Test1
	 * about this method loginTohealthAppByGivenValidCredetial() 
	 * @param : Map<String, String>
	 * @description : fill usernameTextbox & passwordTextbox and click on sign in button
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
		//write your logic
		return false;
	}

	/**@Test1.2
	 * about this method verifyTitleOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the title of the current page.
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyTitleOfThePage() throws Exception {
		//write your logic	
		return null;
	}

	/**@Test1.3
	 * about this method verifyURLOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the URL of the current page.
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyURLOfThePage() throws Exception {
		//write your logic	
		return null;
	}

	/**@Test2
	 * about this method verifySocialServiceModuleisPresentAndGoToSocialServiceTab() 
	 * @param : null
	 * @description : Verify that SocialService module is present and Go to SocialService Tab.
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean verifySocialServiceModuleisPresentAndGoToSocialServiceTab() throws Exception {
		//write your logic
		return false;
	}

	/**@Test3
	 * about this method registerNewSSUPatientButtonisPresent() 
	 * @param : null
	 * @description : Verify that Register New SSU Patient button is present inside the SocialService Tab.
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public String verifyRegisterNewSSUPatientButtonisPresentAndValidateFormName() throws Exception {
		//write your logic
		return null;
	}

	/**@Test4
	 * about this method validateErrorMessageInLastNameTextfield() 
	 * @param : null
	 * @description : Validate the error message in Last Name text field without filling any data and clicking on "Register" Button
	 * @author : YAKSHA
	 */
	public String validateErrorMessageInLastNameTextfield() throws Exception {
		//write your logic
		return null;
	}

	/**@Test5
	 * about this method fillAllTheTextfieldsinsideTheNewSSUPatientRegistrationForm() 
	 * @param : Map<String, String>
	 * @description : Fill all the text fields which are present inside the New SSU Patient Registration popup  and Check the data which we are entered are present in First Name Field. 
	 * @return : String
	 * @author : YAKSHA
	 */
	public String fillDataInTextfieldsAndVerifyEnteredData(Map<String, String> expectedData) throws Exception {
		//write your logic
		return null;
	}

	/**@Test6
	 * about this method scrollToButtomOfThePageAndVerifyCloseButtonIsPresent() 
	 * @param : null
	 * @description : scroll to the bottom of the page and verify that "Close" button is present or not.
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean scrollToButtomOfThePageAndVerifyCloseButtonIsPresent() throws Exception {
		//write your logic
		return false;
	}

	/**@Test7
	 * about this method validateWarnningMessageOfNewSSUPatientRegistrationForms() 
	 * @param : Map<String, String>
	 * @description : Validate the warnning message for the membership dropdown.
	 * @return : String
	 * @author : YAKSHA
	 */
	public String validateWarnningMessageOfNewSSUPatientRegistrationForms(Map<String, String> expectedData) throws Exception {
		//write your logic
		return null;
	}

	/**@Test8
	 * about this method verifyTextboxIsPresentBySelectingYesFromHasTargetGroupCertificateDropdown() 
	 * @param : get the data from Excel file as type Map<String, String> expectedData
	 * @description : it will select the country as per Excel expected data
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyTextboxIsPresentBySelectingYesFromHasTargetGroupCertificateDropdown(Map<String, String> expectedData) throws Exception {
		//write your logic
		return null;
	}

	/**@Test9
	 * about this method getPlaceHolderNameVerifyPlaceHolderNameOfAddress() 
	 * @param : Map<String, String>
	 * @description : get the place holder name of address textfiled and verify  the place holder name.
	 * @return : String
	 * @author : Yaksha
	 */
	public String getPlaceHolderNameVerifyPlaceHolderNameOfAddress(Map<String, String> expectedData) throws Exception {
		//write your logic
		return null;
		
	}

	/**@Test10
	 * about this method closeNewSSUPatientRegistrationPopupByUsingJsExecutor() 
	 * @param : null
	 * @description : Close this "New SSU Patient Registration" popup by using javaScript.
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean closeNewSSUPatientRegistrationPopupByUsingJsExecutor() throws Exception {
		//write your logic
		return false;
	}

	/**@Test11
	 * about this method closeNewSSUPatientRegistrationPopupByUsingJsExecutor() 
	 * @param : null
	 * @description : Ensure navigation controls function correctly and verify the presence of specific fields and buttons on the Home page and SSU Patient List page.
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean performNavigateBackNavigateRefreshNavigateForwordAction() throws Exception {
		//write your logic
		return false;
	}

	

	/**@Test12
	 * about this method getDataFromTable() 
	 * @param : null
	 * @description : it will fetch the data from the table
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public String getDataFromTable() throws Exception {
		//write your logic
		return null;
	}

	

}
