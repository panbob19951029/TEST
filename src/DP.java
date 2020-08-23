/**
 * @author b-p
 * @version 1.0
 * @date 2020/8/10 11:20
 */
public class DP {
    public static void main(String[] args) {
        int[] nums= new int[]{-2, 1,-3,4,-1,2,1,-5,-4};
        int res = nums[0];
        for(int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
       System.out.println(res);

    }
}
