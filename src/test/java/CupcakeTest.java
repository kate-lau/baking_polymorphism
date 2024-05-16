import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CupcakeTest {

    private Cupcake cupcake;

    @BeforeEach
    public void setUp(){
        cupcake = new Cupcake("Fruit Cupcake", "strawberry", true, 5, "red");
    }

    @Test
    public void canGetNumberOfToppings(){
        assertThat(cupcake.getNumberOfToppings()).isEqualTo(5);
    }
    @Test
    public void canSetNumberOfToppings(){
        cupcake.setNumberOfToppings(2);
        assertThat(cupcake.getNumberOfToppings()).isEqualTo(2);
    }

    @Test
    public void canGetFrostingColour(){
        assertThat(cupcake.getFrostingColour()).isEqualTo("red");
    }
    @Test
    public void canSetFrostingColour(){
        cupcake.setFrostingColour("green");
        assertThat(cupcake.getFrostingColour()).isEqualTo("green");
    }

    // CAKE PARENT CLASS TESTS
    @Test
    public void canGetCakeName(){
        assertThat(cupcake.getCakeName()).isEqualTo("Fruit Cupcake");
    }
    @Test
    public void canSetCakeName(){
        cupcake.setCakeName("Fruit(Cup)Cake");
        assertThat(cupcake.getCakeName()).isEqualTo("Fruit(Cup)Cake");
    }

    @Test
    public void canGetBaseFlavour(){
        assertThat(cupcake.getBaseFlavour()).isEqualTo("strawberry");
    }
    @Test
    public void canSetBaseFlavour(){
        cupcake.setBaseFlavour("raspberry");
        assertThat(cupcake.getBaseFlavour()).isEqualTo("raspberry");
    }

    @Test
    public void canGetIsGlutenFree(){
        assertThat(cupcake.getIsGlutenFree()).isEqualTo(true);
    }
    @Test
    public void canSetIsGlutenFree(){
        cupcake.setIsGlutenFree(true);
        assertThat(cupcake.getIsGlutenFree()).isEqualTo(true);
    }

}
