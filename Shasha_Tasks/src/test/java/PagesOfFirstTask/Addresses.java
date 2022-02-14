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

public class Addresses {

	public void addresses(WebDriver driver) throws IOException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {

			// Addresses tab

			Thread.sleep(100);

			// Convert web driver object to TakeScreenshot
			TakesScreenshot scrShot = (TakesScreenshot) driver;

			// Call getScreenshotAs method to create image file
			File src = scrShot.getScreenshotAs(OutputType.FILE);

			// Move image file to new destination
			org.openqa.selenium.io.FileHandler.copy(src, new File(".\\addresses.png"));

			Thread.sleep(500);

			// Click on Proceed to checkout
			By Proceed_to_checkout = By.name("processAddress");
			driver.findElement(Proceed_to_checkout).click();

		} catch (InterruptedException ex) {
			Logger.getLogger(Addresses.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

}
