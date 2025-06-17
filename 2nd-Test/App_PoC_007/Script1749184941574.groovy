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


try {
	Mobile.startExistingApplication('com.initialcoms.ridi', FailureHandling.STOP_ON_FAILURE)

	Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
	
	Mobile.tap(findTestObject('2nd-Test/App_PoC_006/SearchTab'), 3)
	
	Mobile.setText(findTestObject('2nd-Test/App_PoC_006/Searchbar-SearchTab'), '이세계 착각 헌터', 0)
	
	Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
	
	Mobile.tapAtPosition(970, 2097)
	
	Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
	
	Mobile.tapAtPosition(220, 1535)
	
	Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
	
	Mobile.verifyElementVisible(findTestObject('2nd-Test/App_PoC_006/WorkTitle-이세계 착각 헌터'), 0, FailureHandling.STOP_ON_FAILURE)

	Mobile.tap(findTestObject('2nd-Test/App_PoC_007/WorkTitle'), 3)

	Mobile.tap(findTestObject('2nd-Test/App_PoC_007/Keyword-Fantasy'), 3)

	Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
	
	for (int i = 0; i < 10; i++) {
		try {
			Mobile.waitForElementPresent(findTestObject('2nd-Test/App_PoC_007/SelectedKeyword-Fantasy'), 3)
	
			break
		}
		catch (Exception e) {
			Mobile.delay(5)
	
			if (i == 8) {
				KeywordUtil.markFailed('Missing Object')
			}
		}
	}

	
	for (int i = 0; i < 10; i++) {
		try {
			Mobile.verifyElementVisible(findTestObject('2nd-Test/App_PoC_007/SelectedKeyword-Fantasy'), 3)
	
			break
		}
		catch (Exception e) {
			Mobile.delay(5)
	
			if (i == 8) {
				KeywordUtil.markFailed('Missing Object')
			}
		}
	}

	
	for (int i = 0; i < 10; i++) {
		try {
			Mobile.waitForElementPresent(findTestObject('2nd-Test/App_PoC_007/ListKeyword-Fantasy'), 3)
	
			break
		}
		catch (Exception e) {
			Mobile.delay(5)
	
			if (i == 8) {
				KeywordUtil.markFailed('Missing Object')
			}
		}
	}

	
	for (int i = 0; i < 10; i++) {
		try {
			Mobile.verifyElementVisible(findTestObject('2nd-Test/App_PoC_007/ListKeyword-Fantasy'), 3)
	
			break
		}
		catch (Exception e) {
			Mobile.delay(5)
	
			if (i == 8) {
				KeywordUtil.markFailed('Missing Object')
			}
		}
	}

	Mobile.pressBack()

	Mobile.tap(findTestObject('2nd-Test/App_PoC_007/Keyword-AnotherWorld'), 3)

	Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

	
	for (int i = 0; i < 10; i++) {
		try {
			Mobile.waitForElementPresent(findTestObject('2nd-Test/App_PoC_007/ListKeyword-AnotherWorld'), 0)
	
			break
		}
		catch (Exception e) {
			Mobile.delay(5)
	
			if (i == 8) {
				KeywordUtil.markFailed('Missing Object')
			}
		}
	}

	
	for (int i = 0; i < 10; i++) {
		try {
			Mobile.verifyElementVisible(findTestObject('2nd-Test/App_PoC_007/ListKeyword-AnotherWorld'), 3)
	
			break
		}
		catch (Exception e) {
			Mobile.delay(5)
	
			if (i == 8) {
				KeywordUtil.markFailed('Missing Object')
			}
		}
	}

	Mobile.pressBack()

	Mobile.tap(findTestObject('2nd-Test/App_PoC_007/Keyword-Possession'), 3)

	Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

	
	for (int i = 0; i < 10; i++) {
		try {
			Mobile.waitForElementPresent(findTestObject('2nd-Test/App_PoC_007/ListKeyword-Possession'), 3)
	
			break
		}
		catch (Exception e) {
			Mobile.delay(5)
	
			if (i == 8) {
				KeywordUtil.markFailed('Missing Object')
			}
		}
	}

	
	for (int i = 0; i < 10; i++) {
		try {
			Mobile.verifyElementVisible(findTestObject('2nd-Test/App_PoC_007/ListKeyword-Possession'), 3)
	
			break
		}
		catch (Exception e) {
			Mobile.delay(5)
	
			if (i == 8) {
				KeywordUtil.markFailed('Missing Object')
			}
		}
	}

	Mobile.pressBack()

	Mobile.tap(findTestObject('2nd-Test/App_PoC_007/Keyword-Misunderstanding'), 3)

	Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

	
	for (int i = 0; i < 10; i++) {
		try {
			Mobile.waitForElementPresent(findTestObject('2nd-Test/App_PoC_007/Keyword-Misunderstanding'), 3)
	
			break
		}
		catch (Exception e) {
			Mobile.delay(5)
	
			if (i == 8) {
				KeywordUtil.markFailed('Missing Object')
			}
		}
	}

	
//	for (int i = 0; i < 10; i++) {
//		try {
//			Mobile.verifyElementVisible(findTestObject('2nd-Test/App_PoC_007/ListKeyword-Misunderstanding'), 3)
//	
//			break
//		}
//		catch (Exception e) {
//			Mobile.delay(5)
//	
//			if (i == 8) {
//				KeywordUtil.markFailed('Missing Object')
//			}
//		}
//	}
	
	Mobile.pressBack()
	Mobile.pressBack()
}
catch (Exception e) {
	KeywordUtil.markFailed("Test Failed: ${e.message}")
}
finally {
	Mobile.closeApplication()
}