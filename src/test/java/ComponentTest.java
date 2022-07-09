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
    public void testCatalogNameComponents () {
    Assert.assertTrue(componentPage.verifyNameComponents());
    }

    @Test
    public void testCatalogAmountComponents() {
    Assert.assertTrue(componentPage.verifyAmountComponents());
    }
    @Test
    public void testCatalogMinPriceComponents() {
    Assert.assertTrue(componentPage.verifyMinPriceComponents());
    }
}
