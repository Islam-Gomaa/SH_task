package PagesOfFirstTask;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Order_Summary {

	public void order(WebDriver driver) throws IOException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {

			// Order Summary

			Thread.sleep(100);

			// Convert web driver object to TakeScreenshot
			TakesScreenshot scrShot = (TakesScreenshot) driver;

			// Call getScreenshotAs method to create image file
			File src = scrShot.getScreenshotAs(OutputType.FILE);

			// Move image file to new destination
			org.openqa.selenium.io.FileHandler.copy(src, new File(".\\order summary.png"));

			Thread.sleep(500);

			// Type of payment
			WebElement payment_type = driver.findElement(By.className("page-subheading"));
			System.out.println("Type of payment is  " + payment_type.getText());

			// click on I confirm my order
			By confirm_order = By.xpath("//*[@id=\"cart_navigation\"]/button/span");
			driver.findElement(confirm_order).click();

			Thread.sleep(100);

		} catch (InterruptedException ex) {
			Logger.getLogger(Order_Summary.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

}
