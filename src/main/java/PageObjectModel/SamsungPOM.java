package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SamsungPOM {
	public static WebDriver Driver;
	
	private static By samsunginput = By.xpath("//input[@id='input-search']");
	private static By samsungsearch = By.xpath("//input[@id='button-search']");
	public static By samsungprice = By.xpath("(//p[@class='price'])[2]");
	private static By addsamsungtocart = By.xpath("(//i[@class='fa fa-shopping-cart'])[5]/parent::button");
	
	public SamsungPOM(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		Driver = driver2;
	}
	public static WebElement Samsunginput() {
		return Driver.findElement(samsunginput);	
	}
	public static  WebElement Samsungsearch() {
		return Driver.findElement(samsungsearch);	
	}
	public static WebElement Samsungprice() {
		return Driver.findElement(samsungprice);	
	}
	public static WebElement Addsamsungtocart() {
		return Driver.findElement(addsamsungtocart);	
	}
	
	
}
