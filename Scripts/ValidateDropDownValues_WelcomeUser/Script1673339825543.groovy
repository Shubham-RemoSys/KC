import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.callTestCase(findTestCase('LoginTest'), [:], FailureHandling.STOP_ON_FAILURE)

WebDriver driver = DriverFactory.getWebDriver()

 WebElement Welcome = driver.findElement(By.xpath("//div[@class='pos-rel pull-right']//a[contains(@class,'user-account')]//span[text()='Welcome']"))
 Actions actions = new Actions(driver);
 actions.moveToElement(Welcome).click().build().perform();
 
//WebUI.click(findTestObject('Object Repository/Page_Gold  Diamond  Online Jewellery Shoppi_0b87d1/Link_WelcomeUser'))

