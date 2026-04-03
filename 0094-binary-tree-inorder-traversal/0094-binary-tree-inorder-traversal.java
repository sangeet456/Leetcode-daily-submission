//inorder tree travesral using recursion//
class Solution {
static List<Integer> inorder(TreeNode root){
    List<Integer> result = new ArrayList<>();
    //base case//
    if(root==null) return result;
    result.addAll(inorder(root.left));
    result.add(root.val);
    result.addAll(inorder(root.right));


    return result;
}

    public List<Integer> inorderTraversal(TreeNode root) {
        
    return inorder(root);}
}