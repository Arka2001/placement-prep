package Recursion.Easy;

public class sum_triangle_from_array {

    /**
     * Given an array of integers, print a sum triangle from it such that the first level has all array elements. 
     * From then, at each level number of elements is one less than the previous level and 
     * elements at the level is be the Sum of consecutive two elements in the previous level. 
     * 
     * Input : A = {1, 2, 3, 4, 5}
        Output : [48]
                [20, 28] 
                [8, 12, 16] 
                [3, 5, 7, 9] 
                [1, 2, 3, 4, 5] 

        Explanation :
        Here,   [48]
                [20, 28] -->(20 + 28 = 48)
                [8, 12, 16] -->(8 + 12 = 20, 12 + 16 = 28)
                [3, 5, 7, 9] -->(3 + 5 = 8, 5 + 7 = 12, 7 + 9 = 16)
                [1, 2, 3, 4, 5] -->(1 + 2 = 3, 2 + 3 = 5, 3 + 4 = 7, 4 + 5 = 9)
     */

     static void solution(int n, int[] arr) {

        // Base condition, if n == 1, there shall be no recursive call. Only the element will be printed
        if(n==1) {
            System.out.print(arr[0]);

            return;
        }

         // Print the numbers
         for(int i=0;i<n;i++) {
             System.out.print(arr[i] + " ");
         }
         System.out.print("\n");

         // Create the new array

         int k = 0;

         for(int i=0;i<n-1;i++) {
             arr[k++] = arr[i] + arr[i+1];
         }

         // recursive call
         solution(n-1, arr);

     }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        solution(arr.length, arr);
    }
}
