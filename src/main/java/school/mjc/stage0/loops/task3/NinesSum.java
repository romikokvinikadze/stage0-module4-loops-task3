package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int ans = 0;

        int current = 9;

        for (int i=1; i<=lengthOfLastNumber; i++){
            ans += current;
            current = current * 10 + 9;
        }

        System.out.println(ans);
    }
}
