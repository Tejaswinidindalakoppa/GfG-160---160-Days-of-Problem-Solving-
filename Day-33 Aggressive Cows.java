class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int low = 1, high = stalls[stalls.length - 1] - stalls[0], result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = 1, lastPlaced = stalls[0];
            for (int i = 1; i < stalls.length; i++) {
                if (stalls[i] - lastPlaced >= mid) {
                    count++;
                    lastPlaced = stalls[i];
                }
            }
            if (count >= k) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}