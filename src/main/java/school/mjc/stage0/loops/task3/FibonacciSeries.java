package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int f1 = 0;
        int f2 = 1;

        if (lastFibonacci <= 1)
            System.out.println(lastFibonacci);
        else{
            System.out.println(f1);
            System.out.println(f2);
            for (int i=2; i<lastFibonacci; i++){
                int f3 = f1 + f2;
                System.out.println(f3);
                f1 = f2;
                f2 = f3;
            }
        }

    }
}
