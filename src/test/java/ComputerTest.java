import org.junit.Assert;
import org.junit.Test;

public class ComputerTest extends BaseTest {

    @Test
    public void testPC() {
        computerPage.clickComputer();
        Assert.assertTrue(computerPage.verifyPC());
    }
    @Test
    public void testAccessories() {
        computerPage.clickComputer();
        Assert.assertTrue(computerPage.verifyAccessories());
    }
    @Test
    public void testData() {
        computerPage.clickComputer();
        Assert.assertTrue(computerPage.verifyData());

    }
    @Test
    public void testNetwork() {
        computerPage.clickComputer();
        Assert.assertTrue(computerPage.verifyNetwork());

    }
}
