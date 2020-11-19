package week5Homework;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
	}

	@Override
	public void error(String error) {
		String errorMessage = "***" + error + "***"; 
		String asterisks = "*".repeat(errorMessage.length()); 
		System.out.println(asterisks);
		System.out.println();
		System.out.println(errorMessage);
		System.out.println();
		System.out.println(asterisks); 
	}

}
