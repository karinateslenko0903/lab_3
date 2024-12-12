import java.util.Scanner;
import java.util.Random;

public class MASS_2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();


            System.out.print("Введіть розмір матриці (N): ");
            int n = scanner.nextInt();


            double[][] matrix = new double[n][n];


            System.out.println("Матриця:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = -50 + (100 * random.nextDouble());
                    System.out.printf("%8.2f", matrix[i][j]);
                }
                System.out.println();
            }

            System.out.print("Введіть номер рядка (0-" + (n - 1) + "): ");
            int row = scanner.nextInt();

            if (row < 0 || row >= n) {
                System.out.println("Неправильний номер рядка.");
            } else {

                double max = matrix[row][0];
                double min = matrix[row][0];

                for (int j = 1; j < n; j++) {
                    if (matrix[row][j] > max) {
                        max = matrix[row][j];
                    }
                    if (matrix[row][j] < min) {
                        min = matrix[row][j];
                    }
                }


                System.out.println("Максимальний елемент у рядку " + row + ": " + max);
                System.out.println("Мінімальний елемент у рядку " + row + ": " + min);
            }

            scanner.close();
        }
    }
