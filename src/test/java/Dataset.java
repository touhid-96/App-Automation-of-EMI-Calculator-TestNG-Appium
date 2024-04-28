import org.testng.annotations.DataProvider;

public class Dataset {

    @DataProvider(name = "data-provider")
    public Object[][] setData() {
        return new Object[][] {
                {50000, 10, 2, 2, 2307.25, 5373.91, 1000, 55373.91},
                {70000, 10, 3, 1.7, 2258.7, 11313.31, 1190, 81313.31},
                {200000, 10, 1, 2.5, 17583.18, 10998.13, 5000, 210998.13}
        };
    }
}
