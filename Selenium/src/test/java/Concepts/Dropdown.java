package Concepts;

import org.openqa.selenium.support.ui.ExpectedConditions;

import Reuse.Reusemethod;

public class Dropdown extends Reusemethod {

	public static void main(String[] args) throws InterruptedException {

		Reusemethod ram = new Reusemethod();
		ram.setup("https://letcode.in/dropdowns");

		ram.selectbyvalue("//select[@id='fruits']", "0");

		Thread.sleep(30);

		ram.selectbyvalue("//select[@id='fruits']", "1");

		Thread.sleep(30);

		ram.selectbyvalue("//select[@id='fruits']", "2");

		Thread.sleep(30);

		ram.selectbyvalue("//select[@id='fruits']", "3");

		Thread.sleep(30);

		ram.selectbyvalue("//select[@id='fruits']", "4");

		Thread.sleep(30);

		ram.selectbyvisibletext("//select[@id='fruits']", "Apple");
		Thread.sleep(30);

		ram.selectbyvisibletext("//select[@id='fruits']", "Mango");
		Thread.sleep(30);

		ram.selectbyvisibletext("//select[@id='fruits']", "Orange");
		Thread.sleep(30);

		ram.selectbyvisibletext("//select[@id='fruits']", "Banana");
		Thread.sleep(30);

		ram.selectbyvisibletext("//select[@id='fruits']", "Pine Apple");
		Thread.sleep(30);

		

		ram.selectbyvisibletext("//select[@id='lang']", "JavaScript");
		Thread.sleep(30);

		ram.selectbyvisibletext("//select[@id='lang']", "Java");
		Thread.sleep(30);

		ram.selectbyvisibletext("//select[@id='lang']", "Python");
		Thread.sleep(30);

		

		

		ram.selectbyvalue("//select[@id='country']", "Argentina");

		Thread.sleep(30);

		ram.selectbyvalue("//select[@id='country']", "Bolivia");

		Thread.sleep(30);

		ram.selectbyvalue("//select[@id='country']", "India");

		Thread.sleep(30);

		
		ram.selectbyvalue("//select[@id='country']", "Paraguay");

		Thread.sleep(30);
		
		ram.selectbyvalue("//select[@id='country']", "Peru");

		Thread.sleep(30);
		

		ram.selectbyvalue("//select[@id='country']", "Suriname");

		Thread.sleep(30);
		
		ram.selectbyvalue("//select[@id='country']", "Uruguay");

		Thread.sleep(30);
		
		ram.selectbyvalue("//select[@id='country']", "Venezuela");

		Thread.sleep(30);
	}

}
