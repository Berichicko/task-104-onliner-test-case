import catalog.computer.page.onliner.object.ComputerPage;
import computer.components.page.onliner.object.ComponentPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ComponentTest extends BaseTest {
    private ComputerPage computerPage;
    private ComponentPage componentPage;

    @Before
    public void testOpenComponentPage() {
    computerPage = new ComputerPage(driver);
    componentPage = new ComponentPage(driver);
    computerPage.clickCatalogComputer();
    componentPage.clickSectionComputerComponent();
    }

    @Test
    public void testCatalogNameComponents () {
    Assert.assertTrue(componentPage.isDisplayedNameComponents());
    }

    @Test
    public void testCatalogAmountComponents() {
    Assert.assertTrue(componentPage.isDisplayedAmountComponents());
    }
    @Test
    public void testCatalogMinPriceComponents() {
    Assert.assertTrue(componentPage.isDisplayedMinPriceComponents());
    }
}
