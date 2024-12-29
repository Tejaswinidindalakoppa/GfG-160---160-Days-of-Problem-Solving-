class Solution {
    public List<int[]> mergeOverlap(int[][] intervals) {
        List<int[]> merged = new ArrayList<>();
        if (intervals.length == 0) return merged;

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int[] current = intervals[0];
        merged.add(current);

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= current[1]) {
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                current = intervals[i];
                merged.add(current);
            }
        }

        return merged;
    }
}