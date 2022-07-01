package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
//        System.out.println(gcd(first, second));

        if (first == 0 || first == second)
            System.out.println(second);
        else if (second == 0)
            System.out.println(first);
        else {
            int min = Math.min(first, second);
            int res = 0;

            for (int i = 1; i <= min; i++) {
                if (first % i == 0 && second % i == 0)
                    res = i;
            }

            System.out.println(res);
        }
    }

//    public static int gcd(int a, int b){
//        if (a == 0 || a == b)
//            return b;
//        else if (b == 0)
//            return a;
//
//        if (a > b)
//            return gcd(a - b, b);
//        return gcd(a, b - a);
//    }
}
