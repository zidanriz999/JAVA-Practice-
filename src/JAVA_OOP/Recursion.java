package JAVA_OOP;

public class Recursion {
    // A function in java can call itself such calling of funtion by itself is called recursion

    static int factorial(int n){
        if(n==0|| n==1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }


    public static void main(String[] args) {
        int x= 5;
        System.out.println("The value of factorialn is : "+factorial(x));
    }

}
