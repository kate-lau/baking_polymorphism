import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BrowniesTest {

    private Brownies brownies;

    @BeforeEach
    public void setUp(){
        brownies = new Brownies("Gluten-Free Brownies", "chocolate", true, "white", false, 4);
    }

    @Test
    public void canGetTypeOfChocolate(){
        assertThat(brownies.getTypeOfChocolate()).isEqualTo("white");
    }
    @Test
    public void canSetTypeOfChocolate(){
        brownies.setTypeOfChocolate("milk");
        assertThat(brownies.getTypeOfChocolate()).isEqualTo("milk");
    }

    @Test
    public void canGetHasChocolateChips(){
        assertThat(brownies.getHasChocolateChips()).isEqualTo(false);
    }
    @Test
    public void canSetHasChocolateChips(){
        brownies.setHasChocolateChips(true);
        assertThat(brownies.getHasChocolateChips()).isEqualTo(true);
    }

    @Test
    public void canNumberOfSlices(){
        assertThat(brownies.getNumberOfSlices()).isEqualTo(4);
    }
    @Test
    public void canSetNumberOfSlices(){
        brownies.setNumberOfSlices(8);
        assertThat(brownies.getNumberOfSlices()).isEqualTo(8);
    }

}
