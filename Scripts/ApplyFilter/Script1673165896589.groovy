import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.support.ui.Select as Select
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.pcjeweller.com/')

WebUI.maximizeWindow()

WebDriver driver = DriverFactory.getWebDriver()

WebUI.click(findTestObject('Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/LinkEarrings'))

WebUI.verifyElementText(findTestObject('Object Repository/ProductPage/Text_View All Earrings'), 'VIEW ALL EARRINGS')

WebUI.click(findTestObject('Object Repository/ProductPage/FilterPriceButton'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ProductPage/Filter_SelectMaxPrice'), '15000', false)

WebUI.waitForElementVisible(findTestObject('ProductPage/FilterPriceList'), 10)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/ProductPage/FilterPrice_Range'), '0 - 15,000')

List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='productListing']//div[@class='row']//div[@class='price-section-listview']//span[contains(@class,'price')]"))
List<Integer> list = new ArrayList();
int i=0
for (WebElement wb : priceList) {
    System.out.println(wb.getText())
	String rs = wb.getText()
	String StringPrice1 = rs.substring(1)
	String StringPrice = StringPrice1.replace(',', '')
	int IntPrice = Integer.parseInt(StringPrice)
	list.add(IntPrice)
	
	if (IntPrice < 15000) {
		i++;
		
	} else {
		i--;
		System.out.println('----------------------FAILED---------------------------')
	}

   
}
if(i>=12)
{
	System.out.println('All the item price are below the value of the applied filter ---TC IS PASSED----')
	KeywordUtil.markPassed('All the item price are below the value of the applied filter ---TC IS PASSED----')
}
else {
	System.out.println('----------------------TC IS FAILED--------------------')
	KeywordUtil.markFailedAndStop('----------------------TC IS FAILED--------------------')
}
	