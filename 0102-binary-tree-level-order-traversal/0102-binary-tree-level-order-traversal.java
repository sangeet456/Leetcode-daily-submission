
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(queue.size()>0){
            int s = queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode curr = queue.remove();
                level.add(curr.val);
                if(curr.left!=null) queue.add(curr.left);
                if(curr.right!=null) queue.add(curr.right);
            }
            res.add(level);
        } 
        
return res;    }
}