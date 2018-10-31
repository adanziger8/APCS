package Ch7Arrays;

public class Arrays2D {
    public static void main(String[] args) {
        int[][] table = new int[5][10];

        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                table[row][col] = (row + 1) * (col + 1);
            }
        }
                for (int row = 0; row < table.length; row++) {
                    for (int col = 0; col < table[row].length; col++) {
                        System.out.print(table[row][col] + "\t");
                    }
                    System.out.println();
                }
            }
        }