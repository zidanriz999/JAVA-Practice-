package JAVA_OOP;

public class Mathods_practice {
    //problem 1

    static void mul(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d X %d = %d\n",n,i,n*i);
        }
    }


    //problem 2
    static void pattern(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        mul(9);
        pattern(4);
    }

}
