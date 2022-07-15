package catalog.computer.page.onliner.object;

import catalog.page.onliner.object.CatalogPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends CatalogPage {

    @FindBy(xpath = "//span[contains(text(), 'Компьютеры и')][@class]")
    private WebElement sectionCatalogComputer;

    @FindBy(xpath = "//div[contains(text(), ' Комплектующие ')][1]")
    private WebElement sectionLaptop;

    @FindBy(xpath = "//div[contains(text(), ' Ноутбуки, компьютеры, мониторы ')]")
    private WebElement sectionAccessories;

    @FindBy(xpath = "//div[contains(text(), ' Хранение данных ')]")
    private WebElement sectionDataStorage;

    @FindBy(xpath = "//div[contains(text(), ' Сетевое оборудование ')]")
    private WebElement sectionNetwork;

    public ComputerPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void clickCatalogComputer() {
       sectionCatalogComputer.click();
    }

    public boolean isDisplayedSectionLaptop() {
        return sectionLaptop.isDisplayed();
    }

    public boolean isDisplayedSectionAccessories() {
        return sectionAccessories.isDisplayed();
    }

    public boolean isDisplayedSectionDataStorage() {
        return sectionDataStorage.isDisplayed();
    }

    public boolean isDisplayedSectionNetwork() {
        return sectionNetwork.isDisplayed();
    }
}
