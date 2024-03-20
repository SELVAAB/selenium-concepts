package Concepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Reuse.Reusemethod;

public class Alerts extends Reusemethod {

	public static void main(String[] args) throws InterruptedException {

		Reusemethod ram = new Reusemethod();
		ram.setup("https://letcode.in/alert");

		ram.click("//button[@id='accept']");

		// simple alert
		Alert alt = driver.switchTo().alert();
		wait.until(ExpectedConditions.alertIsPresent());

		alt.accept();

		// confirm alert

		ram.click("//button[@id='confirm']");

		Alert alt1 = driver.switchTo().alert();
		String name = alt1.getText();
		System.out.println(name);
		alt1.dismiss();

		// prompt alert

		ram.click("//button[@id='prompt']");

		Alert alt2 = driver.switchTo().alert();
		alt2.sendKeys("brazil");
		String wewe = alt2.getText();
		System.out.println(wewe);
		Thread.sleep(30);
		alt2.sendKeys("brazil");
		Thread.sleep(30);
		alt2.accept();

		WebElement two = driver.findElement(By.xpath("//div[@class='notification is-info']"));

		String one = two.getText();
		System.out.println(one);
	}

}
