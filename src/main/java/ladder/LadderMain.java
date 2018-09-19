package ladder;

public class LadderMain {
    public static void main(String[] args) {
        int peopleCount = InputView.inputPeople();
        int height = InputView.inputHeight();
        String[][] dimension = new String[height][2*peopleCount-1];
        LadderMake.makeLadder(dimension);
        PrintView.valuePrint(dimension);
    }
}
