
class Solution {
static boolean check(TreeNode ltree , TreeNode rtree){
    //base case//
   
if(ltree==null && rtree == null) return true;
 if(ltree==null || rtree==null) return false;
if(ltree.val != rtree.val) return false;

return check(ltree.left , rtree.right) && check(ltree.right , rtree.left);
}

    public boolean isSymmetric(TreeNode root) {
        boolean ans = check(root.left , root.right)
;
return ans ;        
    }
}