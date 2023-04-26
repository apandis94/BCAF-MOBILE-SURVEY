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

'Get directory project'
String baseDir = System.getProperty('user.dir')

Mobile.startExistingApplication('com.bcaf.mobilesurvey')

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathmobilesurvey) + 'Survey Kendaraan 5.1') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Submit/android.widget.LinearLayout'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathmobilesurvey) + 'Survey Kendaraan 5.2') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Submit/android.widget.LinearLayout (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Submit/android.widget.EditText - No Polisi'), findTestData('No_Polisi').getObjectValue(
        'No_Polisi', 6), 0)

Mobile.tap(findTestObject('Object Repository/Submit/android.widget.Spinner'), 0)

Mobile.tap(findTestObject('Object Repository/Submit/android.widget.CheckedTextView - Aswata'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathmobilesurvey) + 'Survey Kendaraan 5.3') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Submit/android.widget.Button - SEARCH'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathmobilesurvey) + 'Survey Kendaraan 4.4 ') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Surat Kendaraan')

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathmobilesurvey) + 'Survey Kendaraan 4.5') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/History_SurveyKendaraan/android.widget.TextView - Surat Kendaraan'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathmobilesurvey) + 'Survey Kendaraan 4.6') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/History_SurveyKendaraan/android.widget.TextView - Kondisi Kendaraan'), 0)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathmobilesurvey) + 'Survey Kendaraan 4.7') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Wiper')

Mobile.tap(findTestObject('Object Repository/History_SurveyKendaraan/android.widget.TextView - Foto Mobil'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathmobilesurvey) + 'Survey Kendaraan 4.8') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Kiri Depan')

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathmobilesurvey) + 'Survey Kendaraan 4.9') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('SUBMIT')

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Status/android.widget.RadioButton - Not Approved'), 0)

Mobile.setText(findTestObject('Status/android.widget.EditText - Komentar (Set Text)'), findTestData('Status_Submit').getObjectValue(
        'Status', 3), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathmobilesurvey) + 'Survey Kendaraan 5.10') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.checkElement(findTestObject('Status/android.widget.Button - SUBMIT'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathmobilesurvey) + 'Survey Kendaraan 5.11') + '.png', FailureHandling.STOP_ON_FAILURE)

