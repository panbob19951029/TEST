package leetCode;

/**
 * @author b-p
 * @version 1.0
 * @date 2020/9/5 10:13
 */
public class tonghua {
    String s=new String("good");
    char[] ch ={'a','b','c'};
    public static void main(String[] args) {

        tonghua ex =new tonghua();
        ex.change(ex.s,ex
        .ch);
        System.out.println(ex.s+"and");
        System.out.println(ex.ch);

    }


    private void change(String s ,char ch[]) {
     s="test ok";
     ch[0]='g';

    }

}
