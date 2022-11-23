package Resources;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtlities {
	public static WebDriver Driver;

public CommonUtlities(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	Driver=driver2;
	}

	//Code to get final Price
	public static String pricecapture(WebElement getPrice) {
	String Mobilep1 = getPrice.getText(); 
	String[] Mobilep2 = Mobilep1.split("\\n"); //splitted with line
	System.out.println(Arrays.toString(Mobilep2));//[$123.20, Ex Tax: $101.00]
	String Mobilep3 = Mobilep2[0].replace("$", "");
	System.out.println(Mobilep3);//123.20
/*	Double Mobilep4 = Double.parseDouble(Mobilep3);
	System.out.println(Mobilep4);//123.2 - giving value but with 1digit decimal*/
	return Mobilep3;

		}
		
	public static void waits(By step, int time) {
		WebDriverWait wb = new WebDriverWait(Driver, Duration.ofSeconds(time));
		wb.until(ExpectedConditions.visibilityOfElementLocated(step));
	}
	}

