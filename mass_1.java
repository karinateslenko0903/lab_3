public class mass_1 {
    public static void main(String[] args) {
        double[] numbers = {-3.5, -7.2, 4.1, -9.6, 0, 2.5, -1.3, -23.3};
        Double maxNegative = null;
        for (double num : numbers) {
            if (num < 0) {
                if (maxNegative == null || Math.abs(num) > Math.abs(maxNegative)) {
                    maxNegative = num;
                }
            }
        }

        if (maxNegative != null) {
            System.out.println("Максимальне за модулем від'ємне число: " + maxNegative);
        } else {
            System.out.println("У масиві немає від'ємних чисел.");
        }
    }
}
