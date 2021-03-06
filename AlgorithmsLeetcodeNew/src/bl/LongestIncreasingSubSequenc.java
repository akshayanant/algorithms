package bl;

import java.util.Arrays;

/**
 * Created by Akshay Hegde on 9/9/2019.
 * 300. Longest Increasing Subsequence
 Medium

 2924

 68

 Favorite

 Share
 Given an unsorted array of integers, find the length of longest increasing subsequence.

 Example:

 Input: [10,9,2,5,3,7,101,18]
 Output: 4
 Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
 Note:

 There may be more than one LIS combination, it is only necessary for you to return the length.
 Your algorithm should run in O(n2) complexity.
 Follow up: Could you improve it to O(n log n) time complexity?



 */
public class LongestIncreasingSubSequenc {
    public int lengthOfLIS(int[] nums) {
        if(nums.length<2){
            return nums.length;
        }
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[i]>nums[j]&&1+dp[j]>dp[i]){
                    dp[i] = 1+dp[j];
                }
            }
        }
        int max =1;
        for (int i = 1; i < dp.length; i++) {
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}
