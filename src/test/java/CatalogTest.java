import catalog.page.onliner.object.CatalogPage;
import org.junit.Assert;
import org.junit.Test;

public class CatalogTest extends BaseTest {
    private CatalogPage catalogPage;


    @Test
    public void testCatalogElectrons() {
        catalogPage = new CatalogPage(driver);
        Assert.assertTrue(catalogPage.isDisplayedSectionElectronic());
    }

    @Test
    public void testCatalogComputer() {
        catalogPage = new CatalogPage(driver);
        Assert.assertTrue(catalogPage.isDisplayedSectionComputer());
    }

    @Test
    public void testCatalogHomeAppliances() {
        catalogPage = new CatalogPage(driver);
        Assert.assertTrue(catalogPage.isDisplayedSectionHomeAppliances());
    }

    @Test
    public void testCatalogBuild() {
        catalogPage = new CatalogPage(driver);
        Assert.assertTrue(catalogPage.isDisplayedSectionBuilding());
    }

    @Test
    public void testCatalogHome() {
        catalogPage = new CatalogPage(driver);
        Assert.assertTrue(catalogPage.isDisplayedSectionHome());
    }

    @Test
    public void testCatalogSport() {
        catalogPage = new CatalogPage(driver);
        Assert.assertTrue(catalogPage.isDisplayedSectionSport());
    }

    @Test
    public void testCatalogChildren() {
        catalogPage = new CatalogPage(driver);
        Assert.assertTrue(catalogPage.isDisplayedSectionChildren());
    }

    @Test
    public void testCatalogWork() {
        catalogPage = new CatalogPage(driver);
        Assert.assertTrue(catalogPage.isDisplayedSectionWork());
    }
}
