package catalog_page_onliner_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatalogOnlinerPage {

    protected WebDriver driver;
    private final By ElectronicsLocator = By.xpath("//span[contains(text(), 'Электроника')]");
    private final By ComputerLocator = By.xpath("//span[contains(text(), 'Компьютеры и')][@class]");
    private final By HomeAppliancesLocator = By.xpath("//span[contains(text(), 'Бытовая техника')]");
    private final By BuildingLocator = By.xpath("//span[contains(text(), 'Стройка')]");
    private final By HomeLocator = By.xpath("//span[contains(text(), 'Дом и')]");
    private final By SportLocator = By.xpath("//span[contains(text(), 'Красота и')][@class]");
    private final By ChildrenLocator = By.xpath("//span[contains(text(), 'Детям и')]");
    private final By WorkLocator = By.xpath("//span[contains(text(), 'Работа и')]");

    public CatalogOnlinerPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean verifyElectron() {
        return driver.findElement(ElectronicsLocator).getText().equals("Электроника");

    }

    public boolean verifyComputer() {
        return driver.findElement(ComputerLocator).getText().equals("Компьютеры и сети");


    }

    public boolean verifyHomeAppliances() {
        return driver.findElement(HomeAppliancesLocator).getText().equals("Бытовая техника");

    }

    public boolean verifyBuilding() {
        return driver.findElement(BuildingLocator).getText().equals("Стройка и ремонт");

    }

    public boolean verifyHome() {
        return driver.findElement(HomeLocator).getText().equals("Дом и сад");

    }

    public boolean verifySport() {
        return driver.findElement(SportLocator).getText().equals("Красота и спорт");

    }

    public boolean verifyChildren() {
        return driver.findElement(ChildrenLocator).getText().equals("Детям и мамам");

    }

    public boolean verifyWork() {
        return driver.findElement(WorkLocator).getText().equals("Работа и офис");

    }
}
