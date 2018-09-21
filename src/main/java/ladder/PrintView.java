package ladder;

import java.util.ArrayList;

public class PrintView {
    private static String vertical = "|";
    private static String dash = "-";
    private static String blank = " ";
    private static int count = 0;

    public static void valuePrint( ArrayList<Row> all) {
        for (int i = 0; i < all.size(); i++) {
            valuePrint(all, i);
            System.out.println();
            }
        }

    private static void valuePrint(ArrayList<Row> all, int i) {
        for (int j = 0; j < all.get(i).getPedal().size(); j++) {
                System.out.print(vertical);
                if (j == all.get(i).getPedal().size()-1)
                    break;
                isTrue(all, i, j);
        }
    }

    private static void isTrue(ArrayList<Row> all, int i, int j) {
        if(all.get(i).getPedal().get(j)==true && count == 0) {
                System.out.print(dash);
                count++;
                return;
        }

        if (all.get(i).getPedal().get(j)==false || count != 0) {
            System.out.print(blank);
            count = 0;
        }
    }
}

