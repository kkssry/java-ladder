package ladder;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RowTest {

    @Test
    public void row(){
        Row row = new Row(5);
        assertThat(row.getPoints().get(0)).isEqualTo(true);
    }

    @Test
    public void rowCount(){
        Row row = new Row(5);
        row.getPoints();
        System.out.println(row.getPoints());
    }
}
