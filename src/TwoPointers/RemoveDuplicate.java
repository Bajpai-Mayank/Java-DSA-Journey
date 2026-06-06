package TwoPointers;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        RemoveDuplicate obj = new RemoveDuplicate();
        obj.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
    }

    public void removeDuplicates(int[] nums) {
        int k = 0;//I have taken it as indicies and size both at once
        int left = 0, right = nums.length - 1, temp = 0;
        while (left < right) {
            if (nums[left] != nums[left + 1]) {
                temp = nums[left + 1];
                k++;
            }
            nums[k] = temp;
            left++;
        }
        System.out.println(k + " ," + Arrays.toString(nums));
    }
}
