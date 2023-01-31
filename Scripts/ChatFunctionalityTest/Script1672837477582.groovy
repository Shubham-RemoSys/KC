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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('LoginTest'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/form_Loading_chatbutton'), 
    0)

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/form_Loading_chatbutton'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/form_Loading_chatbutton'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/chatButton'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/chatButton'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/chatButton'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/chatDialogueBox'), 
    0)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/chatDialoguePCJtext'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/chatDialoguePCJtext'), 
    'PC Jeweller')

WebUI.click(findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/chatDialogueCloseButton'))

