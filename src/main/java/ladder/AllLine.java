package ladder;

import java.util.*;

public class AllLine {
    public static ArrayList<Line> allLineMake(int countOfPerson, int height) {
        ArrayList<Line> allLine = new ArrayList<>();
        for (int i = 0; i < height; i++)
            allLine.add(new Line(countOfPerson));
        return allLine;
    }
}

