package ladder;

import java.util.Scanner;

public class InputView {
    static Scanner scan = new Scanner(System.in);

    public static String inputName() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        return scan.next();
    }

    public static String inputResult() {
        System.out.println("실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)");
        return scan.next();
    }

    public static int inputHeight() {
        System.out.println("최대 사다리 높이는 몇 개 인가요?");
        return scan.nextInt();
    }

    public static String choicePerson() {
        System.out.println("결과를 보고 싶은 사람은?");
        return scan.next();
    }
}
