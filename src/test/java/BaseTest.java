import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {
    private final static String URL = "https://catalog.onliner.by/";
    protected static WebDriver driver;

    @BeforeClass
    public static void openConnection() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
    }

    @After
    public void closeConnection() {
        driver.quit();
    }
}
