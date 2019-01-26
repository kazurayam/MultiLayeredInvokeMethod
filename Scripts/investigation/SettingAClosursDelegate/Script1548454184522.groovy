

// http://mrhaki.blogspot.com/2009/11/groovy-goodness-setting-closures.html

// Simple class
class Post {
	int count
	def info() {
		"This is Groovy Goodness post #${count}!"
	}
}

// Script variable and method
count = 0
def info() {
	"Count value is ${count}."
}

// Closure to increment a count variable and invoke a info() method
def printInfo = {
	count++
	info()
}

assert "Count value is 1." == printInfo()

printInfo.resolveStrategy = Closure.DELEGATE_FIRST  // Change closure resolver so first the delegate is used.

// ************************ this is magical **************************
printInfo.delegate = new Post(count: 100)  // Set delegate to Post object

assert "This is Groovy Goodness post #101!" == printInfo()
