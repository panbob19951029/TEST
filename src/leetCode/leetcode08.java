package leetCode;

import java.util.Arrays;

/**
 * @author b-p
 * @version 1.0
 * @date 2020/8/31 22:42
 * 去除字符中所有除数字以外的数
 * 输入: "4193 with words"
 * 输出: 4193
 * 解释: 转换截止于数字 '3' ，因为它的下一个字符不为数字。
 * 示例 4:
 *
 * 输入: "words and 987"
 * 输出: 0
 * 解释: 第一个非空字符是 'w', 但它不是数字或正、负号。
 *      因此无法执行有效的转换。
 */
public class leetcode08 {
    public static void main(String[] args) {
        String s= "  -2147483649 wih 2 words";
        String s1=s.trim();
        char[] chars=s1.toCharArray();
        System.out.println(chars);
        if(chars.length==0) System.out.println("0");
        int idx=0;
        boolean negative = false;
        if(chars[idx]=='+'){
            //遇见符号位，向前进一位
            idx++;
        }else if(chars[idx]=='-'){
            negative=true;
            idx++;
        }else if(!Character.isDigit(chars[idx])){
            //不是数字
            System.out.println("0");
        }
        int ans =0;
        //在起始点遍历到末尾，并且全是数字,碰见数字则跳出循环
        while (idx < chars.length && Character.isDigit(chars[idx])) {
            int digit = chars[idx] - '0';//减去‘0’或48得到真实数字
            //判断是否大于最大32位整数
            if(!negative &&(ans>214748364 ||(ans==214748364 && digit>=7))) {
                System.out.println(2147483647); ;
            }
            //判断是否小于 最小32位整数
            if(negative &&(-ans<-214748364 || (-ans==-214748364 && digit>=8))) {
                System.out.println(-2147483648);
            }

            ans = ans * 10 + digit;//将数字加起来
            idx++;//下标向前进
        }
          System.out.println(negative? -ans : ans);
    }

}
