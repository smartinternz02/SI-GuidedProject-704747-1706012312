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
/*
 * WebUI.openBrowser('')
 * 
 * WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')
 * 
 * WebUI.click(findTestObject('Object
 * Repository/TC_TL_Appointment_Confirmation/Page_CURA Healthcare Service/a_Make
 * Appointment'))
 * 
 * WebUI.setText(findTestObject('Object
 * Repository/TC_TL_Appointment_Confirmation/Page_CURA Healthcare
 * Service/input_username'), 'John Doe')
 * 
 * WebUI.setText(findTestObject('Object
 * Repository/TC_TL_Appointment_Confirmation/Page_CURA Healthcare
 * Service/input_password'), 'ThisIsNotAPassword')
 * 
 * WebUI.click(findTestObject('Object
 * Repository/TC_TL_Appointment_Confirmation/Page_CURA Healthcare
 * Service/button_Login'))
 * 
 */WebUI.selectOptionByValue(findTestObject('Object Repository/TC_TL_Appointment_Confirmation/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/TC_TL_Appointment_Confirmation/Page_CURA Healthcare Service/label_Apply for hospital readmission'))

WebUI.click(findTestObject('Object Repository/TC_TL_Appointment_Confirmation/Page_CURA Healthcare Service/input_programs'))

WebUI.click(findTestObject('Object Repository/TC_TL_Appointment_Confirmation/Page_CURA Healthcare Service/input_visit_date'))

WebUI.click(findTestObject('Object Repository/TC_TL_Appointment_Confirmation/Page_CURA Healthcare Service/td_1'))

WebUI.setText(findTestObject('Object Repository/TC_TL_Appointment_Confirmation/Page_CURA Healthcare Service/textarea_comment'), 
    'Cold')

WebUI.click(findTestObject('Object Repository/TC_TL_Appointment_Confirmation/Page_CURA Healthcare Service/button_Book Appointment'))

/*
 * WebUI.click(findTestObject('Object
 * Repository/TC_TL_Appointment_Confirmation/Page_CURA Healthcare
 * Service/h2_Appointment Confirmation'))
 * 
 * WebUI.click(findTestObject('Object
 * Repository/TC_TL_Appointment_Confirmation/Page_CURA Healthcare
 * Service/p_Please be informed that your appointment _11813a'))
 * 
 * WebUI.click(findTestObject('Object
 * Repository/TC_TL_Appointment_Confirmation/Page_CURA Healthcare Service/i_fa
 * fa-bars'))
 * 
 * WebUI.click(findTestObject('Object
 * Repository/TC_TL_Appointment_Confirmation/Page_CURA Healthcare
 * Service/a_Logout'))
 * 
 * WebUI.closeBrowser()
 */

