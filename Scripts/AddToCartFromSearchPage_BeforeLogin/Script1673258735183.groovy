import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.pcjeweller.com/')

WebUI.maximizeWindow()


WebUI.setText(findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/searchBar'), 'THE HOPRAH DIAMOND SUI DHAGA')

WebUI.click(findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/searchButton'))

WebUI.click(findTestObject('Object Repository/ShoppingCartObjects/a_The Hoprah Diamond Sui Dhaga'))

//WebUI.switchToWindowTitle('(2) New Messages!')

WebUI.switchToWindowUrl('https://www.pcjeweller.com/the-hoprah-diamond-sui-dhaga.html?bid=')

WebUI.verifyElementText(findTestObject('Object Repository/a_ADD TO CART (1)'), 'ADD TO CART')

WebUI.click(findTestObject('Object Repository/a_ADD TO CART'))


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


TestObject earringsName = findTestObject('Object Repository/ShoppingCartObjects/a_The Hoprah Diamond Sui Dhaga')

//WebUI.verifyElementText(findTestObject('Object Repository/ShoppingCartObjects/a_The Rabia Diamond Ring (1)'), 'The Rabia Diamond Ring')
if (WebUI.getText(earringsName).contains('The Hoprah')) {
    KeywordUtil.markPassed('----------------ITEM IS ADDED TO THE CART SUCCESSFULLY------PASSED--------')
} else {
    KeywordUtil.markFailedAndStop('--------------ITEM IS NOT ADDED TO THE CART-----------FAILED')
}


