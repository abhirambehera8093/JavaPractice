public class MaximumInArray {
    
    /**
     * Finds the maximum number in a given array
     * @param arr the input array of integers
     * @return the maximum value in the array
     * @throws IllegalArgumentException if array is null or empty
     */
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    /**
     * Finds the maximum number using Java Streams (Java 8+)
     * @param arr the input array of integers
     * @return the maximum value in the array
     * @throws IllegalArgumentException if array is null or empty
     */
    public static int findMaxUsingStream(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        return java.util.Arrays.stream(arr).max().orElseThrow();
    }
    
    /**
     * Main method to demonstrate finding maximum in an array
     */
    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = {10, 5, 25, 3, 15};
        System.out.println("Array: " + java.util.Arrays.toString(arr1));
        System.out.println("Maximum using loop: " + findMax(arr1));
        System.out.println("Maximum using stream: " + findMaxUsingStream(arr1));
        
        System.out.println();
        
        // Test case 2
        int[] arr2 = {-5, -10, -3, -20};
        System.out.println("Array: " + java.util.Arrays.toString(arr2));
        System.out.println("Maximum using loop: " + findMax(arr2));
        System.out.println("Maximum using stream: " + findMaxUsingStream(arr2));
        
        System.out.println();
        
        // Test case 3
        int[] arr3 = {100};
        System.out.println("Array: " + java.util.Arrays.toString(arr3));
        System.out.println("Maximum using loop: " + findMax(arr3));
        System.out.println("Maximum using stream: " + findMaxUsingStream(arr3));
    }
}
