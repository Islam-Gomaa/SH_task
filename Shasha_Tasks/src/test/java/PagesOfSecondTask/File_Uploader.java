package PagesOfSecondTask;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class File_Uploader {

	public void uploadPage(WebDriver driver) throws IOException {

		try {

			Thread.sleep(500);

			String filePath = System.getProperty("user.dir");

			// Choose File
			driver.findElement(By.id("file-upload")).sendKeys(filePath + "\\files\\Test.jpg");

			// Convert web driver object to TakeScreenshot
			TakesScreenshot scrShot = (TakesScreenshot) driver;

			// Call getScreenshotAs method to create image file
			File src = scrShot.getScreenshotAs(OutputType.FILE);

			// Move image file to new destination
			org.openqa.selenium.io.FileHandler.copy(src, new File(".\\File Uploader page.png"));

			Thread.sleep(500);
			
			// Click on File Upload
			By Upload_BTN = By.id("file-submit");
			driver.findElement(Upload_BTN).click();

			Thread.sleep(500);

			// Convert web driver object to TakeScreenshot
			TakesScreenshot scrShot2 = (TakesScreenshot) driver;

			// Call getScreenshotAs method to create image file
			File src2 = scrShot2.getScreenshotAs(OutputType.FILE);

			// Move image file to new destination
			org.openqa.selenium.io.FileHandler.copy(src2, new File(".\\File Uploaded!.png"));

			Thread.sleep(200);

			WebElement Message = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3"));
			System.out.println(Message.getText());

			System.out.println("The file has been uploaded successfully");

		} catch (InterruptedException ex) {
			Logger.getLogger(File_Uploader.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

}
