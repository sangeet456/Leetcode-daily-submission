
class Solution {
      
      static int size(TreeNode root){
        if(root == null) return 0;
        else{
            return 1+ Math.max(size(root.left) , size(root.right)); 
        }
      }
    public int maxDepth(TreeNode root) {
        return size(root);
        
    }
}