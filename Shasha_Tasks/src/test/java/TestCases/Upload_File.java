package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import PagesOfSecondTask.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_File {

	WebDriver driver;

	@Test
	public void Upload_File_Edge() throws IOException {

		// Edge Driver
		WebDriverManager.edgedriver().setup();

		// Initialize Edge Driver
		driver = new EdgeDriver();

		driver.navigate().to("https://the-internet.herokuapp.com");
		driver.manage().window().maximize();

		The_Internet_Available_Examples example = new The_Internet_Available_Examples();
		example.homePage(driver);

		File_Uploader upload = new File_Uploader();
		upload.uploadPage(driver);

		driver.quit();
	}

	@Test
	public void Upload_File_firefox() throws IOException {

		// FirefoxDriver
		WebDriverManager.firefoxdriver().setup();

		// Initialize FirefoxDriver
		driver = new FirefoxDriver();

		driver.navigate().to("https://the-internet.herokuapp.com");
		driver.manage().window().maximize();

		The_Internet_Available_Examples example = new The_Internet_Available_Examples();
		example.homePage(driver);

		File_Uploader upload = new File_Uploader();
		upload.uploadPage(driver);

		driver.quit();
	}

	@Test
	public void Upload_File_chrome() throws IOException {

		// chromeDrive
		WebDriverManager.chromedriver().setup();

		// Initialize chromeDriver
		driver = new ChromeDriver();

		driver.navigate().to("https://the-internet.herokuapp.com");
		driver.manage().window().maximize();

		The_Internet_Available_Examples example = new The_Internet_Available_Examples();
		example.homePage(driver);

		File_Uploader upload = new File_Uploader();
		upload.uploadPage(driver);

		driver.quit();
	}

	@AfterTest
	public void close() {
//		driver.close();
	}

}
