class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        int lh = minDepth(root.left);
        int rh = minDepth(root.right);

        
        if (root.left == null || root.right == null) {
            return 1 + Math.max(lh, rh);
        }

        return 1 + Math.min(lh, rh);
    }
}