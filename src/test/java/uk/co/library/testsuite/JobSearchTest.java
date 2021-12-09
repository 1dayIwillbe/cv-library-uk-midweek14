package uk.co.library.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resourcs.testdata.TestData;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.TestBase;

public class JobSearchTest extends TestBase {
    HomePage homePage;
    ResultPage resultPage;

    @BeforeMethod(alwaysRun = true)
            public void setup() {
        homePage = new HomePage();
        resultPage = new ResultPage();

       }


    @Test (dataProvider = "generalSearch",dataProviderClass = TestData.class, priority = 1, groups = {"smoke","regression"})
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType,
                                                         String result){

        homePage.enterJobTitle(jobTitle);
        homePage.enterLocation(location);
        homePage.selectDistance(distance);
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinSalary(salaryMin);
        homePage.enterMaxSalary(salaryMax);
        homePage.selectSalaryType(salaryType);
        homePage.selectJobType(jobType);
        homePage.clickOnFindJobsButton();
        System.out.println(resultPage.getRestulText());
    }
}
