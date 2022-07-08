import org.junit.Assert;
import org.junit.Test;

public class CatalogTest extends BaseTest {

    @Test
    public void testCatalogElectrons() {
        Assert.assertTrue(catalogPage.verifyElectron());
    }

    @Test
    public void testCatalogComputer() {
        Assert.assertTrue(catalogPage.verifyComputer());
    }

    @Test
    public void testCatalogHomeAppliances() {
        Assert.assertTrue(catalogPage.verifyHomeAppliances());
    }

    @Test
    public void testCatalogBuild() {
        Assert.assertTrue(catalogPage.verifyBuilding());
    }

    @Test
    public void testCatalogHome() {
        Assert.assertTrue(catalogPage.verifyHome());
    }

    @Test
    public void testCatalogSport() {
        Assert.assertTrue(catalogPage.verifySport());
    }

    @Test
    public void testCatalogChildren() {
        Assert.assertTrue(catalogPage.verifyChildren());
    }

    @Test
    public void testCatalogWork() {
        Assert.assertTrue(catalogPage.verifyWork());
    }
}
