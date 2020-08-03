import java.util.Scanner;

/**
 * @author b-p
 * @version 1.0
 * @date 2020/8/3 16:36
 * //https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/solution/mian-shi-ti-10-ii-qing-wa-tiao-tai-jie-wen-ti-dong/
 */
public class JumpTaijie {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
            int a = 1, b = 1, sum;
            for(int i = 0; i < n; i++){
                sum = (a + b) % 1000000007;
                a = b;
                b = sum;
            }
            System.out.println(a);;


    }

  }
