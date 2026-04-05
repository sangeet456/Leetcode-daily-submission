
class Solution {
static boolean check ( TreeNode p , TreeNode q){
     if(p==null && q == null ) return true; 
         if(p==null || q == null) return false;
    if(p.val != q .val ) return false;

   
 boolean isleftsame= check(p.left, q.left);
 boolean isrightsame = check(p.right,q.right);
 return isleftsame && isrightsame ;
}


    public boolean isSameTree(TreeNode p, TreeNode q) {
     return check(p,q);   
    }
}