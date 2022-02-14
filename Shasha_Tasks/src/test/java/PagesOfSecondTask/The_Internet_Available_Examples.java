package PagesOfSecondTask;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class The_Internet_Available_Examples {

	public void homePage(WebDriver driver) throws IOException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {

			Thread.sleep(500);

			// Convert web driver object to TakeScreenshot
			TakesScreenshot scrShot = (TakesScreenshot) driver;

			// Call getScreenshotAs method to create image file
			File src = scrShot.getScreenshotAs(OutputType.FILE);

			// Move image file to new destination
			org.openqa.selenium.io.FileHandler.copy(src, new File(".\\Available Examples page.png"));

			// Click on File Upload
			By File_Upload = By.partialLinkText("File Upload");
			driver.findElement(File_Upload).click();

			System.out.println("File Upload hyperlink work correctly");

		} catch (InterruptedException ex) {
			Logger.getLogger(The_Internet_Available_Examples.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

}
