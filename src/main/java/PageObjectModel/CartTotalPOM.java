package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartTotalPOM {
	public static WebDriver Driver;
	
	private static By clickontotal = By.xpath("//span[@id='cart-total']");
	private static By gettotalprice = By.xpath("//table[@class='table table-bordered']/tbody/tr[4]/td[2]");
	
	public CartTotalPOM(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		Driver = driver2;
	}
	public static WebElement Clickontotal() {
		return Driver.findElement(clickontotal);
	}
	public static WebElement Gettotalprice() {
		return Driver.findElement(gettotalprice);
	}
	
}
