package leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author b-p
 * @version 1.0
 * @date 2020/9/7 15:22
 */
public class offer48 {
    public static void main(String[] args) {
        tanguo();

        String s="abcdef";
        Map<Character, Integer> dic = new HashMap<>();
        int res = 0, tmp = 0;
        for(int j = 0; j < s.length(); j++) {
            int i = dic.getOrDefault(s.charAt(j), -1); // 获取索引 i
            dic.put(s.charAt(j), j); // 更新哈希表
            tmp = tmp < j - i ? tmp + 1 : j - i; // dp[j - 1] -> dp[j]
            res = Math.max(res, tmp); // max(dp[j - 1], dp[j])
        }
        System.out.println(res);;
        Integer i =100,j=100;
        System.out.println(i==j);
        Integer o=Integer.valueOf(100);
        Integer i1 =100;
        System.out.println(o==i1);
        Integer i2 =128,j2=128;
        System.out.println(i2==j2);
        Integer i12=new Integer(100);
        Integer i13=new Integer(100);
        System.out.println(i==j);

    }

    private static void tanguo() {

    }
}
