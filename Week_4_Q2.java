import java.util.*;

public class Problem5 {

    // Linear Search (first occurrence)
    public static int linearFirst(String[] arr, String target) {
        int comparisons = 0;
        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            if (arr[i].equals(target)) {
                System.out.println("Linear comparisons: " + comparisons);
                return i;
            }
        }
        System.out.println("Linear comparisons: " + comparisons);
        return -1;
    }

    // Binary Search (find one occurrence)
    public static int binarySearch(String[] arr, String target) {
        int low = 0, high = arr.length - 1;
        int comparisons = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            comparisons++;

            if (arr[mid].equals(target)) {
                System.out.println("Binary comparisons: " + comparisons);
                return mid;
            } else if (arr[mid].compareTo(target) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Binary comparisons: " + comparisons);
        return -1;
    }

    // Count occurrences
    public static int countOccurrences(String[] arr, String target) {
        int count = 0;
        for (String s : arr) {
            if (s.equals(target)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String[] arr = {"accA", "accB", "accB", "accC"};
        Arrays.sort(arr); // required for binary

        int index = linearFirst(arr, "accB");
        System.out.println("Linear first index: " + index);

        int bIndex = binarySearch(arr, "accB");
        System.out.println("Binary index: " + bIndex);

        System.out.println("Count: " + countOccurrences(arr, "accB"));
    }
}