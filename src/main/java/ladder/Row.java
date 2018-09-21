package ladder;

import java.util.*;

public class Row {
    ArrayList<Boolean> booleanValue = new ArrayList<>();

    public Row(int pedalCount) {
        pedal(pedalCount);
    }

    public ArrayList<Boolean> pedal(int pedalCount) {
        Random rnd = new Random();
        for (int i = 0; i < pedalCount; i++) {
            booleanValue.add(rnd.nextBoolean());
        }
        return booleanValue;
    }

    public ArrayList<Boolean> getPedal(){
        return booleanValue;
    }
}
