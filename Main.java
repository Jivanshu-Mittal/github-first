// This not just about mainting github repository
// This is about learning Java and improving coding skills




public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        //5-1 using while loop
        for(int i=5; i>0; i--){
            System.out.println(i);
        }
        //5-2 using for loop
        for(int i=5; i>0; i--){
            System.out.println(i);
        }  
         int num = 50; // print primes up to 50

        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;

            // check divisibility from 2 to sqrt(i)
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        } 
        //5-3 using do while loop
        int i = 5;
        do {
            System.out.println(i);
            i--;
        } while (i > 0);  
    }
}