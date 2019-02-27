import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class Main {
    private static int[] arr;
    private static long start;

    public Main() {
    }

    public static int matchScore(int realScore1, int realScore2, int score1, int score2) {
        return realScore1 == score1 && realScore2 == score2 ? 2 : ((realScore1 <= realScore2 || score1 <= score2) && (realScore1 >= realScore2 || score1 >= score2) ? 0 : 1);
    }

    public static void drawDiamond(int num) {
        int z = 1;

        int prob;
        int i;
        for(i = 0; i <= num / 2 + 1; ++i) {
            prob = (num - z) / 2;

            for(i = 0; i <= prob; ++i) {
                System.out.print(" ");
            }

            for(i = 0; i < z; ++i) {
                System.out.print("*");
            }

            System.out.println();
            z += 2;
        }

        z = num - 1;

        for(i = num / 2; i >= 0; --i) {
            prob = (num - z) / 2;

            for(i = 0; i <= prob; ++i) {
                System.out.print(" ");
            }

            for(i = 0; i <= z; ++i) {
                System.out.print("*");
            }

            System.out.println();
            z -= 2;
        }

    }

    public static int powerNumber(int number, int power) {
        int result = number;

        for(int i = 0; i < power - 1; ++i) {
            result *= number;
        }

        return result;
    }

    public static int factorial(int n) {
        return n == 1 ? 1 : n * factorial(n - 1);
    }

    public static int getFibo(int n) {
        if (n > 1) {
            return getFibo(n - 2) + getFibo(n - 1);
        } else {
            return n == 1 ? 1 : 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Task 1.5");
        int[] numbers = IntStream.generate(() -> {
            return (int)(Math.random() * 2.5431111E7D) - 200000;
        }).limit(1000000L).toArray();
        int n = numbers.length;
        System.out.println("Array length: " + numbers.length);
        System.out.println("1-st element of array  before sort : " + numbers[0]);
        System.out.println("Last element of array  before sort : " + numbers[numbers.length - 1]);
        long startTime = System.currentTimeMillis();
        Sort.bubble_Sort(numbers);
        long spendTime = System.currentTimeMillis() - startTime;

        for(int h = 0; h < n; ++h) {
            System.out.println(numbers[h] + " ");
        }

        System.out.println("Array length: " + numbers.length);
        System.out.println("1-st element of array  after sort : " + numbers[0]);
        System.out.println("Last element of array  after sort : " + numbers[numbers.length - 1]);
        System.out.println(" ");
        System.out.println(" Spend time for sorting: " + spendTime);
        Sort.quickSort(numbers);
        long quickTime = System.currentTimeMillis() - startTime;

        for(int h = 0; h < n; ++h) {
            System.out.println(numbers[h] + " ");
        }

        System.out.println("Array length: " + numbers.length);
        System.out.println("1-st element of array  after sort : " + numbers[0]);
        System.out.println("Last element of array  after sort : " + numbers[numbers.length - 1]);
        System.out.println(" ");
        System.out.println(" Spend time for sorting: " + quickTime);
        Sort.selectionSort(numbers);
        long selectionTime = System.currentTimeMillis() - startTime;

        for(int h = 0; h < n; ++h) {
            System.out.println(numbers[h] + " ");
        }

        System.out.println("Array length: " + numbers.length);
        System.out.println("1-st element of array  after sort : " + numbers[0]);
        System.out.println("Last element of array  after sort : " + numbers[numbers.length - 1]);
        System.out.println(" ");
        System.out.println(" Spend time for sorting: " + selectionTime);
        Sort.insertionSort(numbers);
        long insertionTime = System.currentTimeMillis() - startTime;

        for(int h = 0; h < n; ++h) {
            System.out.println(numbers[h] + " ");
        }

        System.out.println("Array length: " + numbers.length);
        System.out.println("1-st element of array  after sort : " + numbers[0]);
        System.out.println("Last element of array  after sort : " + numbers[numbers.length - 1]);
        System.out.println(" ");
        System.out.println(" Spend time for sorting: " + insertionTime);
        Sort.heapSort(numbers);
        long heapTime = System.currentTimeMillis() - startTime;

        for(int h = 0; h < n; ++h) {
            System.out.println(numbers[h] + " ");
        }

        System.out.println("Array length: " + numbers.length);
        System.out.println("1-st element of array  after sort : " + numbers[0]);
        System.out.println("Last element of array  after sort : " + numbers[numbers.length - 1]);
        System.out.println(" ");
        System.out.println(" Spend time for sorting: " + heapTime);
    }
}
