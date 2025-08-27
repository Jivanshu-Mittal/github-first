// This not just about mainting github repository
// This is about learning Java and improving coding skills




public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        /*5-1 using while loop
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
        //5-4 using for each loop
        int[] numbers = {5, 4, 3, 2, 1};
        for (int number : numbers) {
            System.out.println(number);
        }
        //5-5 using for each loop with a list
        java.util.List<Integer> numberList = java.util.Arrays.asList(5, 4, 3, 2, 1);
        for (int number : numberList) {
            System.out.println(number);
        }  
        //5-6 using break statement
        for (int j = 5; j > 0; j--) {
            if (j == 3) {
                break; // exit loop when j is 3
            }
            System.out.println(j);
        }
         // Ordered list example
        java.util.List<Integer> orderedList = new java.util.ArrayList<>();
        orderedList.add(5);
        orderedList.add(2);
        orderedList.add(4);
        orderedList.add(1);
        orderedList.add(3);

        // Sort the list in ascending order
        java.util.Collections.sort(orderedList);

        // Print the ordered list
        System.out.println("Ordered List:");
        for (int number : orderedList) {
            System.out.println(number);
        }*/
         // Unordered list of F1 teams
        java.util.List<String> f1Teams = new java.util.ArrayList<>();
        f1Teams.add("Red Bull Racing");
        f1Teams.add("Mercedes");
        f1Teams.add("Ferrari");
        f1Teams.add("McLaren");
        f1Teams.add("Aston Martin");

        System.out.println("Unordered List of F1 Teams:");
        for (String team : f1Teams) {
            System.out.println(team);
        }
    }
}