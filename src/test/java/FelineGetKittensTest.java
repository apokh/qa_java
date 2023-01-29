import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

public class FelineGetKittensTest {
    @Test
    public void felineGetKittensCountedTest() {
        Feline feline = new Feline();
        Assert.assertEquals(1,feline.getKittens());
    }
}
