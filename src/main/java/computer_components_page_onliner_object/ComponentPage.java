package computer_components_page_onliner_object;

import catalog_computer_page_onliner_object.ComputerPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComponentPage extends ComputerPage {
    private final By clickComponentLocator = By.xpath("//div[@class='catalog-navigation-list__aside-title']" +
            "[contains(text(), 'Комплектующие')][1]");
    private final By videoCardLocator = By.xpath("//span[contains(text(), 'Видеокарты')]");
    private final By amountVideoCardLocator = By.xpath("/span[contains(text(), ' 1,141 товар ')]");
    private final By minPriceVideoCardLocator = By.xpath("//span[contains(text(), ' от 106,95 р. ')");

    public ComponentPage(WebDriver driver) {
        super(driver);
    }

    public void clickComponent() {
        driver.findElement(clickComponentLocator)
                .click();
    }

    public boolean verifyVideoCard() {
        return driver.findElement(videoCardLocator).isDisplayed();

    }

    public boolean verifyAmountVideoCard() {
        return driver.findElement(amountVideoCardLocator).isDisplayed();

    }

    public boolean verifyMinPriceVideoCard() {
        return driver.findElement(minPriceVideoCardLocator).isDisplayed();
    }
}
