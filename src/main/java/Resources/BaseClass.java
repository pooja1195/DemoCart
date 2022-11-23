package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver Driver;
	public Properties prop;
	
	public void initializeDriver() throws IOException {
	FileInputStream fis = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\MavenMobilePrice\\src\\main\\java\\Resources\\data.properties");
	prop = new Properties();
	prop.load(fis);
	String browsername = prop.getProperty("browser");
	
	if (browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.get("https://naveenautomationlabs.com/opencart/");
	}
	else if (browsername.equalsIgnoreCase("edge")) {
		//edge code
	}
	else if (browsername.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		//firefoxcode
	}
	}
	
	
}
