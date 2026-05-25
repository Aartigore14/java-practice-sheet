package Arrays;

public class TwoSum {
    static void main() {
        System.out.println("Two Sum");
    }

    public static boolean twoSum(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (arr[i] + arr[j] == target)
                    return true;
            }
        }
        return false;
    }
}

