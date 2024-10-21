import java.util.Arrays;
import java.util.Random;

public class ArrayAverage {
    public static void main(String[] args) {
        Random random = new Random();
        int[] evenNumbers = new int[20];

        // Заполнение массива случайными чётными числами
        for (int i = 0; i < evenNumbers.length; i++) {
            evenNumbers[i] = random.nextInt(100) * 2;
        }

        System.out.println("Массив: " + Arrays.toString(evenNumbers));

        int min = Arrays.stream(evenNumbers).min().getAsInt();
        int max = Arrays.stream(evenNumbers).max().getAsInt();

        int sum = 0;
        int count = 0;

        for (int num : evenNumbers) {
            if (num != min && num != max) {
                sum += num;
                count++;
            }
        }

        double average = (double) sum / count;
        System.out.println("Среднее арифметическое без минимального и максимального: " + average);
    }
}