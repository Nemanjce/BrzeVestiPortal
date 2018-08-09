package category;

import framework.Configuration;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.CategoriesPage;
import pages.DashboardPage;
import pages.LoginPage;

public class TestCategories {

    private static LoginPage loginPage;
    private static DashboardPage dashboardPage;
    private static CategoriesPage categoriesPage;

    @BeforeClass
    public static void setUpClass() throws IOException {
        Configuration.init();
        
        loginPage = new LoginPage();
        dashboardPage = loginPage.login();

    }

    @AfterClass
    public static void tearDownClass() throws InterruptedException {
//        Thread.sleep(3000);
//        System.out.println("@AfterClass (tearDownClass): " + dateFormat.format(new Date()));
//        driver.quit();
    }

    @Before
    public void setUp() {
       categoriesPage = dashboardPage.goToCategories();
    }

    @After
    public void tearDown() throws InterruptedException {
//        Thread.sleep(1500);
//        System.out.println("@After (tearDown): " + dateFormat.format(new Date()));
    }

    @Test
    public void testCreateNewCategory() {
        categoriesPage.addNewCategory();
        String expectedUrl = "http://bvtest.school.cubes.rs/admin/categories";
        String actualUrl = loginPage.getDriver().getTitle();
//  String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("Url's don't match", expectedUrl, actualUrl);
    }
}
