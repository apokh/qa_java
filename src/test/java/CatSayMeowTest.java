import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatSayMeowTest {
    @Mock
    Feline feline;

    @Test
    public void catSayMeowCheck() {
        Cat cat = new Cat(feline);
        Assert.assertNotNull("Мяу",cat.getSound());
    }
}
