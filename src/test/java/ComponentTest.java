import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ComponentTest extends BaseTest {

    @Before
    public void testOpenComponentPage() {
    computerPage.clickComputer();
    componentPage.clickComponent();
    }

    @Test
    public void testCatalogVideoCard() {
    Assert.assertTrue(componentPage.verifyNameComponents());
    }

    @Test
    public void testCatalogAmountVideoCard() {
    Assert.assertTrue(componentPage.verifyAmountComponents());
    }

    @Test
    public void testCatalogMinPriceVideoCard() {
    Assert.assertTrue(componentPage.verifyMinPriceComponents());
    }
}
