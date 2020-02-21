package Package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory 
{
		static WebDriver driver;
		public static WebDriver getdriver(String BrowserName)
		{
			if(BrowserName.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
				driver= new ChromeDriver();
				System.out.println("Chrome browser launched");
			}
			else if(BrowserName.equalsIgnoreCase("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");
				driver= new FirefoxDriver();
				System.out.println("Firefox Browser launched");
			}
			else if(BrowserName.equalsIgnoreCase("ie"))
			{
				System.setProperty("webdriver.ie.driver", "./exefiles/IEDriverServer.exe");
				driver= new InternetExplorerDriver();
				System.out.println("IE browser launched");
			}
			return driver;
			
		}

	
	public static class LaunchDriver{
		public static void main(String[] args)
		{
			BrowserFactory.getdriver("firefox");
		}
		
	}
}


