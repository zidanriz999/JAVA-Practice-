import java.util.Scanner;
import java.util.Arrays;
public class Tow_D_Array {
    public static void main(String[] args) {
        int [] num={2,3,4,9,87,1};
        System.out.println("Here the array length:" + num.length);
        Arrays.sort(num);  //Arrays number small to big
        System.out.println(Arrays.toString(num));
        int [][] num2=new int[2][3];
        num2[0][0]=1;
        System.out.println(Arrays.deepToString(num2));
    }
}

//String name = sc.nextLine().trim();