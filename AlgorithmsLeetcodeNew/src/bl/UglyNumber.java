package bl;

/**
 * Created by Akshay Hegde on 9/5/2019.
 *
 * Write a program to check whether a given number is an ugly number.

 Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.

 Example 1:

 Input: 6
 Output: true
 Explanation: 6 = 2 × 3
 Example 2:

 Input: 8
 Output: true
 Explanation: 8 = 2 × 2 × 2
 Example 3:

 Input: 14
 Output: false
 Explanation: 14 is not ugly since it includes another prime factor 7.
 Note:

 1 is typically treated as an ugly number.
 Input is within the 32-bit signed integer range: [−231,  231 − 1].

 */
public class UglyNumber {
    public boolean isUgly(int num) {
        if(num==0){
            return false;
        }
        if (num == 1) {
            return true;
        }
        if (num % 30 == 0) {
            return isUgly(num / 30);
        }
        if (num % 15 == 0) {
            return isUgly(num / 15);
        }
        if (num % 10 == 0) {
            return isUgly(num / 10);
        }
        if (num % 6 == 0) {
            return isUgly(num / 6);
        }
        if (num % 5 == 0) {
            return isUgly(num / 5);
        }
        if (num % 3 == 0) {
            return isUgly(num / 3);
        }
        return num % 2 == 0 && isUgly(num / 2);
    }
}
