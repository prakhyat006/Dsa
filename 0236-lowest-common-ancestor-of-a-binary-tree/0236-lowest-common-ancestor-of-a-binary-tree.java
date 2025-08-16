class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode leftlca = lowestCommonAncestor(root.left, p, q);
        TreeNode rightlca = lowestCommonAncestor(root.right, p, q);

        if (leftlca != null && rightlca != null) {
            // If p and q found in different subtrees, root is LCA
            return root;
        }

        // Otherwise return whichever is non-null
        return leftlca != null ? leftlca : rightlca;
    }
}
