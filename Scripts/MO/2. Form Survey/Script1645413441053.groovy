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

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathmobilesurvey) + 'Form Survey 1') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Form Survey/android.widget.LinearLayout'), 0)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathmobilesurvey) + 'Form Survey 2') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Form Survey/android.widget.EditText - Mobile ID'), findTestData('MO').getObjectValue(
        'MobileID', 1), 0)

Mobile.setText(findTestObject('Object Repository/Form Survey/android.widget.EditText - Nama Konsumen'), findTestData('MO').getObjectValue(
        'Nama', 1), 0)

Mobile.setText(findTestObject('Object Repository/Form Survey/android.widget.EditText - No KTP'), findTestData('MO').getObjectValue(
        'Ktp', 1), 0)

Mobile.setText(findTestObject('Object Repository/Form Survey/android.widget.EditText - No HP'), findTestData('MO').getObjectValue(
        'Hp', 1), 0)

Mobile.setText(findTestObject('Object Repository/Form Survey/android.widget.EditText - No Telp'), findTestData('MO').getObjectValue(
        'Tlp', 1), 0)

Mobile.setText(findTestObject('Object Repository/Form Survey/android.widget.EditText - Tempat Lahir'), findTestData('MO').getObjectValue(
        'Tempat Lahir', 1), 0)

Mobile.tap(findTestObject('Object Repository/Form Survey/android.widget.EditText - Tanggal Lahir'), 0)

Mobile.tap(findTestObject('Object Repository/Form Survey/android.widget.TextView - 2005'), 0)

Mobile.scrollToText('1990')

Mobile.tap(findTestObject('Object Repository/Form Survey/android.widget.TextView - 1990'), 0)

Mobile.tap(findTestObject('Object Repository/Form Survey/android.view.View - 11'), 0)

Mobile.tap(findTestObject('Object Repository/Form Survey/android.widget.Button - OK'), 0)

Mobile.setText(findTestObject('Object Repository/Form Survey/android.widget.EditText - Nama Pasangan'), findTestData('MO').getObjectValue(
        'Nama Pas', 1), 0)

Mobile.setText(findTestObject('Object Repository/Form Survey/android.widget.EditText - Jumlah Tanggungan'), findTestData(
        'MO').getObjectValue('JumlahT', 1), 0)

Mobile.setText(findTestObject('Object Repository/Form Survey/android.widget.EditText - Nama Ibu Kandung'), findTestData(
        'MO').getObjectValue('Nama Ibu', 1), 0)

Mobile.tap(findTestObject('Object Repository/Form Survey/android.widget.TextView - Informasi Rumah Konsumen'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathmobilesurvey) + 'Form Survey 3') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Submit')

Mobile.setText(findTestObject('Object Repository/Form Survey/android.widget.EditText - Alamat Rumah'), findTestData('MO').getObjectValue(
        'Alamat Rumah', 1), 0)

Mobile.setText(findTestObject('Object Repository/Form Survey/android.widget.EditText - RT'), findTestData('MO').getObjectValue(
        'Rt', 1), 0)

Mobile.setText(findTestObject('Object Repository/Form Survey/android.widget.EditText - RW'), findTestData('MO').getObjectValue(
        'Rw', 1), 0)

Mobile.setText(findTestObject('Object Repository/Form Survey/android.widget.EditText - Kelurahan'), findTestData('MO').getObjectValue(
        'Kelurahan', 1), 0)

Mobile.setText(findTestObject('Object Repository/Form Survey/android.widget.EditText - Kecamatan'), findTestData('MO').getObjectValue(
        'Kecamatan', 1), 0)

Mobile.setText(findTestObject('Object Repository/Form Survey/android.widget.EditText - KabupatenKota'), findTestData('MO').getObjectValue(
        'Kabupaten', 1), 0)

Mobile.setText(findTestObject('Object Repository/Form Survey/android.widget.EditText - Kode Pos'), findTestData('MO').getObjectValue(
        'Kode Pos', 1), 0)

Mobile.tap(findTestObject('Object Repository/Form Survey/android.widget.TextView - Informasi UsahaKantor Konsumen'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathmobilesurvey) + 'Form Survey 4') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Submit')

Mobile.setText(findTestObject('Object Repository/Form Survey/android.widget.EditText - Nama Tempat Usaha (1)'), findTestData(
        'MO').getObjectValue('Nama Perusahaan', 1), 0)

Mobile.setText(findTestObject('Object Repository/Form Survey/android.widget.EditText - Alamat Tempat Usaha'), findTestData(
        'MO').getObjectValue('Alamat Perusahaan', 1), 0)

Mobile.setText(findTestObject('Object Repository/Form Survey/android.widget.EditText - RT (1)'), findTestData('MO').getObjectValue(
        'Rt P', 1), 0)

Mobile.setText(findTestObject('Object Repository/Form Survey/android.widget.EditText - RW (1)'), findTestData('MO').getObjectValue(
        'Rw P', 1), 0)

Mobile.setText(findTestObject('Object Repository/Form Survey/android.widget.EditText - Kelurahan (1)'), findTestData('MO').getObjectValue(
        'Kelurahan P', 1), 0)

Mobile.setText(findTestObject('Object Repository/Form Survey/android.widget.EditText - Kecamatan (1)'), findTestData('MO').getObjectValue(
        'Kecamatan P', 1), 0)

Mobile.setText(findTestObject('Object Repository/Form Survey/android.widget.EditText - KabupatenKota (1)'), findTestData(
        'MO').getObjectValue('Kabupaten P', 1), 0)

Mobile.setText(findTestObject('Object Repository/Form Survey/android.widget.EditText - Kode Pos (1)'), findTestData('MO').getObjectValue(
        'Kode Pos P', 1), 0)

Mobile.tap(findTestObject('Object Repository/Form Survey/android.widget.TextView - Informasi Mobil'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathmobilesurvey) + 'Form Survey 5') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Submit')

Mobile.setText(findTestObject('Object Repository/Form Survey/android.widget.EditText - Merk Mobil'), findTestData('MO').getObjectValue(
        'Merk M', 1), 0)

Mobile.setText(findTestObject('Object Repository/Form Survey/android.widget.EditText - Tipe Mobil'), findTestData('MO').getObjectValue(
        'Tipe M', 1), 0)

Mobile.setText(findTestObject('Object Repository/Form Survey/android.widget.EditText - Tahun Mobil'), findTestData('MO').getObjectValue(
        'Tahun M', 1), 0)

Mobile.setText(findTestObject('Object Repository/Form Survey/android.widget.EditText - Warna Mobil'), findTestData('MO').getObjectValue(
        'Warna M', 1), 0)

Mobile.setText(findTestObject('Object Repository/Form Survey/android.widget.EditText - DealerShowroom'), findTestData('MO').getObjectValue(
        'Dealer', 1), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathmobilesurvey) + 'Form Survey 6') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

