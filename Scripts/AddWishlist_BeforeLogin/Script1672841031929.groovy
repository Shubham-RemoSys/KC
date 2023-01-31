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
import internal.GlobalVariable
import javassist.compiler.ast.Keyword

import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.util.KeywordUtil




WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.pcjeweller.com/')

WebUI.mouseOver(findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/BestSellerLink'))

not_run: WebUI.waitForElementVisible(findTestObject('BestSellerPage/RingsLink'), 0)

WebUI.click(findTestObject('Object Repository/BestSellerPage/RingsLink'))

TestObject ringNames = findTestObject('Object Repository/BestSellerPage/ListRings')

List<WebElement> listOfRings = WebUI.findWebElements(ringNames, 10)

for (int i = 0; i < listOfRings.size(); i++) {
	KeywordUtil.logInfo(listOfRings.get(i).getText())
	
   // KeywordUtil.logInfo(listOfRings.get(i).toString())
}

