
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return l;
        q.add(root);
        while(q.size()>0){
            int size = q.size();
            List<Integer>ans = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
                ans.add(node.val);

                if(node.left !=null) q.add(node.left);
                if(node.right!=null)q.add(node.right);
            }
            l.add(ans);
        }
        
   return l; }
}