import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionInitFailureTest {
    @Mock
    Feline feline;

    @Test
    public void lionInitFailureCheck() throws Exception {
        try {
            Lion lion = new Lion(feline, "другаяСтрока");
        } catch (Exception exception) {
            Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка",
                                            exception.getMessage());
        }
    }
}