public class BruteForce {
    public static void main(String[] args) {
        // Test case 1
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Test Case 1:");
        printMatrix(rotate(matrix1));

        // Test case 2
        int[][] matrix2 = {
            {5, 1, 9, 11},
            {2, 4, 8, 10},
            {13, 3, 6, 7},
            {15, 14, 12, 16}
        };
        System.out.println("Test Case 2:");
        printMatrix(rotate(matrix2));

        // Test case 3: A 1x1 matrix
        int[][] matrix3 = {
            {1}
        };
        System.out.println("Test Case 3:");
        printMatrix(rotate(matrix3));

        // Test case 4: A 2x2 matrix
        int[][] matrix4 = {
            {1, 2},
            {3, 4}
        };
        System.out.println("Test Case 4:");
        printMatrix(rotate(matrix4));

        // Test case 5: A 3x3 matrix with negative numbers
        int[][] matrix5 = {
            {-1, -2, -3},
            {-4, -5, -6},
            {-7, -8, -9}
        };
        System.out.println("Test Case 5:");
        printMatrix(rotate(matrix5));

        // Test case 6: A 4x4 matrix with random values
        int[][] matrix6 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        System.out.println("Test Case 6:");
        printMatrix(rotate(matrix6));

        // Test case 7: A 3x3 matrix with all elements the same
        int[][] matrix7 = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };
        System.out.println("Test Case 7:");
        printMatrix(rotate(matrix7));
    }



    public static int[][] rotate(int[][] matrix){
        int n = matrix.length;
        int rotated[][] = new int[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                rotated[j][n-i-1]  = matrix[i][j];
            }
        }
        return rotated;


    }



    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    
}
