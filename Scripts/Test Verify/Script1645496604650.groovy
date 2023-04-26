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

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathmobilesurvey) + 'Survey Kendaraan 1') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/History_SurveyKendaraan/android.widget.LinearLayout'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathmobilesurvey) + 'Survey Kendaraan 2') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/History_SurveyKendaraan/android.widget.LinearLayout (1)'), 0)

Mobile.setText(findTestObject('Object Repository/History_SurveyKendaraan/android.widget.EditText - No Polisi'), findTestData(
        'No_Polisi').getObjectValue('No_Polisi', 6), 0)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathmobilesurvey) + 'Survey Kendaraan 3') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/History_SurveyKendaraan/android.widget.Button - SEARCH'), 0)

CucumberKW.comment('Verify Approval')

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Verfy Element/Aproval/android.widget.EditText - Approved'), findTestData('Data_History_Verify').getObjectValue(
        'Status', 1), FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Verfy Element/Aproval/MS History - - Aproval Cabang1'), 'KELAPA GADING MOBIL BEKAS II')

Mobile.verifyElementText(findTestObject('Verfy Element/Aproval/MS History - - Tanggal Aproval'), '21-Feb-2022')

Mobile.verifyElementText(findTestObject('Verfy Element/Aproval/MS History - - Aproval Penilaian Akhir Maskapai'), 'Layak')

CucumberKW.comment('Verify Info Survey')

Mobile.verifyElementText(findTestObject('Verfy Element/Info Survey/MS History - - Info Survey -- Nama Maskapai'), 'Aswata')

Mobile.verifyElementText(findTestObject('Verfy Element/Info Survey/MS History - - Info Survey -- Tanggal Survey'), '12-Feb-2022')

Mobile.verifyElementText(findTestObject('Verfy Element/Info Survey/MS History - - Info Survey -- Jam Survey'), '13:19')

Mobile.verifyElementText(findTestObject('Verfy Element/Info Survey/MS History - - Info Survey -- Status Survey'), 'Resurvey')

Mobile.verifyElementText(findTestObject('Verfy Element/Info Survey/MS History - - Info Survey -- Lokasi Survey'), 'Kantor BCAF - Kantor Pusat BCAF')

Mobile.verifyElementText(findTestObject('Verfy Element/Info Survey/MS History - - Info Survey -- Alamat Survey'), 'Jl Pondok Indah Raya')

Mobile.verifyElementText(findTestObject('Verfy Element/Info Survey/MS History - - Info Survey -- Keterangan Tambahan'), 
    'Kendaraan Bukan Bekas Banjir')

Mobile.verifyElementText(findTestObject('Verfy Element/Info Survey/MS History - - Info Survey -- Jarak Tempuh'), '2,500 KM')

Mobile.verifyElementText(findTestObject('Verfy Element/Info Survey/MS History - - Info Survey -- Kondisi Mesin Saat Starter'), 
    'Hidup')

Mobile.verifyElementText(findTestObject('Verfy Element/Info Survey/MS History - - Info Survey -- Kondisi Interior'), 'Baik')

Mobile.verifyElementText(findTestObject('Verfy Element/Info Survey/MS History - - Info Survey -- Kondisi Mobil'), 'Baik')

Mobile.verifyElementText(findTestObject('Verfy Element/Info Survey/MS History - - Info Survey -- Nomor Rangka'), 'Ya')

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathmobilesurvey) + 'Survey Kendaraan 4') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Data Kendaraan')

CucumberKW.comment('Verify Data Kendaraan')

Mobile.verifyElementText(findTestObject('Verfy Element/Data Kendaraan/MS History - - Data Kendaraan -- Merk, Tipe, Jenis'), 
    'HON, HONDA NEW ODYSSEY 2.4 M TYPE, Passenger')

Mobile.verifyElementText(findTestObject('Verfy Element/Data Kendaraan/MS History - - Data Kendaraan -- No Polisi'), 'B 777 B')

Mobile.verifyElementText(findTestObject('Verfy Element/Data Kendaraan/MS History - - Data Kendaraan -- Tahun Pembuatan'), 
    '2020')

Mobile.verifyElementText(findTestObject('Verfy Element/Data Kendaraan/MS History - - Data Kendaraan -- No Rangka'), 'BA1234567')

Mobile.verifyElementText(findTestObject('Verfy Element/Data Kendaraan/MS History - - Data Kendaraan -- No Mesin'), 'YY5890')

Mobile.verifyElementText(findTestObject('Verfy Element/Data Kendaraan/MS History - - Data Kendaraan -- Warna'), 'SIlver')

Mobile.verifyElementText(findTestObject('Verfy Element/Data Kendaraan/MS History - - Data Kendaraan -- Transmisi'), 'M/T')

Mobile.verifyElementText(findTestObject('Verfy Element/Data Kendaraan/MS History - - Data Kendaraan -- Bahan Bakar'), 'Bensin')

Mobile.verifyElementAttributeValue(findTestObject(null), 'STNK', '0', 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathmobilesurvey) + 'Survey Kendaraan 5') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/History_SurveyKendaraan/android.widget.TextView - Surat Kendaraan'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathmobilesurvey) + 'Survey Kendaraan 6') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Kondisi Kendaraan')

Mobile.tap(findTestObject('Object Repository/History_SurveyKendaraan/android.widget.TextView - Kondisi Kendaraan'), 0)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathmobilesurvey) + 'Survey Kendaraan 7') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Foto Mobil')

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathmobilesurvey) + 'Survey Kendaraan 8') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/History_SurveyKendaraan/android.widget.TextView - Foto Mobil'), 0)

Mobile.scrollToText('Kiri Depan')

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathmobilesurvey) + 'Survey Kendaraan 9') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

