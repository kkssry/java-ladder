package ladder;

import java.util.*;

public class LadderMain {
    public static void main(String[] args) {
        String[] names = InputView.nameCheck(InputView.inputName());
        String[] resultValue = InputView.resultLengthCheck(names, InputView.inputResult());
        int height = InputView.inputHeight();

        ArrayList<Line> ladder = AllLine.allLineMake(names.length, height);

        PrintView.valuePrint(names);
        PrintView.ladderPrint(ladder);
        PrintView.valuePrint(resultValue);

        Result.ladderResult(ladder, resultValue);
        PrintView.isName(Result.matchName(names), InputView.choicePerson());
    }
}
