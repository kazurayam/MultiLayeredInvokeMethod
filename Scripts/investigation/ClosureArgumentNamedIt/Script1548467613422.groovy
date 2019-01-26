def closure = { println "i am a closure with arg ${it}" }
closure("foo")

def closureNoArg = { -> print "i am a closure without args" }   // a closure without args

