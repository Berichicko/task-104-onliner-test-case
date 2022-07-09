import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ComputerTest extends BaseTest {

    @Before
    public void clickComputer() {
    computerPage.clickComputer();
    }

    @Test
    public void testCatalogPC() {
    Assert.assertTrue(computerPage.verifyPC());
    }

    @Test
    public void testCatalogAccessories() {
    Assert.assertTrue(computerPage.verifyAccessories());
    }

    @Test
    public void testCatalogData() {
    Assert.assertTrue(computerPage.verifyData());
    }

    @Test
    public void testCatalogNetwork() {
    Assert.assertTrue(computerPage.verifyNetwork());
    }
}
