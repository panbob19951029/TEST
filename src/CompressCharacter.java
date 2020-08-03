import java.util.Scanner;

/**
 * @author b-p
 * @version 1.0
 * @date 2020/7/30 14:56
 * 压缩字符串
 * 将任意长度的字符串按下列规则压缩并输出
 * 规则：相同连续的字符，则压缩为“数字个数 + 字符”，如aaabb输出3a2b
 * 输入示例：aabb
 * 输出示例：2a2b
 * 备注：单个不压缩，如abcdba，输入不包含数字和转义字符
 */
public class CompressCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(resolve(s));

    }

    static String resolve(String str) {
        char pre = '\0';//pre='\u0000' 0
        int count = 0;
        StringBuilder result = new StringBuilder();//new 最后print的字符串，用append
        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);//返回指定位置字符
            if (cur == pre) {//
                count++;
            } else {
                if (pre != '\0') {
                    if(count > 1) {
                        result.append(count);
                    }
                    result.append(pre);
                }
                pre = cur;//将pre指指针指向cur的第一个字符，使pre的ASCII码等于输入的第一个字符的码
                count = 1;//如果再比较cur==pre，若有相同则count++，说明有2个相同的字符
            }
        }
        if (pre != '\0') {
            if(count > 1) {
                result.append(count);
            }
            result.append(pre);
        }
        return result.toString();
    }
}
