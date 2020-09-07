package leetCode;

import java.util.Arrays;

/**
 * @author b-p
 * @version 1.0
 * @date 2020/9/4 11:13
 */
public class leetcode665dizeng {
    public static void main(String[] args) {
        int[] nums={2,1,4,5,0,6};
        int count =0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]>nums[i]){
                nums[i-1]=nums[i];
                System.out.println(Arrays.toString(nums));
            }else if (i>=2&& nums[i-2] > nums[i]){
                nums[i] = nums[i - 1];
                System.out.println(Arrays.toString(nums));
            }
            }
        }

    }

