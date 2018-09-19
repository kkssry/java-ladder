package ladder;

public class PrintView {
    public static void valuePrint( String[][] dimension){
        for (int i = 0; i < dimension.length; i++) {
            valuePrint(dimension[i]);
            System.out.println();
        }
    }

    private static void valuePrint(String[] strings) {
        for (int j = 0; j < strings.length; j++) {
            System.out.print(strings[j]);
        }
    }
}
