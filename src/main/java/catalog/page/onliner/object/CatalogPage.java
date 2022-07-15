package catalog.page.onliner.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatalogPage {

    private final By ELECTRONIC_LOCATOR = By.xpath("//span[contains(text(), 'Электроника')]");
    private final By HOME_COMPUTER_LOCATOR = By.xpath("//span[contains(text(), 'Компьютеры и')][@class]");
    private final By HOME_APPLIANCES_LOCATOR = By.xpath("//span[contains(text(), 'Бытовая техника')]");
    private final By BUILDING_LOCATOR = By.xpath("//span[contains(text(), 'Стройка')]");
    private final By HOME_LOCATOR = By.xpath("//span[contains(text(), 'Дом и')]");
    private final By SPORT_LOCATOR = By.xpath("//span[contains(text(), 'Красота и')][@class]");
    private final By CHILDREN_LOCATOR = By.xpath("//span[contains(text(), 'Детям и')]");
    private final By WORK_LOCATOR = By.xpath("//span[contains(text(), 'Работа и')]");
    protected WebDriver driver;

    public CatalogPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isDisplayedSectionElectronic() {
        return driver.findElement(ELECTRONIC_LOCATOR).isDisplayed();
    }

    public boolean isDisplayedSectionComputer() {
        return driver.findElement(HOME_COMPUTER_LOCATOR).isDisplayed();
    }

    public boolean isDisplayedSectionHomeAppliances() {
        return driver.findElement(HOME_APPLIANCES_LOCATOR).isDisplayed();
    }

    public boolean isDisplayedSectionBuilding() {
        return driver.findElement(BUILDING_LOCATOR).isDisplayed();
    }

    public boolean isDisplayedSectionHome() {
        return driver.findElement(HOME_LOCATOR).isDisplayed();
    }

    public boolean isDisplayedSectionSport() {
        return driver.findElement(SPORT_LOCATOR).isDisplayed();
    }

    public boolean isDisplayedSectionChildren() {
        return driver.findElement(CHILDREN_LOCATOR).isDisplayed();
    }

    public boolean isDisplayedSectionWork() {
        return driver.findElement(WORK_LOCATOR).isDisplayed();
    }
}
