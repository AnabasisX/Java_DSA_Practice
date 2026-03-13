// Problem: Count Number of Even & Odd Elements in an array
// Input: User enters number of elements and the elements
// Approach: Traverse the inputs and count even and odd numbers
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.Scanner;

class Count_Even_Odd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Elements: ");
        int n = sc.nextInt();

        int even = 0, odd = 0;

        System.out.println("Enter Elements:");

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();

            if(num % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even Elements: " + even);
        System.out.println("Odd Elements: " + odd);

        sc.close();
    }
}
