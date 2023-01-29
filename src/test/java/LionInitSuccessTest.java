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
public class LionInitSuccessTest {
    Feline feline;
    String sex;

    public LionInitSuccessTest(Feline feline, String sex) {
        this.feline = feline;
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[][] testData() {
        Feline feline = Mockito.mock(Feline.class);
        return new Object[][] {
            {feline, "самец"},
            {feline, "самка"}
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void lionInitSuccessCheck() throws Exception {
        Lion lion = new Lion(feline, sex);
        Assert.assertNotNull(lion);
    }
}