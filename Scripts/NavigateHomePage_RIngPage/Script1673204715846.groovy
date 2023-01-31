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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.pcjeweller.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/NavigateHomePage/a_Rings'))

WebUI.verifyElementText(findTestObject('Object Repository/NavigateHomePage/h1_View All Rings'), 'VIEW ALL RINGS')

WebUI.click(findTestObject('Object Repository/NavigateHomePage/img'))

String actURL = WebUI.getUrl()

String expURL = 'https://www.pcjeweller.com/'

if (WebUI.verifyEqual(actURL, expURL)) {
    System.out.println('User is navigated to the homepage of the application -- TC PASSED---')

    KeywordUtil.markPassed('User is navigated to the homepage of the application -- TC PASSED---')
} else {
    System.out.println('User is NOT navigated to the homepage of the application')

    KeywordUtil.markFailedAndStop('User is NOT navigated to the homepage of the application -- TC FAILED---')

    
}
WebUI.closeBrowser()
