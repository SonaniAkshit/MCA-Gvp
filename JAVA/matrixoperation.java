import java.util.Scanner;

class matrixoperation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions of matrices
        System.out.print("Enter number of rows of matrix: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns of matrix: ");
        int columns = scanner.nextInt();

        // Initialize matrices
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] resultMatrix = new int[rows][columns];

        // Input elements of matrix1
        System.out.println("Enter elements of matrix1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input elements of matrix2
        System.out.println("Enter elements of matrix2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Perform Addition
        System.out.println("Matrix Addition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // Perform Subtraction
        System.out.println("Matrix Subtraction:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // Perform Multiplication
        // Only proceed if the number of columns in matrix1 is equal to the number of rows in matrix2
        if (columns == rows) {
            int[][] productMatrix = new int[rows][columns];
            System.out.println("Matrix Multiplication:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    productMatrix[i][j] = 0;
                    for (int k = 0; k < columns; k++) {
                        productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                    System.out.print(productMatrix[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix multiplication is not possible with the given matrices.");
        }

        scanner.close();
    }
}
