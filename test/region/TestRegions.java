package region;

import framework.Configuration;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.DashboardPage;
import pages.LoginPage;
import pages.RegionsPage;

public class TestRegions {

    private static LoginPage loginPage;
    private static DashboardPage dashboardPage;
    private static RegionsPage regionsPage;

    @BeforeClass
    public static void setUpClass() throws IOException {
        Configuration.init();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login();
//        System.out.println("@BeforeClass (setUpClass) start: " + dateFormat.format(new Date()));

//        driver = new ChromeDriver();
//        wait = new WebDriverWait(driver, 10);
//        regionsPage = new RegionsPage();
//
//        driver.manage().window().maximize();
//        driver.get("http://bvtest.school.cubes.rs/login");
//
//        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
//        emailField.sendKeys("qa@cubes.rs");
//
//        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
//        passwordField.sendKeys("cubesqa");
//
//        WebElement loginButon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn-primary")));
//        loginButon.click();
//        System.out.println("Page title is: " + driver.getTitle());
    }

    @AfterClass
    public static void tearDownClass() throws InterruptedException {
//        Thread.sleep(3000);
//        System.out.println("@AfterClass (tearDownClass) " + dateFormat.format(new Date()));
//        driver.quit();

    }

    @Before
    public void setUp() {
        regionsPage = dashboardPage.goToRegions();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
//        System.out.println("@After (tearDown): " + dateFormat.format(new Date()));
    }

    @Test
    public void testCreateNewRegion() {

        String expectedTitle = "Brze vesti admin  | Regions ".replaceAll("\\s+", " ").trim();
        String actualTitle = loginPage.getDriver().getTitle();
        Assert.assertEquals("Titles don't match.: ", expectedTitle, actualTitle);
    }

    @Test
    public void testEditFirstRegion() {

        regionsPage.editFirstRegion();
    }

    @Test
    public void testEditLastRegion() {
        regionsPage.editLastRegion();

    }

    @Test
    public void testEditRandomRegion() {

        regionsPage.editRandomRegion();

    }

    @Test
    public void testDeleteFirstRegion() {
        regionsPage.deleteFirstRegion();

    }

    @Test
    public void deleteLastRegion() {
        regionsPage.deleteLastRegion();

    }

    @Test
    public void deleteRandomRegion() {
        regionsPage.deleteRandomRegion();

    }

    @Test
    public void testAddEditDeleteRegion() {
        regionsPage.createNewRegion();
        regionsPage.editRandomRegion();
        regionsPage.deleteLastRegion();
        regionsPage.deleteFirstRegion();

    }
}
