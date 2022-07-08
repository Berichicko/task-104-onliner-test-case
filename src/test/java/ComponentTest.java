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
    Assert.assertTrue(componentPage.verifyVideoCard());
    }

    @Test
    public void testCatalogAmountVideoCard() {
    Assert.assertTrue(componentPage.verifyAmountVideoCard());
    }

    @Test
    public void testCatalogMinPriceVideoCard() {
    Assert.assertTrue(componentPage.verifyMinPriceVideoCard());
    }
}
