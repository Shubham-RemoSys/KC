import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.pcjeweller.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/NavigateHomePage/a_SilverLink'))

boolean flag = WebUI.verifyElementPresent(findTestObject('Object Repository/NavigateHomePage/title_SILVER'), 10)

if (flag == true) {
    KeywordUtil.logInfo('===============User is navigated to the Silver category page ======= ')
}

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

