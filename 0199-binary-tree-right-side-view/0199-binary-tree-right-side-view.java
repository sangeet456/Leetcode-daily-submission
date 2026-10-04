
class Solution {
    static int level ( TreeNode root){
    if(root==null) return 0;
    int lh = level(root.left);
    int rh = level(root.right);
    return 1+Math.max(lh,rh);
}

static void preorder(TreeNode root , int level , int arr[] ){
        if(root==null) return ;
        arr[level]= root.val;
        preorder(root.left,level+1,arr);
        preorder(root.right,level+1,arr);


}
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        int n = level(root);
        int arr[]=new int[n];
        preorder(root,0,arr);
        for(int ele : arr){
            ans.add(ele);
        }
    
  return ans;  }
}