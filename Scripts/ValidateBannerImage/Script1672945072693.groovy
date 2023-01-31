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
import internal.GlobalVariable
import net.sf.jasperreports.web.util.WebUtil

import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.pcjeweller.com/')

WebUI.waitForElementVisible(findTestObject('BannnerImageObjects/ImgAnant'), 30)

WebUI.verifyElementVisible(findTestObject('Object Repository/BannnerImageObjects/ImgAnant'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/BannnerImageObjects/ImgAnimal'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/BannnerImageObjects/ImgAnimal'), 30)

WebUI.waitForElementVisible(findTestObject('Object Repository/BannnerImageObjects/ImgPikSee'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/BannnerImageObjects/ImgPikSee'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/BannnerImageObjects/ImgBday'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/BannnerImageObjects/ImgBday'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/BannnerImageObjects/ImgBabyCollection'), 30)

WebUI.verifyElementPresent(findTestObject('Object Repository/BannnerImageObjects/ImgBabyCollection'), 0)


	KeywordUtil.logInfo("All the banner images are displayed on WEB APP UI")

