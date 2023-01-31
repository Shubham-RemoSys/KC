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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.pcjeweller.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/searchBar'), 'THE GOLD CHAIN GCH08410631')

WebUI.click(findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/searchButton'))

WebUI.verifyElementText(findTestObject('Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/ItemFoundSuccessfullMSZ'), '1 ITEM(S) FOUND FOR "THE GOLD CHAIN GCH08410631"')

KeywordUtil.markPassed(WebUI.getText(findTestObject('Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/ItemFoundSuccessfullMSZ')))
WebUI.closeBrowser()

