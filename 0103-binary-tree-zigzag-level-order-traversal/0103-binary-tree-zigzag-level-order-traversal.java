
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        //basecase//
        if(root==null) return res;
          boolean ltor = true;
        Queue<TreeNode> q = new LinkedList<>();
      q.add(root);
      while(q.size()>0){
        int size = q.size();
        List<Integer> temp = new ArrayList<>();
        for(int i =0 ;i < size;i++){
            TreeNode curr = q.poll();

            if(ltor){
                temp.add(curr.val);
            }
            else{
                temp.add(0,curr.val);
            }
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
        res.add(temp);
        ltor = !ltor;
      }
        return res;
    }
}