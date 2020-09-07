package sougou;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author b-p
 * @version 1.0
 * @date 2020/9/3 20:07
 */
public class password {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int M=scanner.nextInt();
        int [] res =new  int[N];
        for (int i =0 ;i<M ;i++){
            int first1=scanner.nextInt();
            int first2=scanner.nextInt();
            res[first1]=i+1;
            res[first2]=i+1;
            System.out.println(Arrays.toString(res));
        }
        long password=0;
        for (int i = 1; i < res.length; i++) {
            password+=res[i]*i;
        }
        System.out.println(password % 100000009 );
    }
}
