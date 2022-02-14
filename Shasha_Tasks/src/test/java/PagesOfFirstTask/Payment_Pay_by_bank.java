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

public class Payment_Pay_by_bank {

	public void payment(WebDriver driver) throws IOException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {

			// Shipping tab

			Thread.sleep(100);

			// Convert web driver object to TakeScreenshot
			TakesScreenshot scrShot = (TakesScreenshot) driver;

			// Call getScreenshotAs method to create image file
			File src = scrShot.getScreenshotAs(OutputType.FILE);

			// Move image file to new destination
			org.openqa.selenium.io.FileHandler.copy(src, new File(".\\Payment.png"));

			Thread.sleep(500);

			// Pay by bank wire
			By Pay_by_bank = By.className("bankwire");
			driver.findElement(Pay_by_bank).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(Payment_Pay_by_bank.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

}
