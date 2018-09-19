package ladder;

public class PrintView {
    public static void valuePrint( String[][] dimension){
        for (int i = 0; i < dimension.length; i++) {
            for (int j = 0; j < dimension[i].length; j++) {
                System.out.print(dimension[i][j]);
            }
            System.out.println();
        }
    }
}
