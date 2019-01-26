import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject

TestObject newTestObject(String expression) {
	TestObject to = new TestObject()
	to.addProperty("xpath", ConditionType.EQUALS, expression)
	return to
}

CustomKeywords.'investigation.Influencer.pandemic'()


CustomKeywords.'investigation.MyKeywords.click'(newTestObject("//*[@id='Doraemon']"))
CustomKeywords.'investigation.MyKeywords.setText'(newTestObject("//*[@id='Doraemon']"), "Good morning!")
def t = CustomKeywords.'investigation.MyKeywords.getText'(newTestObject("//*[@id='Doraemon']"))

 