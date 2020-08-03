import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author b-p
 * @version 1.0
 * @date 2020/8/3 14:47
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 * 方法一：用StringBuilder
 * 方法二：s.replace(" ", "%20")
 */
public class CharReplace {
    public static void main(String[] args) {
      /*  Scanner sca =new Scanner(System.in);
        sca.useDelimiter("\n");//因为scanner默认空格和回车都会结束，所以改变指令
        System.out.print("请输入：");
        String s=sca.next();
        System.out.println(sca.next());*/
        String s="we are ss.";
        StringBuilder stringBuilder =new StringBuilder();
        System.out.println(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(c);
            }

        }
        System.out.println(stringBuilder.toString());
    }
}
