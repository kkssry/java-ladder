package ladder;

import java.util.*;

public class Row {
    private static final int FIRST = 0;
    private ArrayList<Boolean> points = new ArrayList<>();

    public Row(int pedalCount) {
        Line(pedalCount);
    }

    public void Line(int countOfPerson) {
        for (int i = 0; i < countOfPerson; i++) {
            isFirst(i);
        }
    }

    private void isFirst(int i) {
        if (i == FIRST) {
            FirstValue(i);
            return;
        }
        notFirstValue(i);
    }

    private void FirstValue(int i) {
        Random rnd = new Random();
        points.add(rnd.nextBoolean());
    }

    private void notFirstValue(int i) {
        Random rnd = new Random();
        if (points.get(i - 1)) {
            points.add(false);
            return;
        }
        points.add(rnd.nextBoolean());
    }

    public ArrayList<Boolean> getPoints() {
        return points;
    }
}
