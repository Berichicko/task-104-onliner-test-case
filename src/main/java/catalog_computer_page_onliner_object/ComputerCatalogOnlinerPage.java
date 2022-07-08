package catalog_computer_page_onliner_object;

import catalog_page_onliner_object.CatalogOnlinerPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComputerCatalogOnlinerPage extends CatalogOnlinerPage {

    private final By clickComputerLocator = By.xpath("//span[contains(text(), 'Компьютеры и')][@class]");
    private final By pcLocator = By.xpath("//div[contains(text(), ' Ноутбуки, компьютеры, мониторы ')]");
    private final By accessoriesLocator = By.xpath("//div[contains(text(), ' Комплектующие ')][1]");
    private final By dataLocator = By.xpath("//div[contains(text(), ' Хранение данных ')]");
    private final By networkLocator = By.xpath("//div[contains(text(), ' Сетевое оборудование ')]");

    public ComputerCatalogOnlinerPage(WebDriver driver) {
        super(driver);
    }

    public void clickComputer() {
        driver.findElement(clickComputerLocator)
                .click();
    }

    public boolean verifyPC() {
        return driver.findElement(pcLocator)
                .getText().equals("Ноутбуки, компьютеры, мониторы");
    }

    public boolean verifyAccessories() {
        return driver.findElement(accessoriesLocator)
                .getText().equals("Комплектующие");
    }

    public boolean verifyData() {
        return driver.findElement(dataLocator)
                .getText().equals("Хранение данных");
    }

    public boolean verifyNetwork() {
        return driver.findElement(networkLocator)
                .getText().equals("Сетевое оборудование");
    }
}
