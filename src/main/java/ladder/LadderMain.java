package ladder;

import java.util.*;

public class LadderMain {
    public static void main(String[] args) {
        String[] names = AllLine.nameCheck(InputView.inputName());
        String[] resultValue = Result.resultCheck(names,InputView.inputResult());
        int height = InputView.inputHeight();

        AllLine allLine = new AllLine(height);
        ArrayList<Line> ladder;
        ladder = allLine.allLineMake(names.length);

        PrintView.valuePrint(names);
        PrintView.ladderPrint(ladder);
        PrintView.valuePrint(resultValue);

        Result.ladderResult(ladder,resultValue);
        Map<String, String> NameAndValue = Result.matchingName(names);
        PrintView. finalResult(NameAndValue,InputView.choicePerson());

    }
}
