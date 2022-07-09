package catalog_computer_page_onliner_object;

import catalog_page_onliner_object.CatalogPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComputerPage extends CatalogPage {

    private final By clickComputerLocator = By.xpath("//span[contains(text(), 'Компьютеры и')][@class]");
    private final By pcLocator = By.xpath("//div[contains(text(), ' Ноутбуки, компьютеры, мониторы ')]");
    private final By accessoriesLocator = By.xpath("//div[contains(text(), ' Комплектующие ')][1]");
    private final By dataLocator = By.xpath("//div[contains(text(), ' Хранение данных ')]");
    private final By networkLocator = By.xpath("//div[contains(text(), ' Сетевое оборудование ')]");

    public ComputerPage(WebDriver driver) {
        super(driver);
    }

    public void clickComputer() {
        driver.findElement(clickComputerLocator)
                .click();
    }

    public boolean verifyPC() {
        return driver.findElement(pcLocator).isDisplayed();
    }

    public boolean verifyAccessories() {
        return driver.findElement(accessoriesLocator).isDisplayed();
    }

    public boolean verifyData() {
        return driver.findElement(dataLocator).isDisplayed();
    }

    public boolean verifyNetwork() {
        return driver.findElement(networkLocator).isDisplayed();

    }
}
