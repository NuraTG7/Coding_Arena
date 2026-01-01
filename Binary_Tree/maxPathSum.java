class Solution {
    int maxValue;
    int maxPathDown(TreeNode node){
        if(node == null) return 0;
        int left = Math.max(maxPathDown(node.left), 0);
        int right = Math.max(maxPathDown(node.right), 0);

        maxValue = Math.max(maxValue, left+right+node.val);
        return node.val+Math.max(left, right);
    }
    public int maxPathSum(TreeNode root) {
        maxValue = Integer.MIN_VALUE;
        maxPathDown(root);
        return maxValue;
    }
}