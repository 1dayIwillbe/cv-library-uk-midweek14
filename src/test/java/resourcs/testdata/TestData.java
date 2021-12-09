package resourcs.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "generalSearch")
    public static Object[][] objectTestData() {
        return new Object[][]{
                {"Tester1","Harrow","up to 5 miles","20000","500000","Per annum","Permanent","Permanent Tester jobs in Harrow on the Hill"},
                {"Tester2","Harrow on the Hill, Greater London","up to 5 miles","30000","500000","Per annum","Permanent","Permanent Tester jobs in Harrow on the Hill"},
             //   {"Master3","Harrow","up to 5 mile","40000","500000","Per annum","Permanent","Permanent Tester jobs in Harrow on the Hill"},
              //  {"Tester4","Harrow","up to 5 mile","50000","500000","Per annum","Permanent","Permanent Tester jobs in Harrow on the Hill"},
              //  {"Tester5","Harrow","up to 5 mile","60000","500000","Per annum","Permanent","Permanent Tester jobs in Harrow on the Hill"},
             //   {"Tester6","Harrow","up to 5 mile","70000","500000","Per annum","Permanent","Permanent Tester jobs in Harrow on the Hill"},
              //  {"Tester7","Harrow","up to 5 mile","80000","500000","Per annum","Permanent","Permanent Tester jobs in Harrow on the Hill"},

        };
    }

}
