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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

Mobile.startExistingApplication('com.initialcoms.ridi', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('2nd-Test/App_PoC_001/SelectedHome'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('2nd-Test/App_PoC_004/WebNovel-HeaderButton'), 0)

Mobile.tap(findTestObject('2nd-Test/App_PoC_004/WebNovel-HeaderButton'), 0)

Mobile.waitForElementPresent(findTestObject('2nd-Test/App_PoC_004/FantasyGenre-WebNovel'), 0)

Mobile.tap(findTestObject('2nd-Test/App_PoC_004/FantasyGenre-WebNovel'), 0)

Mobile.tap(findTestObject('2nd-Test/App_PoC_005/CartButton'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('2nd-Test/App_PoC_005/ID-Account'), '8qatest', 3)

Mobile.setText(findTestObject('2nd-Test/App_PoC_005/Pass-Account'), 'Riditest123!', 3)

Mobile.tap(findTestObject('2nd-Test/App_PoC_005/ConfirmButton-Login'), 3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('2nd-Test/App_PoC_005/CancelButton-Samsungpass'), 3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('2nd-Test/App_PoC_005/BackButton-SaveDevice'), 3, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('2nd-Test/App_PoC_005/Wishlist-Cart'), 0)

Mobile.tap(findTestObject('2nd-Test/App_PoC_005/Wishlist-Cart'), 3)

Mobile.verifyElementVisible(findTestObject('2nd-Test/App_PoC_005/NoWishlist-Message'), 3)

Mobile.closeApplication()

