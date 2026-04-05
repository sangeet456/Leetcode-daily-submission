
class Solution {
static int maxsum ;
static int solve(TreeNode root){
    if(root == null) return 0;
    int l = solve(root.left);
    int r = solve(root.right);
    int neechehiaccha = l + r + root.val;//1
    int koiekaccha = Math.max(l,r) + root.val;//2
    int rootaccha = root.val;//3
    maxsum = Math.max(maxsum , Math.max(neechehiaccha , Math.max(koiekaccha , rootaccha))); 
//most important part//
return Math.max(koiekaccha,rootaccha);
    }

    public int maxPathSum(TreeNode root) {
       maxsum = Integer.MIN_VALUE;

        solve(root);
        return maxsum;
        
    }
} 