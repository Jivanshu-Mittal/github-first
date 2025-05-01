import java.util.*;
public class Exam {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
            movezereos(nums, sc);
        }
    
        // Move all zeroes to the end of the array
        public static void movezereos(int[] nums, Scanner sc) {
            int k = 0, n = nums.length;
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            for (int i = 0; i < n; ++i) {
                if (nums[i] != 0) {
                    int t = nums[i];
                    nums[i] = nums[k];
                    nums[k++] = t;
                }
            }
    }
}
