import java.util.Scanner;

public class AdjacentSquares {

    static boolean areAdjacent(int[] square1, int[] square2) {
        int xDiff = Math.abs(square1[0] - square2[0]);
        int yDiff = Math.abs(square1[1] - square2[1]);
        return (xDiff == 1 && yDiff == 0) || (xDiff == 0 && yDiff == 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of squares (N):");
        int N = scanner.nextInt();
        int[][] squares = new int[N][8];

        System.out.println("Enter the coordinates for each square:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 8; j++) {
            	System.out.println("Enter value");
                squares[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            int adjacentCount = 0;
            for (int j = 0; j < N; j++) {
                if (i != j && areAdjacent(squares[i], squares[j])) {
                    adjacentCount++;
                }
            }
            System.out.println("Square " + (i + 1) + " has " + adjacentCount + " adjacent squares.");
        }
    }
}
