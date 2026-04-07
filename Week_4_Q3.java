import java.util.*;

public class Problem6 {

    // Linear Search
    public static boolean linearSearch(int[] arr, int target) {
        int comparisons = 0;
        for (int num : arr) {
            comparisons++;
            if (num == target) {
                System.out.println("Found (Linear), comparisons: " + comparisons);
                return true;
            }
        }
        System.out.println("Not Found (Linear), comparisons: " + comparisons);
        return false;
    }

    // Binary Search (floor)
    public static int floor(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] <= target) {
                result = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    // Binary Search (ceiling)
    public static int ceiling(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= target) {
                result = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 50, 100};

        linearSearch(arr, 30);

        System.out.println("Floor of 30: " + floor(arr, 30));
        System.out.println("Ceiling of 30: " + ceiling(arr, 30));
    }
}