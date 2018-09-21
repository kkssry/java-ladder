package ladder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;


public class LadderTest {

    @Test
    public void arithmetic(){
        int num = 2*5-1;
        assertEquals(9,num);
    }

    @Test
    public void randomBoolean(){
        Random rnd = new Random();
        boolean Bvalue = rnd.nextBoolean();
        assertThat(Bvalue).isEqualTo(true);
    }

    @Test
    public void trueValue(){
        Random rnd = new Random();
        boolean condition = rnd.nextBoolean();

        assertThat(condition).isEqualTo(true);
    }

    @Test
    public void ascii(){
        char cha = 'A';
        assertThat(cha+1).isEqualTo('B');
    }

    @Test
    public void row(){
        Row row = new Row(5);
        System.out.println(row.getPedal().get(0)==true);
    }

}
