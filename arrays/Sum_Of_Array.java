// Problem: Find the Sum of Elements entered by the user
// Input: User enters number of elements and the elements
// Approach: Traverse the inputs and keep adding them to a sum variable
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.Scanner;

class Sum_Of_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Elements: ");
        int n = sc.nextInt();

        int sum = 0;

        System.out.println("Enter Elements:");

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            sum += num;
        }

        System.out.println("Sum of Elements: " + sum);

        sc.close();
    }
}
