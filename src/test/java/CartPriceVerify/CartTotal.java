package CartPriceVerify;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.CartTotalPOM;
import PageObjectModel.IphonePOM;
import PageObjectModel.SamsungPOM;
import Resources.BaseClass;
import Resources.CommonUtlities;
import Resources.TestData;

public class CartTotal extends BaseClass{
	
	@Test
	public void Cartprice() throws IOException, InterruptedException {
		initializeDriver();
		
//Iphone Code
		IphonePOM POI = new IphonePOM(Driver);
		POI.IphoneInput().sendKeys(TestData.IphoneModel);
		POI.ClickonIphone().click();
		
		CommonUtlities com = new CommonUtlities(Driver);
		com.waits(IphonePOM.Iphoneprice, 20);

//To get Price
		String Iphonep = com.pricecapture(POI.IphonePrice());
		Double Iphonep4 = Double.parseDouble(Iphonep);
		System.out.println(Iphonep4);//123.2 - giving value but with 1digit decimal
		
	  /*String Iphonep1 = IphonePOM.IphonePrice().getText();
		String[] Iphonep2 = Iphonep1.split("\\n"); //splitted with line
		System.out.println(Arrays.toString(Iphonep2));//[$123.20, Ex Tax: $101.00]
		String Iphonep3 = Iphonep2[0].replace("$", "");
		System.out.println(Iphonep3);//123.20
		*/

//code to get Price value with 2digit decimal
		
		
//Add to Cart
		POI.IphoneAddtocart().click();
		
//Samsung code
		SamsungPOM POS = new SamsungPOM(Driver);
		WebElement Search = POS.Samsunginput();
		Search.clear();
		Search.sendKeys(TestData.SamsungModel);
		POS.Samsungsearch().click();
		
		com.waits(SamsungPOM.samsungprice, 20);
		
//Samsung Price
		String Samsungp = com.pricecapture(POS.Samsungprice());
		Double Samsungp4 = Double.parseDouble(Samsungp);
		System.out.println(Samsungp4);//241.99
		
//Add to Cart
		POS.Addsamsungtocart().click();
		Thread.sleep(3000);
		
//Total Cart price
		CartTotalPOM POC = new CartTotalPOM(Driver);
		POC.Clickontotal().click();
		String totalp = com.pricecapture(POC.Gettotalprice());
		Double totalp4 = Double.parseDouble(totalp);
		System.out.println(totalp4);
		

//Verification of Total Price
		double Actualp = Iphonep4+Samsungp4;
		if(Actualp == totalp4) {
			System.out.println("Total price vlaue verified");
		}
		Driver.close();
		
		
	}
}

