package TwoPointers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AffordablePairs {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Size : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }
        System.out.print("\nBudget : ");
        int budget = sc.nextInt();

        AffordablePairs obj = new AffordablePairs();

        System.out.printf("\nTotal no. of Possible pairs : %d"
                , obj.countAffordablePairs(nums, budget));
    }

    public int countAffordablePairs(List<Integer> prices, int budget) {
        int count = 0, right = prices.size() - 1, left = 0;
        while (left < right) {
            int sum = prices.get(left) + prices.get(right);
            if (sum <= budget) {
                count += right - left;
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}
