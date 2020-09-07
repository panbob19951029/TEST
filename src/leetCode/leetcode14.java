package leetCode;

/**
 * @author b-p
 * @version 1.0
 * @date 2020/9/2 17:01
 *
编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。

示例 1:

输入: ["flower","flow","flight"]
输出: "fl"
 */
public class leetcode14 {
    public static void main(String[] args) {
        String[] strs ={"flower","flow","flight"};
        System.out.println(strs[0]);
        String ans=strs[0];
        for (int i = 1; i < strs.length; i++) {
            //定义在外面为了ans.substring(0,j);
            int j=0;
            for (; j <ans.length()&&j<strs[i].length() ; j++) {
                if(ans.charAt(j)!=strs[i].charAt(j))
                    break;
            }
            ans=ans.substring(0,j);

        } System.out.println(ans);
    }
}
