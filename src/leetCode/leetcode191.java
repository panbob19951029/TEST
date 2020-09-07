package leetCode;

/**
 * @author b-p
 * @version 1.0
 * @date 2020/9/5 18:07
 */
public class leetcode191 {
    public static void main(String[] args) {
        int n=11;
        int c=0;
        for (int i = 0; i < 32; i++) {
            if(((n>>>i)&1)==1){
                c++;
            }
        }
    System.out.println(c);
    }

}
