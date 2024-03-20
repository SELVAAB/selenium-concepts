package Concepts;

import Reuse.Reusemethod;

public class Browser extends Reusemethod {

	public static void main(String[] args) throws InterruptedException {

		Reusemethod ram = new Reusemethod();
		ram.setup("https://www.saucedemo.com/v1/");

		ram.sendykeys("//input[@id='user-name']", "standard_user");

		ram.sendykeys("//input[@id='password']", "secret_sauce");

		ram.click("//input[@id='login-button']");
		
		Thread.sleep(30);

		ram.selectbyvalue("//select[@class='product_sort_container']", "lohi");

		Thread.sleep(30);

		ram.selectbyvalue("//select[@class='product_sort_container']", "az");

		Thread.sleep(30);

		ram.selectbyvalue("//select[@class='product_sort_container']", "za");

		Thread.sleep(30);

		ram.selectbyvalue("//select[@class='product_sort_container']", "hilo");

		Thread.sleep(30);
	}

}
