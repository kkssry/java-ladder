package ladder;

import java.util.*;

public class Line {
    private ArrayList<Boolean> points = new ArrayList<>();

    public Line(int countOfPerson) {
        this.points = LineMake(countOfPerson);
    }

    public ArrayList<Boolean> LineMake(int countOfPerson) {
        ArrayList<Boolean> points = new ArrayList<>();
        firstValue(points);								// 1번째 값은  임외의 boolean값을 받는다.
        for (int i = 1; i < countOfPerson-1; i++) {		// 페달 수는 사람수보다 1보다 적으므로 1개를 뺏다.
            isPreviousTrue(i ,points );					// 2번째 값부터 이전 값에따라 다르다.
        }
        points.add(false);
        return points;
    }

    private void firstValue(ArrayList<Boolean> points) {
        Random rnd = new Random();
        points.add(rnd.nextBoolean());
    }

    private void isPreviousTrue(int i, ArrayList<Boolean> points) {
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
