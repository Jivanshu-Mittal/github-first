import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        //5-1 using while loop
        for(int i=5; i>0; i--){
            System.out.println(i);
        }
        //1-10 using for loop
        for(int i=0; i<11; i++){
            System.out.println("For loop " + i);
        }
        //even numbers using for loop
        for(int i=0; i<21; i+=2){
            System.out.println(i);
        }
        //even odd
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("check if number is even or odd. " + (n % 2 == 0 ? "Even" : "odd"));
    }
}