package TestCases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PagesOfFirstTask.Addresses;
import PagesOfFirstTask.Home_Page;
import PagesOfFirstTask.Login;
import PagesOfFirstTask.Order_Confirmation_bank;
import PagesOfFirstTask.Order_Summary;
import PagesOfFirstTask.Payment_Pay_by_bank;
import PagesOfFirstTask.Shipping;
import PagesOfFirstTask.Shopping_Cart_Summary;
import Utilities.read_excel_data;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Add_an_element_to_cart_pay_bank {

	WebDriver driver;

	@Test(dataProvider = "test_data")
	public void Adding_an_element_to_cart_Edge(String Email, String Password) throws IOException {

		// Edge Driver
		WebDriverManager.edgedriver().setup();

		// Initialize Edge Driver
		driver = new EdgeDriver();

		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		Login sign_in = new Login();
		sign_in.login_to_my_store(driver, Email, Password);

		Home_Page store = new Home_Page();
		store.Home_my_store(driver);

		Shopping_Cart_Summary cart = new Shopping_Cart_Summary();
		cart.cart_summary(driver);

		Addresses add = new Addresses();
		add.addresses(driver);

		Shipping sh = new Shipping();
		sh.shipping(driver);

		Payment_Pay_by_bank pay = new Payment_Pay_by_bank();
		pay.payment(driver);

		Order_Summary sum = new Order_Summary();
		sum.order(driver);

		Order_Confirmation_bank conf = new Order_Confirmation_bank();
		conf.confirm(driver);

		driver.quit();
	}

	@Test(dataProvider = "test_data")
	public void Adding_an_element_to_cart_firefox(String Email, String Password) throws IOException {

		// FirefoxDriver
		WebDriverManager.firefoxdriver().setup();

		// Initialize FirefoxDriver
		driver = new FirefoxDriver();

		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		Login sign_in = new Login();
		sign_in.login_to_my_store(driver, Email, Password);

		Home_Page store = new Home_Page();
		store.Home_my_store(driver);

		Shopping_Cart_Summary cart = new Shopping_Cart_Summary();
		cart.cart_summary(driver);

		Addresses add = new Addresses();
		add.addresses(driver);

		Shipping sh = new Shipping();
		sh.shipping(driver);

		Payment_Pay_by_bank pay = new Payment_Pay_by_bank();
		pay.payment(driver);

		Order_Summary sum = new Order_Summary();
		sum.order(driver);

		Order_Confirmation_bank conf = new Order_Confirmation_bank();
		conf.confirm(driver);

		driver.quit();
	}

	@Test(dataProvider = "test_data")
	public void Adding_an_element_to_cart_chrome(String Email, String Password) throws IOException {

		// chromeDrive
		WebDriverManager.chromedriver().setup();

		// Initialize chromeDriver
		driver = new ChromeDriver();

		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		Login sign_in = new Login();
		sign_in.login_to_my_store(driver, Email, Password);

		Home_Page store = new Home_Page();
		store.Home_my_store(driver);

		Shopping_Cart_Summary cart = new Shopping_Cart_Summary();
		cart.cart_summary(driver);

		Addresses add = new Addresses();
		add.addresses(driver);

		Shipping sh = new Shipping();
		sh.shipping(driver);

		Payment_Pay_by_bank pay = new Payment_Pay_by_bank();
		pay.payment(driver);

		Order_Summary sum = new Order_Summary();
		sum.order(driver);

		Order_Confirmation_bank conf = new Order_Confirmation_bank();
		conf.confirm(driver);

		driver.quit();
	}

	@AfterTest
	public void close() {
//		driver.close();
	}

	@DataProvider
	public String[][] test_data() throws InvalidFormatException, IOException {

		read_excel_data obj = new read_excel_data();
		return obj.read_sheet();
	}
}
