package Concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import Reuse.Reusemethod;

public class Window extends Reusemethod {

	public static void main(String[] args) throws InterruptedException {

		Reusemethod ram = new Reusemethod();
		ram.setup("https://www.irctc.co.in/nget/train-search");

		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();

		driver.findElement(By.xpath("//span[@class='allcircle circletwo']")).click();

		driver.findElement(By.xpath("//span[@class='railDrishti fa fa-line-chart']")).click();

		driver.findElement(By.xpath("//label[normalize-space()='HOLIDAY PACKAGES']")).click();

		driver.findElement(By.xpath("//span[@class='allcircle circleseven']")).click();

		String windowhandle = driver.getWindowHandle();

		System.out.println("windowhandle" + driver.getTitle() + windowhandle);

		Set<String> windowhandles = driver.getWindowHandles();

		System.out.println("windowhandles" + driver.getTitle() + windowhandles);

		List<String> tab = new ArrayList<String>(windowhandles);
		driver.switchTo().window(tab.get(0));
		System.out.println("windowhandles" + driver.getTitle() + windowhandles + driver.getCurrentUrl());

		driver.switchTo().window(tab.get(1));
		System.out.println("windowhandles" + driver.getTitle() + windowhandles + driver.getCurrentUrl());

		driver.switchTo().window(tab.get(2));
		System.out.println("windowhandles" + driver.getTitle() + windowhandles + driver.getCurrentUrl());

		driver.switchTo().window(tab.get(3));
		System.out.println("windowhandles" + driver.getTitle() + windowhandles + driver.getCurrentUrl());

		driver.switchTo().window(tab.get(4));
		System.out.println("windowhandles" + driver.getTitle() + windowhandles + driver.getCurrentUrl());

		driver.switchTo().window(tab.get(5));
		System.out.println("windowhandles" + driver.getTitle() + windowhandles + driver.getCurrentUrl());

		driver.switchTo().window(tab.get(3));
		System.out.println("windowhandles" + driver.getTitle() + windowhandles + driver.getCurrentUrl());

		Thread.sleep(1000);

	}

}
