import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.pcjeweller.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/NavigateHomePage/a_Coins'))



WebUI.verifyElementText(findTestObject('Object Repository/NavigateHomePage/h1_Coins'), 'COINS')

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

