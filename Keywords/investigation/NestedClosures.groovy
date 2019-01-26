package investigation

public class NestedClosures {

	private static List<Closure> scenario = [
		{ -> println "prologue" },
		{ -> println "scene1" },
		{ -> println "scene2" },
		{ -> println "scene3" },
		{ -> println "epilogue" }
	]

	static void run() {
		for (int i = 0; i < scenario.size(); i++) {
			scenario[i]()
		}
	}
}
