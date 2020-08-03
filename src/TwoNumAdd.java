import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author b-p
 * @version 1.0
 * @date 2020/7/30 14:50
 * 实现一个加法计数器，要求满足是任意大小的两个整数相加
 * 输入描述：任意大小的两个整数
 * 输出描述：相加的结果
 * 输入示例：123456789987654321 987654321123456789
 * 输出示例：1111111111111111110
 * 也可用字符串做
 */
public class TwoNumAdd {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String num1 = scanner.next();
            String num2 = scanner.next();
            int i = num1.length() - 1, j = num2.length() - 1, add = 0;
            StringBuffer ans = new StringBuffer();
            while (i >= 0 || j >= 0 || add != 0) {
                int x = i >= 0 ? num1.charAt(i) - '0' : 0;
                int y = j >= 0 ? num2.charAt(j) - '0' : 0;
                int result = x + y + add;
                ans.append(result % 10);
                add = result / 10;
                i--;
                j--;
            }
            // 计算完以后的答案需要翻转过来
            ans.reverse();
            System.out.println(ans.toString());
}
}