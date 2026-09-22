class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];

        Deque<Integer> stk = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!stk.isEmpty() && temperatures[i] > temperatures[stk.peek()]) {
                int prevIdx = stk.pop();
                res[prevIdx] = i - prevIdx;
            }
            stk.push(i);
        }
        return res;
    }
}