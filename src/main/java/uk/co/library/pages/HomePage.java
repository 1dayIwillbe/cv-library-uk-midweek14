package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    public HomePage (){ PageFactory.initElements(driver, this);}
    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitleWE;
    @CacheLookup
    @FindBy(id = "location")
    WebElement locationWE;
    @CacheLookup
    @FindBy(id = "distance")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionsLink;
    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findJobsBtn;

    public void enterJobTitle(String jobTitle){
       sendTextToElement(jobTitleWE,jobTitle);
    }
    public void enterLocation(String location){
       sendTextToElement(locationWE,location);
    }
    public void selectDistance(String distance){
        sendTabAndEnterKey(distanceDropDown);
        selectByVisibleTextFromDropDown(distanceDropDown,distance);
    }
    public void clickOnMoreSearchOptionLink(){
        clickOnElement(moreSearchOptionsLink);

    }
    public void enterMinSalary(String minSalary){
        sendTextToElement(salaryMin,minSalary);
    }
    public void enterMaxSalary(String maxSalary){
        sendTextToElement(salaryMax,maxSalary);
    }
    public void selectSalaryType(String sType) {
        selectByVisibleTextFromDropDown(salaryTypeDropDown,sType);
    }
    public void selectJobType(String jobType) {
        selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);
    }
    public void clickOnFindJobsButton(){
        clickOnElement(findJobsBtn);
    }

}
