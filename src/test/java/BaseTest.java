import catalog_computer_page_onliner_object.ComputerCatalogOnlinerPage;
import computer_components_page_onliner_object.ComponentComputerCatalogOnlinerPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import catalog_page_onliner_object.CatalogOnlinerPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseTest {
    private final static String URL_CONNECTION = "https://catalog.onliner.by/";
    CatalogOnlinerPage catalogPage;
    ComputerCatalogOnlinerPage computerPage;
    ComponentComputerCatalogOnlinerPage accessoriesPage;
    private WebDriver driver;

    @Before
    public void openConnection() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_CONNECTION);
        catalogPage = new CatalogOnlinerPage(driver);
        computerPage = new ComputerCatalogOnlinerPage(driver);
        accessoriesPage = new ComponentComputerCatalogOnlinerPage(driver);
    }

    @After
    public void closeConnection() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}


