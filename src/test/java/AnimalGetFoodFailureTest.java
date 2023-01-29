import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;

public class AnimalGetFoodFailureTest {
    @Test
    public void animalGetFoodFailureTest() {
        try {
            Animal animal = new Animal();
            animal.getFood("варкоед");
        } catch (Exception exception) {
            Assert.assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник",exception.getMessage());
        }
    }
}
