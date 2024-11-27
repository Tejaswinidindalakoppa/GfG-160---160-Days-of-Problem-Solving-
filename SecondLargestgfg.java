class SecondLargestgfg {
    public int getSecondLargest(int[] arr) {
        int m1 = -1, m2 = -1;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num > m1) {
                m2 = m1;
                m1 = num;
            } else if (num > m2 && num != m1) {
                m2 = num;
            }
        }
        return m2;
    }

    public static void main(String[] args) {
        SecondLargestgfg slg = new SecondLargestgfg();
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println("Second Largest: " + slg.getSecondLargest(arr));
    }
}
