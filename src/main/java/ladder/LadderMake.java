package ladder;

import java.util.*;

public class LadderMake {
    private static final String LADDER = "|";
    private static final String DASH = "-";
    private static final String BLANK = " ";

    public static void makeLadderCall(String[][] dimension){
        for (int i = 0; i < dimension.length; i++) {
            makeLadder(dimension[i]);
        }
    }

    public static void makeLadder(String[] dimension) {
        Random rnd = new Random();
        for (int j = 0; j < dimension.length; j++) {
            if(j%2==0)
                dimension[j] = LADDER;

            if (j % 2 == 1) {
               int randomValue = rnd.nextInt(2);
                dimension[j] = (randomValue == 0) ? BLANK:DASH;
            }
        }
    }
}
