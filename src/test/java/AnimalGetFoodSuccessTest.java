import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalGetFoodSuccessTest {
    List<String> required;
    String type;

    public AnimalGetFoodSuccessTest(List<String> required, String type) {
        this.required = required;
        this.type = type;
    }

    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][] {
                {List.of("Трава", "Различные растения"),"Травоядное"},
                {List.of("Животные", "Птицы", "Рыба"),"Хищник"}
        };
    }

    @Test
    public void animalGetFoodTest() throws Exception {
        Animal animal = new Animal();
        Assert.assertEquals(required,animal.getFood(type));
    }
}
