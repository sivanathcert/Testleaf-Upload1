package week3Day1;

public class Automation extends MultipleLanguage {

	public static void main(String[] args) {
		
		// Calling Interface Methods
		
		//Automation autoObj = new Automation();
		
		//Below line is to restrict object scopt only with Interface
				//Language autoObj = new Automation();
				Automation autoObj1 = new Automation();
				
				autoObj1.Java();
				autoObj1.Selenium();
				autoObj1.python();
				autoObj1.ruby();
		
		//Below line is to restrict object scopt only with Interface
		//Language autoObj = new Automation();
		
				/*TestTool autoObj1 = new Automation();
		
		autoObj1.Java();
		autoObj1.Selenium();   //This alone will execute
		autoObj1.anonymous(); */
	}

	public void Selenium() {
		// TestTool Interface's method block
		System.out.println("TestTool Interface --- Selemium is used as Automation Testing Tool \n");
	}

	public void Java() {
		// Language Interface's method block
		System.out.println("Language Interface ---- Java is used to build Selemium Automation\n");
		
	}

	@Override
	public void python() {
		// Abstarct Class Method
		
		System.out.println("This is Abstract class Method ---- Python()");
		
	}

}
