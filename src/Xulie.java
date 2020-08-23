import java.util.Scanner;
public class Xulie{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int q=sc.nextInt();
        int [] nums = new int[n];
        int count = 0;
        for(int i = 0; i< n ; i++){
            nums[i]=sc.nextInt();
        }

        for(int i = 0; i< q ; i++ ){
            int x=sc.nextInt();
            for (int j = 0; j < n; j++) {
                if( x<= nums[j]) count++;
            }
            System.out.println(count);
            count=0;
        }


    }
}
