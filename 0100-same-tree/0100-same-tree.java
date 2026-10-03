
class Solution {

private boolean check( TreeNode p , TreeNode q){
            if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val != q.val) return false;
              boolean isleft = check(p.left,q.left);
              boolean isright = check(p.right,q.right);
              return isleft && isright;

}


    public boolean isSameTree(TreeNode p, TreeNode q) {
return check(p,q);
    }
}