package investigation

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.annotation.Keyword

class MyKeywords {

	@Keyword 
	static void click(TestObject to) {
		System.out.println "click fired with ${to}"
	}

	@Keyword 
	static void setText(TestObject to, String text) {
		System.out.println "setText fired with ${to}, text=${text}"
	}

	@Keyword 
	static String getText(TestObject to) {
		System.out.println "getText fired with ${to}"
	}

	@Keyword 
	static String getAttribute(TestObject to, String name) {
		System.out.println "getAttribute fired with ${to}, name=${name}"
	}
}