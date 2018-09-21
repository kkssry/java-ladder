package ladder;

import java.util.ArrayList;

public class LadderMake {
    ArrayList<Row> list = new ArrayList<>();
    int height;

    public LadderMake(int height) {
        this.height = height;
    }

    public  ArrayList<Row> rowMake (int pedalCount) {
        for (int i = 0; i < height; i++)
             list.add(new Row(pedalCount));
        return list;
    }
}

