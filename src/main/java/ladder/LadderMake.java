package ladder;

import java.util.*;

public class LadderMake {
    ArrayList<Row> all = new ArrayList<>();
    int height;

    public LadderMake(int height) {
        this.height = height;
    }

    public ArrayList<Row> rowMake(int peopleCount) {
        for (int i = 0; i < height; i++)
            all.add(new Row(peopleCount));
        return all;
    }
}

