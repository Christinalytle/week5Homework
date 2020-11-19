package week5Homework;

public class App {

	public static void main(String[] args) {
		
		Logger asteriskLogger = new AsteriskLogger(); 
		
		Logger spacedLogger = new SpacedLogger(); 
		
		asteriskLogger.log("Good Morning");
		
		asteriskLogger.error("Good Morning");
		
		spacedLogger.log("Morning"); 
		
		spacedLogger.error("Morning");

	}

}
