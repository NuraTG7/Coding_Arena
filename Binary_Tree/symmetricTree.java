class Solution {
    public boolean same(TreeNode a, TreeNode b){
        if(a == null && b == null){
            return true;
        }
        if(a == null || b == null){
            return false;
        }
        if(a.val != b.val){
            return false;
        }

        return same(a.left, b.right)&&same(a.right, b.left);
    }
    public boolean isSymmetric(TreeNode a) {
        
        return same(a.left, a.right);
    }
}