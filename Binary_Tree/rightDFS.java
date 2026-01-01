class Solution {
    public void rightDFS(TreeNode node, int leval, List<Integer> lst){
        if(node == null) return;
        if(lst.size() == leval){
            lst.add(node.val);            
        }
        rightDFS(node.right, leval+1, lst);
        rightDFS(node.left, leval+1, lst);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        rightDFS(root, 0, lst);
        return lst;
    }
}