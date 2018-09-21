package ladder;

import java.util.*;

public class LadderMain {
    static ArrayList<Row> all = new ArrayList<>();

    public static void main(String[] args) {
        int peopleCount = InputView.inputPeople();
        int height = InputView.inputHeight();

        LadderMake make = new LadderMake(height);
        all = make.rowMake(peopleCount);

        PrintView.valuePrint(all);
    }
}
