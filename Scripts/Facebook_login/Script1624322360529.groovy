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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.setText(findTestObject('Object Repository/Page_Facebook - Log In or Sign Up/input_Connect with friends and the world ar_a26e6d'), 
    'themanthanbajaj')

WebUI.click(findTestObject('Object Repository/Page_Facebook - Log In or Sign Up/div_Connect with friends and the world arou_cc5f94'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Facebook - Log In or Sign Up/input_Connect with friends and the world ar_060a06'), 
    'v/3szTTR6dNHOM8+LV7BtA==')

WebUI.click(findTestObject('Object Repository/Page_Facebook - Log In or Sign Up/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/div_Introducing cross-app messagingYou can _593c6b'))

WebUI.click(findTestObject('Object Repository/Page_(11) Facebook/i_MaNthan_hu5pjgll lzf7d6o1'))

WebUI.click(findTestObject('Object Repository/Page_(11) Facebook/span_Log Out'))

WebUI.closeBrowser()

