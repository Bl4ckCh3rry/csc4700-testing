package csc4700;

import java.util.Arrays;

/**
 * Created by jdob on 2/22/15.
 */
public class NumbersDemo {

    public int sum(int[] nums) {
        int total = 0;
        for (int i : nums) {
            total += i;
        }
        return total;
    }

    public float average(int[] nums) {
        int total = this.sum(nums);
        float avg = (float)total / nums.length;
        return avg;
    }

}
