
class Solution {
    public int findBottomLeftValue(TreeNode root) {
        //BFS og METHOD//
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int result = root.val;
        while(q.size()>0){
            int size = q.size();
            for(int i=0;i<size;i++){
                    TreeNode node = q.poll();
                if(i==0){
                    result = node.val;
                }
                if(node.left!=null) q.add(node.left);
                if(node.right !=null) q.add(node.right);
            }
        }
        return result;
        
    }
}