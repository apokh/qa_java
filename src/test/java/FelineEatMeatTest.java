import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineEatMeatTest {
    @Test
    public void felineEatMeatTest() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"),feline.eatMeat());
    }
}