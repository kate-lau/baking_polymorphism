import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BirthdayCakeTest {

    private BirthdayCake birthdayCake;

    @BeforeEach
    public void setUp(){
        birthdayCake = new BirthdayCake("Baby's First Birthday Cake", "vanilla", false, 1, 1);
    }

    @Test
    public void canGetTiers(){
        assertThat(birthdayCake.getTiers()).isEqualTo(1);
    }
    @Test
    public void canSetTiers(){
        birthdayCake.setTiers(5);
        assertThat(birthdayCake.getTiers()).isEqualTo(5);
    }

    @Test
    public void canGetCandles(){
        assertThat(birthdayCake.getCandles()).isEqualTo(1);
    }
    @Test
    public void canSetCandles(){
        birthdayCake.setCandles(18);
        assertThat(birthdayCake.getCandles()).isEqualTo(18);
    }

    @Test
    public void hasBirthdayMessage_noArguments(){;
        assertThat(birthdayCake.birthdayMessage()).isEqualTo("Happy Birthday!");
    }
    @Test
    public void hasBirthdayMessage_withArguments(){
        assertThat(birthdayCake.birthdayMessage("Baby")).isEqualTo("Happy Birthday, Baby!");
    }

}
