
class Solution {
static TreeNode lca(TreeNode root , TreeNode p, TreeNode q){
    if(root == null) return null;
    if(root.val==p.val || root.val ==q.val ) return root;
    TreeNode leftlca = lca(root.left,p,q);
    TreeNode rightlca = lca(root.right,p,q);
if(leftlca!=null && rightlca!=null) return root;
else if(leftlca!=null) return leftlca;

return rightlca;
  


}

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lca(root,p,q);
        
    }
}