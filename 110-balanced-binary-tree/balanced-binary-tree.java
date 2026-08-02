
class Solution {

static int height(TreeNode root){
    if(root==null) return 0;

return 1+ Math.max(height(root.left),height(root.right));    
}

    public boolean isBalanced(TreeNode root) {

        if(root==null) return true;
     int l = height(root.left);
     int r = height(root.right);
        int diff = Math.abs(l-r);
        if(diff>1){
            return false;
        }
        boolean leftok = isBalanced(root.left);
        if(leftok==false) return false;
        
        boolean rightok = isBalanced(root.right);
        if(rightok==false) return false;
  return true;  }
}