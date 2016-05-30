package leetcode;

/**
 * Created by Administrator on 2016/5/27 0027.
 */
public class Move_Zeroes
{

	/*Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
	For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
*/

    public class Solution {
        public void moveZeroes(int[] nums) {
            int zeros=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0)
                    zeros++;//计算有几个零
                else
                    nums[i-zeros]=nums[i];//将遇到的不是零的数前进之前零的个数的位
            }

            for(int i=nums.length-zeros;i<nums.length;i++){
                nums[i]=0;//在后面补上零
            }

        }
    }
}
