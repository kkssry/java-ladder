package ladder;

import java.util.Scanner;

public class InputView {
        static Scanner scan = new Scanner(System.in);

    public static int inputPeople() {
        System.out.println("참여할 사람은 몇 명 인가요?");
        return scan.nextInt();
    }

    public static int inputHeight() {
        System.out.println("최대 사다리 높이는 몇 개 인가요?");
        return scan.nextInt();
    }
}
