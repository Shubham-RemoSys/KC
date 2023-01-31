import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('AddToCartFromSearchPage_BeforeLogin'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('ShoppingCartObjects/BTN_Cross'))
WebUI.setText(findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/searchBar'), 'The Misha Silver Diamond Earrings')

WebUI.click(findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/searchButton'))

WebUI.click(findTestObject('Object Repository/ShoppingCartObjects/a_The Misha Silver'))

//WebUI.switchToWindowTitle('(2) New Messages!')
WebUI.switchToWindowUrl('https://www.pcjeweller.com/the-misha-silver-diamond-earrings.html?bid=')

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

TestObject earringsName = findTestObject('Object Repository/ShoppingCartObjects/a_The Misha Silver')

//WebUI.verifyElementText(findTestObject('Object Repository/ShoppingCartObjects/a_The Rabia Diamond Ring (1)'), 'The Rabia Diamond Ring')
if (WebUI.getText(earringsName).contains('The Misha')) {
    KeywordUtil.markPassed('----------------ITEM IS ADDED TO THE CART SUCCESSFULLY------PASSED--------')
} else {
    KeywordUtil.markFailedAndStop('--------------ITEM IS NOT ADDED TO THE CART-----------FAILED')

}


	WebUI.click(findTestObject('Object Repository/ShoppingCartObjects/a_'))

	WebUI.verifyElementText(findTestObject('Object Repository/ShoppingCartObjects/div_Are you sure want to delete this item'),
		'Are you sure want to delete this item ?')
	

	KeywordUtil.logInfo('========== ALERT POPUP IS DISPLAYED ==============')
	
	WebUI.click(findTestObject('Object Repository/ShoppingCartObjects/input_Are you sure want to delete this item_bf276f'))

	TestObject ItemRemoveText = findTestObject('Object Repository/ShoppingCartObjects/ItemRemoved')
	System.out.println(WebUI.getText(ItemRemoveText))
	KeywordUtil.markPassed(WebUI.getText(ItemRemoveText)+'-------Test is PASSED----------')

