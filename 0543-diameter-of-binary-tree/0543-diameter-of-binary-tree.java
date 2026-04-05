class Solution {
static int height(TreeNode root){
    if(root == null) return 0;
    int leftheight = height(root.left);
    int rightheight = height(root.right);
    return 1+ Math.max(leftheight,rightheight);
}

 static int diameter(TreeNode root){
    if(root == null) return 0;
   int leftdiam = diameter(root.left);
   int rightdiam = diameter(root.right);
   int currdiam = height(root.left) + height(root.right);
   return Math.max(currdiam,Math.max(leftdiam,rightdiam));
 }
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root);
    }
}