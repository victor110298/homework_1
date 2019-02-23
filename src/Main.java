import java.util.Random;

public class Main {

    //Task 1.1

    public static void matchScore(int a, int b, int c, int d) {
        System.out.println("Real score " + a + ":" + b);
        System.out.println("Users score " + c + ":" + d);
        int y = a == c && b == d ? 2 : 0;
        if (y == 2) {
            System.out.println("U have 2 points");
        } else if (a > b)
            System.out.println("U have " + (a > b ? (c > d ? 1 : 0) : 0) + " points");
        else if (a == b)
            System.out.println("U have " + (a == b ? (c == d ? 1 : 0) : 0) + " points");
        else
            System.out.println("U have " + (a < b ? (c < d ? 1 : 0) : 0) + " points");
    }


    //Task 1.2


    public static void drawDiamond(int num) {
        int prob;
        int z = 1;
        int i;
        for (i = 0; i <= num / 2 + 1; ++i) {
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

        for (i = num / 2; i >= 0; --i) {
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


    public static void num(double x, double y) {
        double square = x * x;
        double cube = x * x * x;
        double power = Math.pow(x, y);
        System.out.println(" squre " + square + " cube " + cube + " power " + power);
    }


// Task 1.4

public static void fibonacci(int num){
        int i=0;
        int z=0;
        int y=1;
    System.out.print("0 1 ");
        do {
            int a=y+z;
            System.out.print(+a+" ");
            z=y;
            y=a;
            i++;
        }
        while (i<num);
}
public static void factorial(int num){
       int i=1;
    int x=1;
        do {
            x=x*i;
            i++;
        }
        while (i<=num);
    System.out.println("Result is "+x);

}


    public static void main(String[] args) {
//        System.out.println("Task 1.1");
//        matchScore(1, 0, 2, 1);
//        System.out.println("Task 1.2");
//        drawDiamond(7);
//        System.out.println("Task 1.3");
//        num(3, 5);
//        System.out.println("Task 1.4");
//        fibonacci(5);
//        factorial(4);
        Sort s = new Sort();
        s.checkSorts();

    }


}

