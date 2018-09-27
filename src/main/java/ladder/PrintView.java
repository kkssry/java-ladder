package ladder;

import java.util.*;

public class PrintView {
    private static final String VERTICAL = "|";
    private static final String DASH = "-----";
    private static final String VERTICAL_WIDTH = "     "; // 5칸
    private static final String BLANK = " "; 			  // 1칸

    public static void valuePrint(String[] names) {
        for (int i = 0; i < names.length; i++) {
            System.out.print(BLANK);
            blankCount(i,names);
            System.out.print(names[i]);
        }
        System.out.println();
    }

    private static void blankCount(int i, String[] names) {
        for (int j = names[i].length(); j < VERTICAL_WIDTH.length(); j++) {
            System.out.print(BLANK);
        }
    }

    public static void ladderPrint(ArrayList<Line> all) {
        for (int i = 0; i < all.size(); i++) {
            valuePrint(all.get(i));
            System.out.println();
        }
    }

    private static void valuePrint(Line line) {
        System.out.print(VERTICAL_WIDTH);
        for (int i = 0; i < line.getPoints().size()-1; i++) {					//마지막값은 무조건 false이므로 마지막전까지만 반복횟수로 지정한다.
            System.out.print(VERTICAL);
            String isPedal = line.getPoints().get(i) ? DASH : VERTICAL_WIDTH;
            System.out.print(isPedal);
        }
        System.out.print(VERTICAL);
    }

    public static void reWrite() {
        System.out.println("값이 없거나 다섯글자를 초과하였습니다.");
    }

    public static void notLengthMatch() {
        System.out.println("인원수와 일치하지 않습니다.");
    }

    public static void finalResult(Map<String, String> nameAndValue, String name) {
        System.out.println("실행 결과");
        if(nameAndValue.containsKey(name)) {
            String resultValue = nameAndValue.get(name);
            System.out.println(resultValue);
            finalResult(nameAndValue,InputView.choicePerson());					//all을 입력할때까지 게임 결과를 물어본다.
        }
        if(name.equals("all"))
            allPrint(nameAndValue);
    }

    private static void allPrint(Map<String, String> nameAndValue) {
        Iterator<Map.Entry<String, String>> nameAndValueList = nameAndValue.entrySet().iterator();
        while(nameAndValueList.hasNext()) {
            Map.Entry<String, String> nameWithValue = nameAndValueList.next();
            String key = nameWithValue.getKey();
            String value = nameWithValue.getValue();
            System.out.println(key + ":" + value);
        }
    }

}
