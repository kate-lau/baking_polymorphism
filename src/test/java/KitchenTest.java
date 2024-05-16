import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class KitchenTest {

    private Kitchen kitchen;

    @BeforeEach
    public void setUp(){
        kitchen = new Kitchen();
    }

    @Test
    public void canCountCakesInKitchen(){
        assertThat(kitchen.countCakesInKitchen()).isEqualTo(0);
    }

    @Test
    public void canAddCakeToKitchen(){
        Cupcake cupcake = new Cupcake("Hello Kitty Cupcake", "vanilla", false, 1, "Pink");
        kitchen.addCakeToKitchen(cupcake);
        assertThat(kitchen.countCakesInKitchen()).isEqualTo(1);
    }
    @Test
    public void canAddMultipleCakesToKitchen(){
        Cupcake cupcake = new Cupcake("Pastel Pink Cupcake", "vanilla", false, 1, "Pink");
        BirthdayCake birthdayCake = new BirthdayCake("Kate's Birthday Cake", "banana", true, 3, 24);
        kitchen.addCakeToKitchen(cupcake);
        kitchen.addCakeToKitchen(birthdayCake);

        assertThat(kitchen.countCakesInKitchen()).isEqualTo(2);
    }

    @Test
    public void canRemoveCakeFromKitchen(){
        Brownies brownies = new Brownies("Chunky Brownie", "chocolate", false, "dark", true, 16);
        kitchen.addCakeToKitchen(brownies);
        assertThat(kitchen.countCakesInKitchen()).isEqualTo(1);
        kitchen.removeCakeFromKitchen(brownies);
        assertThat(kitchen.countCakesInKitchen()).isEqualTo(0);

    }
}
