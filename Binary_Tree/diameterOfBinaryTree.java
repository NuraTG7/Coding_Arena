class Solution {
    int diameter = 0;

    int findHeight(TreeNode node) {
        if (node == null) return 0;

        int lh = findHeight(node.left);
        int rh = findHeight(node.right);

        // update diameter
        diameter = Math.max(diameter, lh + rh);

        return 1 + Math.max(lh, rh);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        findHeight(root);
        return diameter;
    }
}
