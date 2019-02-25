import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    //Task 1.1

    public static int matchScore(int realScore1, int realScore2, int score1, int score2) {
        return (realScore1 == score1) && (realScore2 == score2) ? 2
                : ((realScore1 > realScore2) && (score1 > score2))
                || ((realScore1 < realScore2) && (score1 < score2)) ? 1 : 0;
    }


    //Task 1.2


    public static void drawDiamond(int num) {
        int prob;
        int z = 1;

        for (int i = 0; i <= num / 2 + 1; ++i) {
            prob = (num - z) / 2;

            for (i = 0; i <= prob; ++i) {
                System.out.print(" ");
            }

            for (i = 0; i < z; ++i) {
                System.out.print("*");
            }

            System.out.println();
            z += 2;
        }

        z = num - 1;

        for (int i = num / 2; i >= 0; --i) {
            prob = (num - z) / 2;

            for (i = 0; i <= prob; ++i) {
                System.out.print(" ");
            }

            for (i = 0; i <= z; ++i) {
                System.out.print("*");
            }

            System.out.println();
            z -= 2;
        }

    }


//Task 1.3


    public static int powerNumber(int number, int power) {
        int result = number;
        for (int i = 0; i < power - 1; i++) {
            result *= number;
        }
        return result;
    }

// Task 1.4

    public static int factorial(int n) {
        if (n==1)
            return 1;
        else
            return n*factorial(n-1);
    }


    public static int GetFibo(int n) {
        if (n > 1)
            return GetFibo(n - 2) + GetFibo(n - 1);
        else if (n == 1)
            return 1;
        else
            return 0;
    }



    public static void main(String[] args) {
        System.out.println("Task 1.1");
        matchScore(1, 0, 2, 1);

        System.out.println("Task 1.2");
        drawDiamond(7);

        System.out.println("Task 1.3");
        powerNumber(3, 5);

        System.out.println("Task 1.4");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите  число для вычисления Факториал(число): ");
        int n1 = sc.nextInt();
        System.out.println("Спасибо! Теперь введите число(номер елементя ряда Фибоначчи : ");
        int n2 = sc.nextInt();
        System.out.println( " Результат вычисления факториала:  !( " + n1 + " )"  + "  =   " + factorial(n1));
        System.out.println(" ");
        System.out.println( " В последовательности чисел Фибоначчи " + n2 +" -й  елемент  равен:  " + GetFibo(n2));

        System.out.println("Task 1.5");
        Sort.checkSorts();
        int[] numbers = IntStream.generate(() -> (int) (Math.random()*(25331111+100000))-200000).limit(1000000).toArray();
        int n = numbers.length;
        System.out.println("Array length: " + numbers.length);
        System.out.println("1-st element of array  before sort : "  + numbers[0]);
        System.out.println("Last element of array  before sort : " + numbers[numbers.length-1]);
        long startTime = System.currentTimeMillis();
        Sort.bubble_Sort(numbers);
        long spendTime = System.currentTimeMillis()-startTime;
        for (int h = 0; h < n; h++)
            System.out.println(numbers[h]+ " ");
        System.out.println("Array length: " + numbers.length);
        System.out.println("1-st element of array  after sort : " + numbers[0]);
        System.out.println("Last element of array  after sort : " + numbers[numbers.length-1]);
        System.out.println(" ");
        System.out.println(" Spend time for sorting: " + spendTime);

    }


}

