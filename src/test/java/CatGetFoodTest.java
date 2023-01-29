import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatGetFoodTest {
    @Mock
    Feline feline;

    @Test
    public void catGetFoodCheck() throws Exception {
        Cat cat = new Cat(feline);
        Assert.assertEquals(List.of(),cat.getFood());
    }
}
