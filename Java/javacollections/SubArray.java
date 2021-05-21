public class SubArray {

    public static int maxInt(int[] arr, int k) {
        int sum = 0;
        int ans = 0;

        int start = 0;
        int end = 0;

        while (end < arr.length) {
            if (end - start >= k) {
                sum -= arr[start];
                start++;
            }

            sum += arr[end];
            end++;

            ans = Math.max(ans, sum);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] num1 = { 3, 11, 42, 56, 6, 8, 63, 22, 11 };
        System.out.println("Biggest subarray sum is: " + maxInt(num1, 3));
    }
}
