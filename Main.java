import java.util.Scanner;

public class Main{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
       /*  Arrays starting point
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of the array:");
            int n=sc.nextInt();
           int[] arr=new int[n];
            System.out.println("Enter the elements of array:");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            if (n<2){
                System.out.println("Array must of more than 2 elements.");
            }
            else{
                int first=Integer.MIN_VALUE;
                int second=Integer.MIN_VALUE;
                for(int i=0;i<n;i++){
                    if(arr[i]>first){
                        second=first;
                        first=arr[i];
                    }
                    else if(arr[i] >second && arr[i]!=first){
                        second=arr[i];
                    }
                }
                if(second==Integer.MIN_VALUE){
                    System.out.println("There is no second largest element in the array.");
                }
                else{
                    System.out.println("The second largest element in the array is: "+second);
                }
            }  */     
        // Linkedlist starting point
        Scanner sc=new Scanner(System.in);
        System.out.println("print works");
         int size =sc.nextInt();;
         node head=null;
         node tail=null;
        class node {
            int data;
            node next;
            node(int data) {
                this.data = data;
                this.next = null;
            }
        }
    }
}