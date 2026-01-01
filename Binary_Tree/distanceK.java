class Solution {

    public void markParents(TreeNode root, Map<TreeNode, TreeNode> parentNode) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();

            if (node.left != null) {
                parentNode.put(node.left, node);
                q.offer(node.left);
            }
            if (node.right != null) {
                parentNode.put(node.right, node);
                q.offer(node.right);
            }
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        Map<TreeNode, TreeNode> parentNode = new HashMap<>();
        markParents(root, parentNode);

        Map<TreeNode, Boolean> visited = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(target);
        visited.put(target, true);

        int level = 0;

        while (!q.isEmpty()) {

            if (level == k) break;

            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();

                if (curr.left != null && !visited.containsKey(curr.left)) {
                    q.offer(curr.left);
                    visited.put(curr.left, true);
                }
                if (curr.right != null && !visited.containsKey(curr.right)) {
                    q.offer(curr.right);
                    visited.put(curr.right, true);
                }

                TreeNode parent = parentNode.get(curr);
                if (parent != null && !visited.containsKey(parent)) {
                    q.offer(parent);
                    visited.put(parent, true);
                }
            }
            level++;
        }

        List<Integer> result = new ArrayList<>();
        while (!q.isEmpty()) {
            result.add(q.poll().val);
        }
        return result;
    }
}
