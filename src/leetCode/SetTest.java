package leetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author b-p
 * @version 1.0
 * @date 2020/9/3 17:59
 */
public class SetTest {
    public static void main(String[] args) {
        int []nums={11,22,33,1,2,3,4,5,6,5,4,3,2,1};
        Arrays.sort(nums);
        Set<Integer> set =new LinkedHashSet<>();
        for (int n:nums){
            set.add(n);
        }
       System.out.println(set);
    }
}
