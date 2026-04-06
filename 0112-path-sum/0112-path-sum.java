
class Solution {
    private static boolean helper(TreeNode root , int target){
        //handling all the base case//

        if(root == null) return false;
        if(root!=null && root.left ==null && root.right ==null) {
            if(root.val ==target) return true;
        }
        return helper(root.left,target-root.val) || helper(root.right , target-root.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
  return helper(root,targetSum);  }
}