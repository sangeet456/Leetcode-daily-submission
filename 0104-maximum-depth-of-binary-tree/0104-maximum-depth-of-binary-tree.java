
class Solution {
static int height(TreeNode root){
    if(root==null) return 0;
    int lh = height(root.left);
    int rh = height(root.right);
    return 1+Math.max(lh,rh);
}

    public int maxDepth(TreeNode root) {
        return height(root);
        
    }
}