import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('chrome')

WebUI.navigateToUrl('https://www.pcjeweller.com/')

WebUI.waitForElementVisible(findTestObject('Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/loginText'), 10)

WebUI.verifyElementText(findTestObject('Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/loginText'), 'Login')

WebUI.verifyElementText(findTestObject('Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/loginText'), 'Login')

WebUI.click(findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/loginText'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/input_Login_userLoginEmail'), 
    '')

WebUI.setText(findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/input_Login_userLoginEmail'), 
    'draftcardtesting1@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/li_Please Enter PasswordPassword'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/input_Email Address_userLoginPassword'), 
    '')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/input_Email Address_userLoginPassword'), 
    '7q1aKE1wHhQjVkZDsO80LQ==')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/input_Password_submitLogin'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/input_Password_submitLogin'))

//WebUI.verifyElementText(findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/a_WelcomeRemo'), 
//  'Welcome')
TestObject welcomeText = findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/a_WelcomeRemo')

if (WebUI.getText(welcomeText).contains('Welcome')) {
    System.out.println('User is successfully logged into the App')

    KeywordUtil.markPassed('User is successfully logged into the App')
} else {
    System.out.println('User is not logged into the App')

    KeywordUtil.markFailedAndStop('User is not logged into the App')
}

