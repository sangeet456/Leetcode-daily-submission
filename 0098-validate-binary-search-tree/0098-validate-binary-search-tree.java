class Solution {
static boolean bsthkinahi(TreeNode root,TreeNode min , TreeNode max){
    if(root == null) return true;
        if(min!=null && root.val <= min.val) return false;
    if(max!=null && root.val >= max.val) return false;

return bsthkinahi(root.left,min,root) && bsthkinahi(root.right,root,max);


}

    public boolean isValidBST(TreeNode root) {
        return bsthkinahi(root ,null , null);
    }
}