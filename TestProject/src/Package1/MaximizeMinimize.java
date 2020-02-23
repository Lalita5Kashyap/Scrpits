package Package1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximizeMinimize {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("window is maximized");
		Dimension dim = new Dimension(250, 0);
		driver.manage().window().setSize(dim);
		System.out.println("window size is set");
		Point pt = new Point(300,250);
		driver.manage().window().setPosition(pt);
		System.out.println("Window location is set");
		

	}

}
