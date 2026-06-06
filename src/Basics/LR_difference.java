package Basics;

import java.util.Arrays;

public class LR_difference {
    public static void main(String[] args) {
        LR_difference lrd = new LR_difference();
        lrd.leftRightDifference(new int[]{1});
    }

    public void leftRightDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int lt = 1, rt = nums.length - 2;
        System.out.println(rt);
        int i = 0, r = nums.length - 1, sumr = 0, suml = 0;
        while (lt <= nums.length - 1) {
            suml += nums[i++];
            left[lt++] = suml;
            sumr += nums[r--];
            right[rt--] = sumr;
        }
        for (int j = 0; j < nums.length; j++) {
            nums[j] = Math.abs(left[j] - right[j]);
        }
        System.out.println(Arrays.toString(nums));
    }
}
