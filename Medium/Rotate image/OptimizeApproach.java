
public class OptimizeApproach {

    public static void main(String[] args) {
        // Test case 1
        int[][] matrix1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println("Test Case 1:");
        transposeMatix(matrix1);
        reverseRows(matrix1);
        printMatrix(matrix1);

        // Test case 2
        int[][] matrix2 = {
                { 5, 1, 9, 11 },
                { 2, 4, 8, 10 },
                { 13, 3, 6, 7 },
                { 15, 14, 12, 16 }
        };
        System.out.println("Test Case 2:");
        transposeMatix(matrix2);
        reverseRows(matrix2);
        printMatrix(matrix2);

        // Test case 3: A 1x1 matrix
        int[][] matrix3 = {
                { 1 }
        };
        System.out.println("Test Case 3:");
        transposeMatix(matrix3);
        reverseRows(matrix3);
        printMatrix(matrix3);

        // Test case 4: A 2x2 matrix
        int[][] matrix4 = {
                { 1, 2 },
                { 3, 4 }
        };
        System.out.println("Test Case 4:");
        transposeMatix(matrix4);
        reverseRows(matrix4);
        printMatrix(matrix4);

        // Test case 5: A 3x3 matrix with negative numbers
        int[][] matrix5 = {
                { -1, -2, -3 },
                { -4, -5, -6 },
                { -7, -8, -9 }
        };
        System.out.println("Test Case 5:");
        transposeMatix(matrix5);
        reverseRows(matrix5);
        printMatrix(matrix5);

        // Test case 6: A 4x4 matrix with random values
        int[][] matrix6 = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        System.out.println("Test Case 6:");
        transposeMatix(matrix6);
        reverseRows(matrix6);
        printMatrix(matrix6);

        // Test case 7: A 3x3 matrix with all elements the same
        int[][] matrix7 = {
                { 1, 1, 1 },
                { 1, 1, 1 },
                { 1, 1, 1 }
        };
        System.out.println("Test Case 7:");
        transposeMatix(matrix7);
        reverseRows(matrix7);
        printMatrix(matrix7);

    }

    private static void transposeMatix(int matrix[][]) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }

    private static void reverseRows(int matrix[][]) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n-1;
            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

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
