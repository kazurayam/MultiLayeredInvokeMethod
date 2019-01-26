package investigation

import com.kms.katalon.core.annotation.Keyword

class Influencer {
	private static List<String> influencedKeywords = [
		'click',
		'getAttribute',
		'getText',
		'setText'
	]
	@Keyword static void pandemic() {
		System.out.println "*** pandemic() was triggered!"
		MyKeywords.metaClass.invokeMethod = { String name, args ->
			if (name in influencedKeywords) {
				System.out.println("*** ${name} is in the list")
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


