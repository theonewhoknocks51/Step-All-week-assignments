import java.util.*;

class Client {
    String name;
    int riskScore;
    double balance;

    Client(String name, int riskScore, double balance) {
        this.name = name;
        this.riskScore = riskScore;
        this.balance = balance;
    }

    public String toString() {
        return name + ":" + riskScore;
    }
}

public class Problem2 {

    // Bubble Sort (ascending risk)
    public static void bubbleSort(Client[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].riskScore > arr[j + 1].riskScore) {
                    Client temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Insertion Sort (descending risk + balance)
    public static void insertionSort(Client[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Client key = arr[i];
            int j = i - 1;

            while (j >= 0 && (arr[j].riskScore < key.riskScore ||
                    (arr[j].riskScore == key.riskScore &&
                     arr[j].balance < key.balance))) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Top 10 risky clients
    public static void topRisk(Client[] arr) {
        System.out.println("Top Risk Clients:");
        for (int i = 0; i < Math.min(10, arr.length); i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Client[] arr = {
            new Client("C", 80, 2000),
            new Client("A", 20, 5000),
            new Client("B", 50, 3000)
        };

        bubbleSort(arr);
        System.out.println("Bubble Sort:");
        System.out.println(Arrays.toString(arr));

        insertionSort(arr);
        System.out.println("Insertion Sort:");
        System.out.println(Arrays.toString(arr));

        topRisk(arr);
    }
}