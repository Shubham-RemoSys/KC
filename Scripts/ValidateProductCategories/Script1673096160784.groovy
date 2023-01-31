import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import net.sf.jasperreports.web.util.WebUtil as WebUtil

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.pcjeweller.com/')

WebUI.maximizeWindow()

WebDriver driver = DriverFactory.getWebDriver()

//TestObject productCategory = findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/ProductCategories_Header')
//List<WebElement> listOfRings = WebUI.findWebElements(productCategory, 10)
List<WebElement> categoryList = driver.findElements(By.xpath('//ul[@class=\'main-navigation\']/li/a'))

List<WebElement> pList = new ArrayList()

pList.add('RINGS')

pList.add('EARRINGS')

pList.add('BEST SELLERS')

pList.add('ALL JEWELLERY')

pList.add('COLLECTIONS')

pList.add('READY TO SHIP')

pList.add('GOLD CHAINS')

pList.add('SILVER')

pList.add('COINS')

pList.add('DIGITAL GOLD')

System.out.println(pList)

List<WebElement> eList = new ArrayList()

String otext = ''

for (WebElement wb : categoryList) {
    //String text = WebUI.getText(wb)
    String text = wb.getText()

    //	System.out.println(text)
    otext = text

    eList.add(otext)
}

System.out.println(eList)

//boolean isEquals = Object.equals(pList, eList)
if (pList.equals(eList)) {
    System.out.println("Product Category List is Updated on header")

    KeywordUtil.markPassed('Product Category List is Updated on header')
} else {
    System.out.println('List is not updated')

    KeywordUtil.markFailed('List is not updated')
}