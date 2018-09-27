package ladder;

import java.util.*;

public class AllLine {
    private static final String DIVISION = ",";
    private static final int LIMIT_NUMBER = 5;
    private int height;

    public AllLine(int height) {
        this.height = height;
    }

    public ArrayList<Line> allLineMake(int countOfPerson) {
        ArrayList<Line> allLine = new ArrayList<>();
        for (int i = 0; i < height; i++)
            allLine.add(new Line(countOfPerson));
        return allLine;
    }

    public static String[] nameCheck(String inputName) {
        String[] names = valueSplit(inputName);
        for (int i = 0; i < names.length; i++) {
            if( names[i].length()>LIMIT_NUMBER || names[i].trim().isEmpty()) {
                PrintView.reWrite();
                names = nameCheck(InputView.inputName());
                break;
            }
        }
        return names;
    }

    public static String[] valueSplit(String value) {
        String[] values = value.split(DIVISION);
        return values;
    }
}

