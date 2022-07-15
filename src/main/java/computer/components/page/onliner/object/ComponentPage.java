package computer.components.page.onliner.object;

import catalog.computer.page.onliner.object.ComputerPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComponentPage extends ComputerPage {
    private final By SECTION_COMPUTER_COMPONENT_LOCATOR = By.xpath("//div[contains(@class, " +
            "'catalog-navigation-list__aside-title') " +
            "and text() = ' Комплектующие ']");
    private final By SECTION_COMPUTER_NAME_COMPONENTS_LOCATOR = By.xpath("//div[contains(@class, " +
            "'catalog-navigation-list__aside-title') " +
            "and text() = ' Комплектующие ']" +
            "//..//span[@class='catalog-navigation-list__dropdown-title']");

    private final By SECTION_COMPUTER_AMOUNT_COMPONENTS_LOCATOR = By.xpath("//div[contains(@class, 'catalog-navigation-list__aside-title')" +
            " and text() = ' Комплектующие ']" +
            "//..//span[@class='catalog-navigation-list__dropdown-description']");
    private final By SECTION_COMPUTER_MIN_PRICE_COMPONENTS_LOCATOR = By.xpath("//div[contains(@class, 'catalog-navigation-list__aside-title') " +
            "and text() = ' Комплектующие ']" +
            "//..//span[@class='catalog-navigation-list__dropdown-description']");

    public ComponentPage(WebDriver driver) {
        super(driver);
    }

    public void clickSectionComputerComponent() {
        driver.findElement(SECTION_COMPUTER_COMPONENT_LOCATOR)
                .click();
    }

    public boolean isDisplayedNameComponents() {
        return driver.findElement(SECTION_COMPUTER_NAME_COMPONENTS_LOCATOR).isDisplayed();
    }

    public boolean isDisplayedAmountComponents() {
        return driver.findElement(SECTION_COMPUTER_AMOUNT_COMPONENTS_LOCATOR).isDisplayed();
    }

    public boolean isDisplayedMinPriceComponents() {
        return driver.findElement(SECTION_COMPUTER_MIN_PRICE_COMPONENTS_LOCATOR).isDisplayed();
    }
}
