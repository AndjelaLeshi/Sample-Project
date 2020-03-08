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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://time.mk/')

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://time.mk/')

WebUI.click(findTestObject('Object Repository/Page_  TIMEmk/center_'))

WebUI.click(findTestObject('Object Repository/Page_  TIMEmk/center__1'))

WebUI.click(findTestObject('Object Repository/Page_  TIMEmk/center__1_2'))

WebUI.click(findTestObject('Object Repository/Page_  TIMEmk/center__1_2_3'))

WebUI.click(findTestObject('Object Repository/Page_  TIMEmk/center__1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Page_  TIMEmk/center_ (1)'))

WebUI.click(findTestObject('Object Repository/Page_   TIMEmk/center_5'))

WebUI.closeBrowser()
WebUI.click(findTestObject('Object Repository/Page_  TIMEmk/center_'))

