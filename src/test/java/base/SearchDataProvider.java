package base;

import org.testng.annotations.DataProvider;

public class SearchDataProvider {
    @DataProvider(name = "searchPatternDataProvider")
    public Object[][] getSearchPatter(){
        return new Object[][]{{"CNN"},{"ABC"}, {"NBC"}};
    }
}
