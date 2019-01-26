import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

investigation.Influencer.influence()

TestObject to = findTestObject('Page_CURA Healthcare Service_top/a_Make Appointment')
System.out.println "to is ${to}"

investigation.MyKeywords.click(to)
investigation.MyKeywords.setText(to, "Good morning!")
def t = investigation.MyKeywords.getText(to)

 