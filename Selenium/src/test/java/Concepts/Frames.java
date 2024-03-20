package Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Reuse.Reusemethod;

public class Frames extends Reusemethod {

	public static void main(String[] args) {
		Reusemethod ram = new Reusemethod();
		ram.setup("https://www.rediff.com/");

		driver.switchTo().frame("moneyiframe");

		WebElement one = driver.findElement(By.xpath("//span[@id='bseindex']"));

		String ppp = one.getText();
		System.out.println(ppp);
		
		WebElement two=driver.findElement(By.xpath("//span[@id='nseindex']"));
		
		String sss=two.getText();
		System.out.println(sss);
	}

}
