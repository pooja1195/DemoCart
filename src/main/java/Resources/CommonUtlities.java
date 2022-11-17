package Resources;

import java.util.Arrays;

import org.openqa.selenium.WebElement;

import PageObjectModel.IphonePOM;

public class CommonUtlities {

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
		
		
	}

