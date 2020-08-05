import java.util.Arrays;
import java.util.Scanner;

/**
 * @author b-p
 * @version 1.0
 * @date 2020/8/3 12:00
 */
public class Test {
    public static void main(String[] args) {
        //二维数组
       // erwei();
        reverseWords();
    }

    private static void reverseWords() {
        String s =" hello    world ";

                String[] strs = s.trim().split(" "); // 删除首尾空格，用空格分割字符串

                StringBuilder res = new StringBuilder();
                for(int i = strs.length - 1; i >= 0; i--) { // 倒序遍历单词列表
                    if(strs[i].equals("")) continue; // 遇到空单词则跳过
                    res.append(strs[i] + " "); // 将单词拼接至 StringBuilder
                }
               System.out.println(res.toString().trim()) ; // 转化为字符串，删除尾部空格，并返回



    }

    private boolean findSame(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length, columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                while (matrix[i][j] == target) {
                    return true;
                }

            }

        }
        return false;
    }
    private static void erwei() {
        Scanner sc=new Scanner(System.in);
        int numCount=sc.nextInt(); // 第一行输入二维数组的个数
        int[][] numArrs=new int[numCount][];
        for(int i=0;i<numCount;i++){
            int l=sc.nextInt(); //第二行输入第一维元素的个数；//第四行输入第二维元素的个数
            numArrs[i]=new int[l];
            for(int j=0;j<l;j++){
                numArrs[i][j]=sc.nextInt();//第三行输入第一维的元素；        //第五行输入第二维的元素
            }

        }
             System.out.println(Arrays.deepToString(numArrs));
    }
}

