

import org.junit.Assert;
import org.junit.Test;

public class CatalogTest extends BaseTest {

    @Test
    public void testElectron() {
        Assert.assertTrue(catalogPage.verifyElectron());
    }

    @Test
    public void testComputer() {
        Assert.assertTrue(catalogPage.verifyComputer());
    }

    @Test
    public void testHomeAppliances() {
        Assert.assertTrue(catalogPage.verifyHomeAppliances());
    }

    @Test
    public void testBuild() {
        Assert.assertTrue(catalogPage.verifyBuilding());
    }

    @Test
    public void testHome() {
        Assert.assertTrue(catalogPage.verifyHome());
    }

    @Test
    public void testSport() {
        Assert.assertTrue(catalogPage.verifySport());
    }

    @Test
    public void testChildren() {
        Assert.assertTrue(catalogPage.verifyChildren());
    }

    @Test
    public void testWork() {
        Assert.assertTrue(catalogPage.verifyWork());
    }
}
