
class Solution {
static int height(TreeNode root){
    if(root==null) return 0;
    int lh = height(root.left);
    int rh = height(root.right);
    return 1+Math.max(lh,rh);
}

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int l = height(root.left);
        int r= height(root.right);
        int diff=Math.abs(l-r);
        if(diff>1) return false;

        boolean lb = isBalanced(root.left);
        boolean rb = isBalanced(root.right);
        return lb && rb;
    }
}