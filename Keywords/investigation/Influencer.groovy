package investigation

import com.kms.katalon.core.annotation.Keyword

class Influencer {
	private static List<String> targetKeywords = [
		'click',
		'getAttribute',
		'getText',
		'setText'
	]
	@Keyword
	static void influence() {
		System.out.println "*** influencing ${targetKeywords}"
		MyKeywords.metaClass.static.invokeMethod = { String name, Object args ->
			if (name in targetKeywords) {
				System.out.println("*** ${name}() is invoked")
			}
			def result
			try {
				result = delegate.metaClass.getMetaMethod(name, args).invoke(delegate, args)
			} catch(Exception e) {
				System.out.println("Handling exception for method $name")
			}
			return result
		}
	}
}


