package ladder;

import java.util.*;

public class PrintView {
    private static final String VERTICAL = "|";
    private static final String DASH = "-";
    private static final String BLANK = " ";

    public static void valuePrint(ArrayList<Row> all) {
        for (int i = 0; i < all.size(); i++) {
            valuePrint(all.get(i));
            System.out.println();
        }
    }

    private static void valuePrint(Row row) {
        for (int j = 0; j < row.getPoints().size(); j++) {
            System.out.print(VERTICAL);
            if (j == row.getPoints().size() - 1)
                break;
            if (row.getPoints().get(j)) {
                System.out.print(DASH);
                continue;
            }
            System.out.print(BLANK);
        }
    }
}

