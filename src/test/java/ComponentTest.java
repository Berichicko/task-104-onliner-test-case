import org.junit.Assert;
import org.junit.Test;

public class ComponentTest extends BaseTest {

    @Test
    public void testPC() {
        computerPage.clickComputer();
        accessoriesPage.clickComponent();
        Assert.assertTrue(accessoriesPage.verifyVideoCard());


    }
    @Test
    public void testAccessories() {
        computerPage.clickComputer();
        accessoriesPage.clickComponent();
        Assert.assertTrue(accessoriesPage.verifyAmountVideoCard());


    }
    @Test
    public void testData() {
        computerPage.clickComputer();
        accessoriesPage.clickComponent();
        Assert.assertTrue(accessoriesPage.verifyMinPriceVideoCard());

    }

}
