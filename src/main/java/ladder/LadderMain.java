package ladder;

import java.util.*;

public class LadderMain {
    public static void main(String[] args) {
        ArrayList<Row> all = new ArrayList<>();
        int peopleCount = InputView.inputPeople();
        int height = InputView.inputHeight();

        LadderMake Make = new LadderMake(height);
        all = Make.rowMake(peopleCount);

        PrintView.valuePrint(all);
    }
}
