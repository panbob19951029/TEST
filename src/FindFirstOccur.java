import java.util.HashMap;

/**
 * @author b-p
 * @version 1.0
 * @date 2020/8/6 11:45
 */
public class FindFirstOccur
{
    public static void main(String[] args) {
        String s ="abcdefgabcdef";
        HashMap<Character,Boolean> dic =new HashMap<>();
        for (char c: s.toCharArray()
             ) {
            dic.put(c,!dic.containsKey(c));System.out.println(dic);

        }
        System.out.println(dic);
        for (char c :s.toCharArray())
            if (dic.get(c)) System.out.println(c);

    }
}
