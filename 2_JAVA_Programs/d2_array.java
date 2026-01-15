public class d2_array {
    public static void main(String[] args) {

        int[][] marks = { { 10, 20, 30, }, { 45, 87, 69 } };

        int i = 0;
        while (i < marks.length) {
            int j = 0;
            while (j < marks[i].length) {
                System.out.print(marks[i][j] + "\t");
                j++;
            }
            System.out.println();
            i++;

        }

    }

}
