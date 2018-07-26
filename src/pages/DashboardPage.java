
package pages;

import framework.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;


public class DashboardPage extends Page {
     public DashboardPage goDashboardPage(){
        clickOnElement(By.linkText("Dashboard"));
        return PageFactory.initElements(getDriver(), DashboardPage.class);
    }
    public SignaturesPage goToSignatures(){
        clickOnElement(By.linkText("Signatures"));
        return PageFactory.initElements(getDriver(), SignaturesPage.class);
    }
    public CategoriesPage goToCategories(){
        clickOnElement(By.linkText("Categories"));
        return PageFactory.initElements(getDriver(), CategoriesPage.class);
    }
       public RegionsPage goToRegions(){
        clickOnElement(By.linkText("Regions"));
        return PageFactory.initElements(getDriver(), RegionsPage.class);
    }
}
