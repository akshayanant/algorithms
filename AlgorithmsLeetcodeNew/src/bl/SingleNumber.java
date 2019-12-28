package bl;

import java.util.Arrays;

/**
 * Created by Akshay Hegde on 6/18/2019.
 *
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.

 Note:

 Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

 Example 1:

 Input: [2,2,1]
 Output: 1
 Example 2:

 Input: [4,1,2,1,2]
 Output: 4

 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[0]^=nums[i];
        }
        return nums[0];
    }
}
