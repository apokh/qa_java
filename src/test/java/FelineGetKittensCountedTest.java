import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineGetKittensCountedTest {
    Integer required;
    Integer count;

    public FelineGetKittensCountedTest(int required, Integer count) {
        this.required = required;
        this.count = count;
    }

    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][] {
                {2,2},
                {1,1},
                {0,0}
        };
    }

    @Test
    public void felineGetKittensCountedTest() {
        Feline feline = new Feline();
        Assert.assertEquals(required,(Integer)feline.getKittens(count));
    }
}
