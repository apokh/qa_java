import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

public class FelineGetFamilyTest {
    @Test
    public void felineGetFamilyTest() {
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи",feline.getFamily());
    }
}
