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

Mobile.tap(findTestObject('2nd-Test/App_PoC_006/SearchTab'), 3)

Mobile.setText(findTestObject('2nd-Test/App_PoC_006/Searchbar-SearchTab'), '이세계 착각 헌터', 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(970, 2097)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(220, 1535)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('2nd-Test/App_Poc_008/SelectedPurchasedList'), 3)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('2nd-Test/App_Poc_008/AddButton'), 0, FailureHandling.OPTIONAL)

Mobile.verifyElementVisible(findTestObject('2nd-Test/App_Poc_008/RentalTab-Header'), 0)

Mobile.verifyElementVisible(findTestObject('2nd-Test/App_Poc_008/SmallInterestTab-Header'), 0)

Mobile.waitForElementPresent(findTestObject('2nd-Test/App_PoC_009/RadioButton-Episode4'), 0)

Mobile.tap(findTestObject('2nd-Test/App_PoC_009/RadioButton-Episode4'), 3)

Mobile.tap(findTestObject('2nd-Test/App_PoC_009/CartIcon'), 3)

Mobile.verifyElementVisible(findTestObject('2nd-Test/App_PoC_009/Message-AddtoCart'), 3)

Mobile.tap(findTestObject('2nd-Test/App_PoC_009/ViewButton'), 3)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('2nd-Test/App_PoC_009/AvailableForRental-Cart'), 3)

