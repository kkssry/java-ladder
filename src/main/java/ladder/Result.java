package ladder;

import java.util.*;

public class Result {
    private static ArrayList<String> valueMatchName = new ArrayList<>();            // 예를들어, 결과값 배열에서 첫번째 이름에 해당하는 값을 가장 먼저 넣어주고
                                                                                    //                          두번째 이름에 해당하는 값을 그 다음에 넣어준다.
    public static void ladderResult(ArrayList<Line> all, String[] resultValue) {
        for (int i = 0; i < resultValue.length; i++) {
            int index = ladderResult(all, i);
            valueMatchName.add(resultValue[index]);
        }
    }

    private static int ladderResult(ArrayList<Line> ladder, int position) {
        for (int j = 0; j < ladder.size(); j++) {
            if(ladder.get(j).getPoints().get(position)) {
                position++;
                continue;
            }
            if(position>0 && ladder.get(j).getPoints().get(position-1))
                position--;
            continue;
        }
        return position;
    }

    public static Map<String, String> matchName(String[] names) {
        Map<String, String> NameAndValue = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            NameAndValue.put(names[i], valueMatchName.get(i));
        }
        return NameAndValue;
    }
}
