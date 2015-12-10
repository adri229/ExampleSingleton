package es.uvigo.esei.dagss.acfernandez4.patterns.behavioral.chain.example1;

public class App {

	public static void main(String[] args) {
		Logger log = FileLogger.getInstance(1, null);
		log.log("TSW", 2);
		
//		Logger consoleLogger = ConsoleLogger.getInstance(1, null);
//		consoleLogger.log("DAGSS", 2);

	}

}
