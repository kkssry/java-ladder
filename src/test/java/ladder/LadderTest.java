package ladder;

import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;


public class LadderTest {

    @Test
    public void randomBoolean() {
        Random rnd = new Random();
        boolean Bvalue = rnd.nextBoolean();
        assertThat(Bvalue).isEqualTo(true);
    }

    @Test
    public void trueValue() {
        Random rnd = new Random();
        boolean condition = rnd.nextBoolean();

        assertThat(condition).isEqualTo(true);
    }


}
