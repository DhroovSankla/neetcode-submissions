class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stk = new ArrayDeque<>();
        TreeNode curr = root;

        while (curr != null || !stk.isEmpty()) {
            while (curr != null) {
                stk.push(curr);
                curr = curr.left;
            }

            curr = stk.pop();
            k--;

            if (k == 0) {
                return curr.val;
            }

            curr = curr.right;
        }

        return -1;
    }
}
