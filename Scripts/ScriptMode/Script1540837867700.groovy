import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable


WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.gmail.com')
WebUI.setText(findTestObject('Object Repository/ManualModeOR/Page_Gmail/input_Continue to Gmail_identi'), 'qa.gauravsingh01@gmail.com')
WebUI.click(findTestObject('Object Repository/ManualModeOR/Page_Gmail/span_next'))
WebUI.setText(findTestObject('Object Repository/ManualModeOR/Page_Gmail/input_Too many failed attempts'), 'ronnit1029')
WebUI.click(findTestObject('recordGaurav/Page_Gmail/last_NextButton'))
WebUI.closeBrowser()