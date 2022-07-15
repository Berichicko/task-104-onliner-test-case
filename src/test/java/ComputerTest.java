import catalog.computer.page.onliner.object.ComputerPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ComputerTest extends BaseTest {
    private ComputerPage computerPage;

    @Before
    public void clickComputer() {
        computerPage = new ComputerPage(driver);
        computerPage.clickCatalogComputer();
    }

    @Test
    public void testSectionLaptop() {
        computerPage = new ComputerPage(driver);
        Assert.assertTrue(computerPage.isDisplayedSectionLaptop());
    }

    @Test
    public void testSectionAccessories() {
        computerPage = new ComputerPage(driver);
        Assert.assertTrue(computerPage.isDisplayedSectionAccessories());
    }

    @Test
    public void testSectionDataStorage() {
        computerPage = new ComputerPage(driver);
        Assert.assertTrue(computerPage.isDisplayedSectionDataStorage());
    }

    @Test
    public void testSectionNetwork() {
        computerPage = new ComputerPage(driver);
        Assert.assertTrue(computerPage.isDisplayedSectionNetwork());
    }
}
