package computer_components_page_onliner_object;

import catalog_computer_page_onliner_object.ComputerPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComponentPage extends ComputerPage {
    private final By clickComponentLocator = By.xpath("//div[contains(@class, 'catalog-navigation-list__aside-title') and text() = ' Комплектующие ']");
    private final By videoCardLocator = By.xpath("//div[contains(@class, 'catalog-navigation-list__aside-title') and text() = ' Комплектующие ']//..//span[@class='catalog-navigation-list__dropdown-title']");
    private final By amountVideoCardLocator = By.xpath("//div[contains(@class, 'catalog-navigation-list__aside-title') and text() = ' Комплектующие ']//..//span[@class='catalog-navigation-list__dropdown-description']");
    private final By minPriceVideoCardLocator = By.xpath("//div[contains(@class, 'catalog-navigation-list__aside-title') and text() = ' Комплектующие ']//..//span[@class='catalog-navigation-list__dropdown-description']");

    public ComponentPage(WebDriver driver) {
        super(driver);
    }

    public void clickComponent() {
        driver.findElement(clickComponentLocator)
                .click();
    }

    public boolean verifyNameComponents() {
        return driver.findElement(videoCardLocator).isDisplayed();
    }

    public boolean verifyAmountComponents() {
        return driver.findElement(amountVideoCardLocator).isDisplayed();

    }

    public boolean verifyMinPriceComponents() {

        return driver.findElement(minPriceVideoCardLocator).isDisplayed();
    }
}
