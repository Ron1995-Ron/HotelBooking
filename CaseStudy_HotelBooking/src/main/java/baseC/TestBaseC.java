package baseC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseC {
	public static Properties prop;
	public static WebDriver driver;

	public TestBaseC() {
		prop = new Properties();
		try {
			FileInputStream fin = new FileInputStream(
					System.getProperty("user.dir") + "//src//main//resources//config//config.properties");
			prop.load(fin);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialize() {
		String browser = prop.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "B://Workspace//Assessment//src//main//resources//chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("loginUrl"));
	}
	
	public static void closeBrowser() {
		driver.close();
	}
}