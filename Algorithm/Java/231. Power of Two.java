/*
* @Author: WuLC
* @Date:   2017-07-05 10:30:05
* @Last Modified by:   WuLC
* @Last Modified time: 2017-07-05 10:30:51
* @Email: liangchaowu5@gmail.com
*/


// bit manipulation, lowbit
// pay attention to negative numbers and 0
public class Solution 
{
    public boolean isPowerOfTwo(int n)
    {
        if (n <= 0) return false;
        else return  (((n & (-n)) ^ n) == 0);
    }
}