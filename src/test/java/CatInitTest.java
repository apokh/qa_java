import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatInitTest {
    @Mock
    Feline feline;

    @Test
    public void catInitCheck() {
        Cat cat = new Cat(feline);
        Assert.assertNotNull(cat);
    }
}
