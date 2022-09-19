class Solution {
    static List<Integer> leftSmaller(int n, int a[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(-1);
        int size = 1;
        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] < a[i]) {
                    result.add(a[j]);
                    size++;
                    break;
                }

            }
            if (size > i) {
                continue;
            } else {
                result.add(-1);
                size++;
            }
        }

        return result;
    }
}