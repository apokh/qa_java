import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class LionDoesHaveManeTest {
    Feline feline;
    String sex;
    boolean result;

    public LionDoesHaveManeTest(Feline feline, String sex, boolean result) {
        this.feline = feline;
        this.sex = sex;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] testData() {
        Feline feline = Mockito.mock(Feline.class);
        return new Object[][] {
                {feline, "самец", true},
                {feline, "самка", false}
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void lionInitSuccessCheck() throws Exception {
        Lion lion = new Lion(feline, sex);
        Assert.assertEquals(result, lion.doesHaveMane());
    }
}