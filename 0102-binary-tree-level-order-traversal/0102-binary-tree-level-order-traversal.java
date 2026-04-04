
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        //base case//
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int size = q.size();
              List<Integer> temp = new ArrayList<>();
            for(int i =0 ;i<size ; i++){
   
                TreeNode curr = q.remove();
                temp.add(curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);

            }
  res.add(temp);          
        }
        return res;
    }
}