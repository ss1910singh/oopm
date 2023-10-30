import java.util.Scanner;

class Array {
    int a[][], b[][], sum[][], t1[][], t2[][];
    int r, c, i, j;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows and columns:");
        r = sc.nextInt();
        c = sc.nextInt();
        a = new int[r][c];
        b = new int[r][c];
        System.out.println("Enter First Matrix:");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Second Matrix:");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                b[i][j] = sc.nextInt();
            }
        }
    }

    void addition() {
        sum = new int[r][c];
        for (i = 0; i < r; i++)
            for (j = 0; j < c; j++)
                sum[i][j] = a[i][j] + b[i][j];
    }

    void transposeMatrix1() {
        t1 = new int[c][r];
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                t1[j][i] = a[i][j];
            }
        }
        System.out.println("Transpose of First Matrix:");
        displayMatrix(t1);
    }

    void transposeMatrix2() {
        t2 = new int[c][r];
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                t2[j][i] = b[i][j];
            }
        }
        System.out.println("Transpose of Second Matrix:");
        displayMatrix(t2);
    }

    void transposeSum() {
        int[][] tSum = new int[c][r];
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                tSum[j][i] = sum[i][j];
            }
        }
        System.out.println("Transpose of Addition of Matrices:");
        displayMatrix(tSum);
    }

    void displayMatrix(int[][] matrix) {
        for (i = 0; i < c; i++) {
            for (j = 0; j < r; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Array matrix = new Array();
        matrix.read();

        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMatrix Operations Menu:");
            System.out.println("1. Transpose First Matrix");
            System.out.println("2. Transpose Second Matrix");
			System.out.println("3. Perform Addition of Matrices");
            System.out.println("4. Transpose Addition of Matrices");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    matrix.transposeMatrix1();
                    break;
                case 2:
                    matrix.transposeMatrix2();
                    break;               
                case 3:
                    matrix.addition();
                    System.out.println("Result of Addition:");
                    matrix.displayMatrix(matrix.sum);
                    break;
				case 4:
                    matrix.transposeSum();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);
    }
}
