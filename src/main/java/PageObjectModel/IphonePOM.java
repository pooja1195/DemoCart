package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IphonePOM {
	public static WebDriver Driver;
	
	private static  By Iphoneinput = By.xpath("//input[@placeholder='Search']");
	private static By clickonIphone = By.xpath("//i[@class='fa fa-search']");
	private static By Iphoneprice = By.xpath("//p[@class='price']");
	private static By Iphoneaddtocart = By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md']/parent::button)[2]");
	
	public IphonePOM(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		Driver = driver2;
	}
	public static WebElement IphoneInput() {
		return Driver.findElement(Iphoneinput);
	}
	public static WebElement ClickonIphone() {
		return Driver.findElement(clickonIphone);
	}
	public static WebElement IphonePrice() {
		return Driver.findElement(Iphoneprice);
	}
	public static WebElement IphoneAddtocart() {
		return Driver.findElement(Iphoneaddtocart);
	}
	
}
