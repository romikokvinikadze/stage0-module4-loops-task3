package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int ans = 0;

        t = Math.abs(t);
        while (t > 0){
            int tmp = t % 10;
            ans += tmp;
            t /= 10;
        }

        System.out.println(ans);
    }
}
