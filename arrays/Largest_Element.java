// Problem: Find the largest element in an array
// Input: User enters array size and elements
// Approach: Traverse the array and keep updating the maximum value
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.Scanner;

class LargestElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest element: " + max);

        sc.close();
    }
}
