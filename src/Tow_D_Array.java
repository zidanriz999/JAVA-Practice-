//import java.util.Scanner;
import java.util.Arrays;
public class Tow_D_Array {
    public static void main(String[] args) {
//        int [] num={2,3,4,9,87,1};
//        System.out.println("Here the array length:" + num.length);
//        Arrays.sort(num);  //Arrays number small to big
//        System.out.println(Arrays.toString(num));
//        int [][] num2=new int[2][3];
//        num2[0][0]=1;
//        System.out.println(Arrays.deepToString(num2));
//
        int [][] arr= new int [3][3];
        int [][] nums= {
                {1,4,7},
                {2,5,8},
                {3,6,9}
        };
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){

                System.out.print(nums[i][j] + " ");

            }
            System.out.println();

        }



    }
}

//String name = sc.nextLine().trim();