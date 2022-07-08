package computer_components_page_onliner_object;

import catalog_computer_page_onliner_object.ComputerCatalogOnlinerPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComponentComputerCatalogOnlinerPage extends ComputerCatalogOnlinerPage {
    private final By clickComponentLocator = By.xpath("//div[contains(text(), ' Комплектующие ')][1]");
    private final By videoCardLocator = By.xpath("//span[contains(text(), \"Видеокарты\")]");
    private final By amountVideoCardLocator = By.xpath("/span[contains(text(), \" 1,141 товар \")][1]");
    private final By minPriceVideoCardLocator = By.xpath("//span[contains(text(), \" 1,141 товар \")][1]");


    public ComponentComputerCatalogOnlinerPage(WebDriver driver) {
        super(driver);
    }

    public void clickComponent() {
        driver.findElement(clickComponentLocator)
                .click();
    }

    public boolean verifyVideoCard() {
        return driver.findElement(videoCardLocator)
                .getText().equals(" Видеокарты ");
    }

    public boolean verifyAmountVideoCard() {
        return driver.findElement(amountVideoCardLocator)
                .getText().equals(" 1,141 товар ");
    }

    public boolean verifyMinPriceVideoCard() {
        return driver.findElement(minPriceVideoCardLocator)
                .getText().equals(" 1,141 товар ");
    }

}
