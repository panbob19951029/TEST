
import java.util.Scanner;

/**
 * @author b-p
 * @version 1.0
 * @date 2020/8/7 9:49
 */
public class GradeCount {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("输入学生个数：");
        int n=sc.nextInt();
        int[] RS =new  int[n];
        int count=0;


        for (int i = 0; i < RS.length; i++) {
            System.out.print("第"+(i+1)+"位成绩为：");
             RS[i]= sc.nextInt();

        }
        System.out.print("查询几个学生：");
        int q=sc.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.print("你希望查询第几个同学：");

            int x=sc.nextInt()-1;
            while (x<0||x>4){
                System.out.println("error");
                x=sc.nextInt()-1;
            }
            int chaxun =RS[x]; //查询第几位同学

            for (int j=0;j<n;j++) {
                if (chaxun >=RS[j]) count++;
            }

            System.out.println("第"+(x+1)+"位同学分数超过"+(String.format("%.6f",(count-1)*100.0/n))+"%");

            count =0;
        }
    }

}
