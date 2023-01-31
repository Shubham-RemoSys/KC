import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
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
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://www.pcjeweller.com/')

not_run: WebUI.maximizeWindow()

not_run: WebUI.acceptAlert()

WebUI.callTestCase(findTestCase('LoginTest'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ShoppingCartObjects/Link_Rings'))

WebUI.click(findTestObject('Object Repository/ShoppingCartObjects/button_Popularity'))

WebUI.click(findTestObject('Object Repository/ShoppingCartObjects/a_Price - High to Low'))

WebUI.click(findTestObject('Object Repository/ShoppingCartObjects/a_The Rabia Diamond Ring'))

//WebUI.switchToWindowTitle('(2) New Messages!')
WebUI.switchToWindowUrl('https://www.pcjeweller.com/the-rabia-diamond-ring.html?bid=')

WebUI.click(findTestObject('Object Repository/ShoppingCartObjects/Select Size'))

WebUI.click(findTestObject('Object Repository/ShoppingCartObjects/li_11'))

KeywordUtil.logInfo('Ring size is selected as 11')

WebUI.verifyElementText(findTestObject('Object Repository/ShoppingCartObjects/a_ADD TO CART (1)'), 'ADD TO CART')

WebUI.click(findTestObject('Object Repository/ShoppingCartObjects/a_ADD TO CART'))

WebUI.verifyElementText(findTestObject('Object Repository/ShoppingCartObjects/span_Added to cart'), 'Added to cart')

TestObject confirmationText = findTestObject('Object Repository/ShoppingCartObjects/span_Added to cart')

KeywordUtil.logInfo('Confirmation Text is dosplayed as :' + WebUI.getText(confirmationText))

WebUI.click(findTestObject('Object Repository/ShoppingCartObjects/Cart_Icon'))

TestObject shoppingBag = findTestObject('Object Repository/ShoppingCartObjects/TextShoppingBag')

//WebUI.verifyElementText(findTestObject('Object Repository/ShoppingCartObjects/TextShoppingBag'), 'Shopping Bag 1 item(s)')
if (WebUI.getText(shoppingBag).contains('SHOPPING')) {
    KeywordUtil.markPassed('User is navigated to the SHopping Cart Page')
} else {
    KeywordUtil.markFailedAndStop('User is navigated to the SHopping Cart Page')
}

TestObject ringName = findTestObject('Object Repository/ShoppingCartObjects/a_The Rabia Diamond Ring (1)')

//WebUI.verifyElementText(findTestObject('Object Repository/ShoppingCartObjects/a_The Rabia Diamond Ring (1)'), 'The Rabia Diamond Ring')
if (WebUI.getText(ringName).contains('The Rabia')) {
    KeywordUtil.markPassed('----------------ITEM IS ADDED TO THE CART SUCCESSFULLY------PASSED--------')
} else {
    KeywordUtil.markFailedAndStop('--------------ITEM IS NOT ADDED TO THE CART-----------FAILED')
}

