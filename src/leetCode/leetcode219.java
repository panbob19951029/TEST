package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author b-p
 * @version 1.0
 * @date 2020/9/2 12:33
 */
public class leetcode219 {
    public static void main(String[] args) {
        int [] nums={1,3,4,1,0,1};
        int k =1;
        int [] res=new int[nums.length];
        //建立key-value
        Map<Integer,Integer> map = new HashMap<>();
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            //如果不包含则存入
            if (!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }else {
                //包含则说明此数之前已经有了
                //先获取头一次的位置下标，再更改为第二次的下标
                //这样的目的是计算多次重复数据的下标差
                int j=map.get(nums[i]);
                map.put(nums[i],i);
                //下标差存入res
                res[count]= i-j;
                count++;
            }
        }
        System.out.println(Arrays.toString(res));
        //遍历下标差
        for (int j :res){
            if (j<=k&&j!=0) {
                System.out.println("true");
            }
        }
        System.out.println("f");
    }

}
