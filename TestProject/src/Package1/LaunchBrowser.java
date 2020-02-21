package Package1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) 
	{
		String key=("webdriver.gecko.driver");
		String value=("./exefiles/geckodriver.exe");
		System.setProperty(key,value);
		FirefoxDriver driver= new FirefoxDriver();
		
		

	}

}
