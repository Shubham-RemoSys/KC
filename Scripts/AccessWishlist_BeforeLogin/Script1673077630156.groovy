import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword as Keyword
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

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/heartIcon'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/heartIcon'))

WebUI.waitForElementVisible(findTestObject('Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/a_Login'), 20)

WebUI.verifyElementText(findTestObject('Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/a_Login'), 'Login')

WebUI.setText(findTestObject('Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/input_Login_userLoginEmail'), 'draftcardtesting1@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/input_Email Address_userLoginPassword'), 
    '7q1aKE1wHhQjVkZDsO80LQ==')

WebUI.click(findTestObject('Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/input_Password_submitLogin'))

WebUI.getWindowTitle()

TestObject brokenPageText = findTestObject('Object Repository/WishListPage/brokenPage')

//WebUI.getText(findTestObject('WishListPage/brokenPage'))
String errorText = WebUI.getText(brokenPageText)

//boolean flag = errorText.contains('This site')
//def contains = errorText.contains('This site')
if (errorText.equalsIgnoreCase('This site can’t be reached')) {
    System.out.println('The wishlist feature is under dev')

    KeywordUtil.logInfo('Wishlist Feature is under maintenance')
} else {
    System.out.println('User is on Wishlist page')

    KeywordUtil.logInfo('Wishlist page is displayed')
}

