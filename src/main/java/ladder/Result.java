package ladder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Result {
    private static ArrayList<String> ladderResult = new ArrayList<>();

    public static String[] resultCheck(String[] names,String inputResult) {
        String[] gameResult = AllLine.valueSplit(inputResult);
        if(names.length != gameResult.length) {
            PrintView.notLengthMatch();
            gameResult = resultCheck(names,InputView.inputResult());
        }
        return gameResult;
    }

    public static void ladderResult(ArrayList<Line> ladder,String[] resultValue) {
        for (int h = 0; h < ladder.get(0).getPoints().size(); h++) {
            int position = h;
            position = ladderResult(ladder, position);
            ladderResult.add(resultValue[position]);
        }
//		System.out.println(ladderResult);
    }

    private static int ladderResult(ArrayList<Line> ladder, int position) {
        for (int i = 0; i < ladder.size(); i++) {
            if(ladder.get(i).getPoints().get(position)) {
                position++;
                continue;
            }
            if(position>0 && ladder.get(i).getPoints().get(position-1))
                position--;
            continue;
        }
        return position;
    }

    public static Map<String, String> matchingName(String[] names) {
        Map<String, String> NameAndValue = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            NameAndValue.put(names[i], ladderResult.get(i));
        }
        return NameAndValue;
    }


}
